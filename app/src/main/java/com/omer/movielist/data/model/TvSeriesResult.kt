package com.omer.movielist.data.model

import androidx.recyclerview.widget.DiffUtil
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class TvSeriesResult(
    @SerializedName("id") val id: Int,
    @SerializedName("vote_average") val voteAverage: Float,
    @SerializedName("original_language") val originalLanguage: String,
    @SerializedName("name") val name: String,
    @SerializedName("overview") val overview: String,
    @SerializedName("poster_path") val imageUrl: String,
    @SerializedName("type") val type: String
) : Serializable {


    companion object {
        val DIFF_CALL: DiffUtil.ItemCallback<TvSeriesResult> = object : DiffUtil.ItemCallback<TvSeriesResult>() {
            override fun areItemsTheSame(oldItem: TvSeriesResult, newItem: TvSeriesResult): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: TvSeriesResult, newItem: TvSeriesResult): Boolean {
                return oldItem.id == newItem.id
            }
        }
    }


}