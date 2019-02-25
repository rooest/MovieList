package com.omer.movielist.ui.movielist

import android.util.Log
import androidx.lifecycle.Observer
import com.omer.movielist.data.RetrofitService
import com.omer.movielist.data.model.TvSeriesResponse
import com.omer.movielist.data.repository.MovieRepository
import okhttp3.MediaType
import okhttp3.ResponseBody
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import retrofit2.Response


class MovieListViewModelTest {

    private lateinit var movieListViewModel: MovieListViewModel

    @Mock
    private lateinit var movieRepository: MovieRepository

    @Mock
    private lateinit var apiService: RetrofitService

    @Mock
    private lateinit var observerForIsLoading: Observer<Boolean>

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

        val service = apiService
        Mockito.`when`(apiService.getPopularTvShows(INVALID_API_TOKEN, "en-US", 1).execute())
            .thenReturn(getDummyErrorResponse())



        movieListViewModel.isLoading.observeForever(observerForIsLoading)
        movieListViewModel.setConfig()
        assert(movieListViewModel.isLoading.value == true)

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


    @After
    fun tearDown() {

    }
}