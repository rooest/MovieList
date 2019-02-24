package com.omer.movielist.ui.movielist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.google.gson.Gson
import com.omer.movielist.data.datasource.MovieDataSourceFactory
import com.omer.movielist.data.model.ApiError
import com.omer.movielist.data.model.TvSeriesResult
import com.omer.movielist.data.repository.MovieRepository
import javax.inject.Inject

class MovieListViewModel @Inject constructor(private val movieRepository: MovieRepository) : ViewModel() {


    lateinit var tvSeriesResultLD: LiveData<PagedList<TvSeriesResult>>

    var isLoading = MutableLiveData<Boolean>()
    var apiError = MutableLiveData<ApiError>()
    var apiFailure = MutableLiveData<String>()

    val tvResultAsStirng = MutableLiveData<String>()


    init {
        setConfig()
    }


    fun setConfig() {

        val factory = MovieDataSourceFactory(movieRepository)

        isLoading = factory.dataSource.isLoading
        apiError = factory.dataSource.apiError
        apiFailure = factory.dataSource.apiFailure

        val pageConfig = PagedList.Config.Builder()
            .setEnablePlaceholders(false)
            .setPageSize(20)
            .build()


        tvSeriesResultLD = LivePagedListBuilder<Int, TvSeriesResult>(factory, pageConfig)
            .build()
    }


    fun convertClickedMovieItem(tvSeriesResult: TvSeriesResult?) {
        tvSeriesResult?.let {
            val tvResultAsString = Gson().toJson(it, TvSeriesResult::class.java)
            tvResultAsStirng.postValue(tvResultAsString)
        }
    }

}