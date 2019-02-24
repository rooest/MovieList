package com.omer.movielist.data.repository

import com.google.gson.Gson
import com.omer.movielist.data.ApiConstants
import com.omer.movielist.data.RetrofitService
import com.omer.movielist.data.model.ApiError
import com.omer.movielist.data.model.TvSeriesResponse
import com.omer.movielist.data.model.TvSeriesResult
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class MovieRepository @Inject constructor(@PublishedApi internal val apiService: RetrofitService) {


    inline fun getPopularSeries(
        page: Int,
        crossinline successHandler: (List<TvSeriesResult>) -> Unit,
        crossinline failureHandler: (Throwable?) -> Unit,
        crossinline errorHandler: (ApiError) -> Unit
    ) {

        apiService.getPopularTvShows(
            ApiConstants.API_KEY,
            "en-US",
            page
        ).enqueue(object : Callback<TvSeriesResponse> {

            override fun onResponse(call: Call<TvSeriesResponse>?, response: Response<TvSeriesResponse>?) {
                response?.let {
                    if (it.isSuccessful) {
                        response.body()?.resultList?.let { result ->
                            successHandler(result)
                        }
                    } else {
                        try {
                            response.errorBody()?.string().let { errorAsString ->
                                errorHandler(Gson().fromJson(errorAsString, ApiError::class.java))
                            }
                        } catch (e: Exception) {
                            e.printStackTrace()
                        }
                    }
                }
            }

            override fun onFailure(call: Call<TvSeriesResponse>, t: Throwable?) {
                t.let {
                    failureHandler(t)
                }
            }
        })

    }


}