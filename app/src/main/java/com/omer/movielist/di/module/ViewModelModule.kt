package com.omer.movielist.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.omer.movielist.di.ViewModelFactory
import com.omer.movielist.di.key.ViewModelKey
import com.omer.movielist.ui.moviedetail.MovieDetailViewModel
import com.omer.movielist.ui.movielist.MovieListViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
internal abstract class ViewModelModule {

    @IntoMap
    @Binds
    @ViewModelKey(MovieListViewModel::class)
    abstract fun provideMovieListViewModel(movieListViewModel: MovieListViewModel): ViewModel

    @IntoMap
    @Binds
    @ViewModelKey(MovieDetailViewModel::class)
    abstract fun provideMovieDetailViewModel(movieDetailViewModel: MovieDetailViewModel): ViewModel

    @Binds
    abstract fun provideViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}