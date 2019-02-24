package com.omer.movielist.data.repository

import com.omer.movielist.data.ApiConstants
import com.omer.movielist.data.model.ApiError
import retrofit2.Response

open class BaseRepository {

    var apiError: ApiError = ApiError(ApiConstants.UNKNOWN_ERROR_MESSAGE, ApiConstants.UNKNOWN_ERROR_CODE)

//    fun parseErrorBody(response: Response<*>): Any? {
//        response.let {
//            if (!it.isSuccessful) {
//
//
//            }
//        }
//
//    }


}