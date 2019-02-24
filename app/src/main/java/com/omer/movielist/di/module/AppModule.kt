package com.omer.movielist.di.module

import android.content.Context
import com.omer.movielist.MovieApplication
import com.squareup.picasso.OkHttp3Downloader
import dagger.Module
import dagger.Provides
import javax.inject.Singleton
import okhttp3.OkHttpClient
import com.squareup.picasso.Picasso


@Module(includes = [ViewModelModule::class])
class AppModule {

    @Provides
    @Singleton
    fun provideContext(movieApplication: MovieApplication): Context = movieApplication.applicationContext




    @Provides
    @Singleton
    fun picasso(context: Context, okHttp3Downloader: OkHttp3Downloader): Picasso {
        return Picasso.Builder(context.applicationContext)
            .indicatorsEnabled(true)
            .loggingEnabled(true)
            .build()
    }


}