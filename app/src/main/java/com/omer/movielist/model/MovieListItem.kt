package com.omer.movielist.model

import java.io.Serializable

data class MovieListItem(
    val rating: String? = "",
    val title: String? = "Title",
    val imageUrl: String? = ""
) : Serializable