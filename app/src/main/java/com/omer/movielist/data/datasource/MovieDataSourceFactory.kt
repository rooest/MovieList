package com.omer.movielist.data.datasource

import androidx.paging.DataSource
import com.omer.movielist.data.model.TvSeriesResult
import com.omer.movielist.data.repository.MovieRepository
import javax.inject.Inject

class MovieDataSourceFactory  constructor(private val movieRepository: MovieRepository) :
    DataSource.Factory<Int, TvSeriesResult>() {

    val dataSource = MovieDataSource(movieRepository)

    override fun create(): DataSource<Int, TvSeriesResult> = dataSource
}