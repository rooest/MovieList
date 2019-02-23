package com.omer.movielist.model

import java.io.Serializable

data class MovieDetail(
    val rating: String? = "",
    val title: String? = "Title",
    val language: String? = "English",
    val duration: String? = "2:00:00",
    val info: String? = "",
    val imageUrl: String? = ""
) : Serializable