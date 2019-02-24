package com.omer.movielist.data.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ApiError(
    @SerializedName("status_message") val statusMessage: String,
    @SerializedName("status_code") val statusCode: Int,
    @SerializedName("success") val success: Boolean? = false
) : Serializable