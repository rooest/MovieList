package com.omer.movielist.data.datasource

import androidx.lifecycle.MutableLiveData
import androidx.paging.PageKeyedDataSource
import com.omer.movielist.data.ApiConstants
import com.omer.movielist.data.model.ApiError
import com.omer.movielist.data.model.TvSeriesResult
import com.omer.movielist.data.repository.MovieRepository

class MovieDataSource constructor(private val movieRepository: MovieRepository) :
    PageKeyedDataSource<Int, TvSeriesResult>() {


    val isLoading = MutableLiveData<Boolean>()
    val apiError = MutableLiveData<ApiError>()
    var apiFailure = MutableLiveData<String>()


    override fun loadInitial(params: LoadInitialParams<Int>, callback: LoadInitialCallback<Int, TvSeriesResult>) {
        isLoading.postValue(true)
        movieRepository.getPopularSeries(ApiConstants.DEFAULT_PAGE_COUNT,

            {
                callback.onResult(it, null, 2)
                isLoading.postValue(false)
            },
            {

                isLoading.postValue(false)
            },
            {
                apiError.value = ApiError(it.statusMessage, it.statusCode)
                isLoading.postValue(false)
            }
        )
    }

    override fun loadAfter(params: LoadParams<Int>, callback: LoadCallback<Int, TvSeriesResult>) {
        isLoading.postValue(true)
        movieRepository.getPopularSeries(params.key,

            {
                callback.onResult(it, params.key + 1)
                isLoading.postValue(false)
            },
            {

                isLoading.postValue(false)
            },
            {
                apiError.value = ApiError(it.statusMessage, it.statusCode)
                isLoading.postValue(false)
            }
        )
    }

    override fun loadBefore(params: LoadParams<Int>, callback: LoadCallback<Int, TvSeriesResult>) {
    }

}