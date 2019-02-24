package com.omer.movielist.data

import com.omer.movielist.data.model.TvSeriesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitService {


    @GET(ApiConstants.POPULAR_TV_SHOWS)
    fun getPopularTvShows(
        @Query("api_key") apiKey: String? = ApiConstants.API_KEY,
        @Query("language") language: String? = "en-US",
        @Query("page") page: Int? = 1
    ): Call<TvSeriesResponse>


}