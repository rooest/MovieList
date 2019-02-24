package com.omer.movielist.ui.moviedetail

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.gson.Gson
import com.omer.movielist.data.model.TvSerieResult
import com.orhanobut.logger.Logger
import javax.inject.Inject

class MovieDetailViewModel @Inject constructor() : ViewModel() {


    val tvSeriesResultLD = MutableLiveData<TvSerieResult>()


    fun setIntentResult(movieResultJsonString: String) {
        val movieResult = Gson().fromJson(movieResultJsonString, TvSerieResult::class.java)
        Logger.d(movieResultJsonString)
        tvSeriesResultLD.value = movieResult
    }


}