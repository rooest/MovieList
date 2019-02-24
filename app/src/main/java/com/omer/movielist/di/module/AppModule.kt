package com.omer.movielist.di.module

import android.content.Context
import com.omer.movielist.MovieApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [ViewModelModule::class])
class AppModule {

    @Provides
    @Singleton
    fun provideContext(movieApplication: MovieApplication): Context = movieApplication.applicationContext

}