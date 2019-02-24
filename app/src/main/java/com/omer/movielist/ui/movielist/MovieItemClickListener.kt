package com.omer.movielist.ui.movielist

import com.omer.movielist.data.model.TvSerieResult

interface MovieItemClickListener {
    fun onMovieItemClick(itemResult: TvSerieResult?)
}