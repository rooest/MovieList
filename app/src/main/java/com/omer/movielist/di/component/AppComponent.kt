package com.omer.movielist.di.component

import com.omer.movielist.MovieApplication
import com.omer.movielist.di.module.ActivityBuilderModule
import com.omer.movielist.di.module.AppModule
import com.omer.movielist.di.module.NetworkModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AppModule::class,
        NetworkModule::class,
        ActivityBuilderModule::class]
)
interface AppComponent : AndroidInjector<MovieApplication> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<MovieApplication>()

}