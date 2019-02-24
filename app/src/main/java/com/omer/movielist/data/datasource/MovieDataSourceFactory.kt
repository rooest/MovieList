package com.omer.movielist.data.datasource

import androidx.paging.DataSource
import com.omer.movielist.data.model.TvSerieResult
import com.omer.movielist.data.repository.MovieRepository

class MovieDataSourceFactory  constructor(private val movieRepository: MovieRepository) :
    DataSource.Factory<Int, TvSerieResult>() {

    val dataSource = MovieDataSource(movieRepository)

    override fun create(): DataSource<Int, TvSerieResult> = dataSource
}