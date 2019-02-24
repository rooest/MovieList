package com.omer.movielist.ui.movielist

import com.omer.movielist.data.model.TvSeriesResult

interface MovieItemClickListener {
    fun onMovieItemClick(itemResult: TvSeriesResult?)
}