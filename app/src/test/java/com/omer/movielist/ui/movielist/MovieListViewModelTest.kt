package com.omer.movielist.ui.movielist

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.google.gson.Gson
import com.nhaarman.mockitokotlin2.mock
import com.omer.movielist.data.RetrofitService
import com.omer.movielist.data.model.TvSerieResult
import com.omer.movielist.data.model.TvSeriesResponse
import com.omer.movielist.data.repository.MovieRepository
import okhttp3.MediaType
import okhttp3.ResponseBody
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.ArgumentMatchers.any
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.mock
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnit
import org.mockito.stubbing.Answer
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MovieListViewModelTest {


    @get:Rule
    var mockitoRule = MockitoJUnit.rule()

    private lateinit var movieListViewModel: MovieListViewModel

    @Mock
    private lateinit var movieRepository: MovieRepository

    @Mock
    private lateinit var observerForIsLoading: Observer<Boolean>

    @Mock
    private lateinit var observerForTvResultAsStirng: Observer<String>


    @get:Rule
    var instantExecutorRule = InstantTaskExecutorRule()

    companion object {
        const val INVALID_API_TOKEN = "11223344"
        const val VALID_API_TOKEN = "abcdeabcdeabcde"
        const val INVALID_PAGE_ID = -12
        const val VALID_PAGE_ID = 1
    }


    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        movieListViewModel = Mockito.spy(MovieListViewModel(movieRepository))

    }


    @Test
    fun get_series_with_invalid_token_test() {

    }

    @Test
    fun test_api_response() {

        movieListViewModel.isLoading.observeForever(observerForIsLoading)

        val mockedApiInterface = mock<RetrofitService>(RetrofitService::class.java)
        val mockedCall: Call<TvSeriesResponse> = mock()

        Mockito.`when`(mockedApiInterface.getPopularTvShows(INVALID_API_TOKEN, "en-US", 1)).thenReturn(mockedCall)

        Mockito.doAnswer(Answer {

            val callback: Callback<TvSeriesResponse> = it.getArgument(0)
            callback.onResponse(mockedCall, getDummyErrorResponse())

        }).`when`(mockedCall).enqueue(any<Callback<TvSeriesResponse>>())

        movieListViewModel.setConfig()

    }

    @Test
    fun clicked_recycler_item_test() {

        movieListViewModel.tvResultAsStirng.observeForever(observerForTvResultAsStirng)

        assert(movieListViewModel.tvResultAsStirng.value == null)

        movieListViewModel.convertClickedMovieItem(createSuccessResult())


    }

    fun getDummyErrorResponse(): Response<TvSeriesResponse> {

        val responseBody = ResponseBody.create(
            MediaType.parse("application/json"),
            " {\n" +
                    "   \"status_code\": 7,\n" +
                    "   \"status_message\": \"Invalid API key: You must be granted a valid key.\",\n" +
                    "   \"success\": false\n" +
                    " }"
        )

        return Response.error(401, responseBody)
    }


    fun createSuccessResult(): TvSerieResult? {
        return Gson().fromJson(getOneSuccessResultAsString(), TvSerieResult::class.java)
    }

    fun getOneSuccessResultAsString(): String {
        return "{\"first_air_date\":\"2009-10-12\",\"id\":46261,\"poster_path\":\"/58GKcwFV3lpVOGzybeMrrNOjHpz.jpg\",\"name\":\"Fairy Tail\",\"original_language\":\"ja\",\"overview\":\"Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn\\u0027t just any ordinary kid, he\\u0027s a member of one of the world\\u0027s most infamous mage guilds: Fairy Tail.\",\"vote_average\":6.8,\"vote_count\":\"120\"}"
    }


    @After
    fun tearDown() {

    }
}