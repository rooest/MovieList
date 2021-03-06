package com.omer.movielist.ui.moviedetail

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.google.gson.Gson
import com.omer.movielist.data.model.TvSerieResult
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations


class MovieDetailViewModelTest {

    private lateinit var movieDetailViewModel: MovieDetailViewModel

    @Mock
    private lateinit var observerForIsLoading: Observer<Boolean>

    @Mock
    private lateinit var observerForBackBtnClicked: Observer<Boolean>

    @Mock
    private lateinit var observerForTvSeriesResult: Observer<TvSerieResult>

    @get:Rule
    var instantExecutorRule = InstantTaskExecutorRule()


    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        movieDetailViewModel = MovieDetailViewModel()
    }


    @Test
    fun set_movie_detail_intent() {

        movieDetailViewModel.isLoading.observeForever(observerForIsLoading)
        movieDetailViewModel.tvSeriesResultLD.observeForever(observerForTvSeriesResult)

        assert(movieDetailViewModel.isLoading.value == true)
        movieDetailViewModel.setIntentResult(getOneResult())

        Thread.sleep(3000)
        assert(movieDetailViewModel.tvSeriesResultLD.value == convertToResultFromString(getOneResult()))
        assert(movieDetailViewModel.isLoading.value == false)
    }

    @Test
    fun back_btn_clicked_test() {

        movieDetailViewModel.backBtnClicked.observeForever(observerForBackBtnClicked)

        assert(movieDetailViewModel.backBtnClicked.value == null)

        movieDetailViewModel.titleClicked()

        assert(movieDetailViewModel.backBtnClicked.value == true)
    }


    fun convertToResultFromString(jsonString: String): TvSerieResult {
        return Gson().fromJson(jsonString, TvSerieResult::class.java)
    }


    fun getOneResult(): String {
        return "{\"first_air_date\":\"2009-10-12\",\"id\":46261,\"poster_path\":\"/58GKcwFV3lpVOGzybeMrrNOjHpz.jpg\",\"name\":\"Fairy Tail\",\"original_language\":\"ja\",\"overview\":\"Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn\\u0027t just any ordinary kid, he\\u0027s a member of one of the world\\u0027s most infamous mage guilds: Fairy Tail.\",\"vote_average\":6.8,\"vote_count\":\"120\"}"
    }
}