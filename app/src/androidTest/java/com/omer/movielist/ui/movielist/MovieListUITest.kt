package com.omer.movielist.ui.movielist

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.doesNotExist
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.omer.movielist.R
import com.omer.movielist.data.ApiConstants
import com.omer.movielist.utils.JsonFiles
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MovieListUITest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(MovieListActivity::class.java)

    private lateinit var mockWebServer: MockWebServer

    @get:Rule
    var rule: TestRule = InstantTaskExecutorRule()


    @Before
    @Throws(Exception::class)
    fun setUp() {

        mockWebServer = MockWebServer()
        mockWebServer.start()

        ApiConstants.BASE_URL = mockWebServer.url(ApiConstants.POPULAR_TV_SHOWS).toString()
    }


    @Test
    fun get_movie_list_success_response_test() {

        onView(withId(R.id.progressBar)).check(matches(isDisplayed()))

        Thread.sleep(7000)

        mockWebServer.enqueue(
            MockResponse()
                .setResponseCode(201)
                .setBody(getDummySuccessResponse())
        )

        onView(withId(R.id.rv_movie_list))
            .check(matches(hasDescendant(withText("Fairy Tail"))))

    }

    @Test
    fun recycler_view_click_test() {
        onView(withId(R.id.progressBar)).check(matches(isDisplayed()))

        Thread.sleep(7000)

        mockWebServer.enqueue(
            MockResponse()
                .setResponseCode(201)
                .setBody(getDummySuccessResponse())
        )

        onView(withId(R.id.rv_movie_list))
            .check(matches(hasDescendant(withText("Fairy Tail"))))

        onView(withId(R.id.rv_movie_list))
            .perform(
                RecyclerViewActions
                    .actionOnItemAtPosition<MovieListAdapter.MovieListViewHolder>(0, click())
            )

        onView(withId(R.id.tv_title_detail)).check(matches(withText("Fairy Tail")))


        onView(withId(R.id.tv_title_detail)).check(matches(isDisplayed()))

    }


    @Test
    fun get_movie_list_error_response_test() {

        onView(withId(R.id.progressBar)).check(matches(isDisplayed()))

        ApiConstants.API_KEY = ApiConstants.API_KEY + "--"

        Thread.sleep(7000)
        mockWebServer.enqueue(
            MockResponse()
                .setResponseCode(401)
                .setBody(getDummyErrorResponse())
        )

        onView(withId(R.id.progressBar)).check(doesNotExist())

        val dialogOkBtnString = mActivityTestRule.activity.resources.getString(R.string.text_error_dialog_okey)
        onView(withText(dialogOkBtnString)).check(matches(isDisplayed()))
    }


    fun getDummyErrorResponse(): String {

        return " {\n" +
                "   \"status_code\": 7,\n" +
                "   \"status_message\": \"Invalid API key: You must be granted a valid key.\",\n" +
                "   \"success\": false\n" +
                " }"
    }

    fun getDummySuccessResponse(): String {
        return JsonFiles.getSuccessJsonString()
    }

    @After
    fun tearDown() {

        mockWebServer.shutdown()
    }
}
