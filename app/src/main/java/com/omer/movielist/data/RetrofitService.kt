package com.omer.movielist.data

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitService {

    @GET(ApiConstants.POPULAR_TV_SHOWS)
    fun getPopularTvShows(@Query("1") id: Int): Call<>


}