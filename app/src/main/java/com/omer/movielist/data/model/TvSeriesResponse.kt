package com.omer.movielist.data.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class TvSeriesResponse(
     val error: ApiError,
    @SerializedName("results") val resultList: List<TvSeriesResult>
) : Serializable