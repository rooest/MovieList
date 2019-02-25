package com.omer.movielist.ui.movielist.moviedetail

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.omer.movielist.R
import com.omer.movielist.ui.moviedetail.MovieDetailActivity
import com.omer.movielist.ui.moviedetail.MovieDetailViewModel
import com.omer.movielist.utils.JsonFiles
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MovieDetailUITest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(MovieDetailActivity::class.java, true, true)


    @get:Rule
    var rule: TestRule = InstantTaskExecutorRule()

    private lateinit var movieDetailViewModel: MovieDetailViewModel


    @Before
    @Throws(Exception::class)
    fun setUp() {

        movieDetailViewModel = MovieDetailViewModel()
    }


    @Test
    fun check_views_is_displayed_test() {

        onView(withId(R.id.tv_overview_title))
            .check(matches(isDisplayed()))

        onView(withId(R.id.tv_detail_language))
            .check(matches(isDisplayed()))

        onView(withId(R.id.tv_detail_duration))
            .check(matches(isDisplayed()))

        onView(withId(R.id.tv_vote_count))
            .check(matches(isDisplayed()))

        onView(withId(R.id.tv_vote_rate))
            .check(matches(isDisplayed()))

        onView(withId(R.id.tv_overview_title))
            .check(matches(isDisplayed()))

        onView(withId(R.id.tv_overview))
            .check(matches(isDisplayed()))
    }

    @Test
    fun set_movie_detail_intent() {

        movieDetailViewModel.setIntentResult(JsonFiles.getOneResult())

        Thread.sleep(3000)

        onView(withId(R.id.tv_overview_title))
            .check(matches(isDisplayed()))

        onView(withId(R.id.tv_detail_language)).check(matches(withText("ja")))

    }

}

