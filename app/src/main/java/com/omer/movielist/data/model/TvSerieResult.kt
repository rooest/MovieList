package com.omer.movielist.data.model

import androidx.recyclerview.widget.DiffUtil
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class TvSerieResult(
    @SerializedName("id") val id: Int,
    @SerializedName("vote_average") val voteAverage: Float,
    @SerializedName("original_language") val originalLanguage: String,
    @SerializedName("name") val name: String,
    @SerializedName("overview") val overview: String,
    @SerializedName("poster_path") val imageUrl: String,
    @SerializedName("vote_count") val voteCount: String,
    @SerializedName("first_air_date") val firstAirDate: String,
    @SerializedName("type") val type: String
) : Serializable {


    companion object {
        val DIFF_CALL: DiffUtil.ItemCallback<TvSerieResult> = object : DiffUtil.ItemCallback<TvSerieResult>() {
            override fun areItemsTheSame(oldItem: TvSerieResult, newItem: TvSerieResult): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: TvSerieResult, newItem: TvSerieResult): Boolean {
                return oldItem.id == newItem.id
            }
        }
    }


}