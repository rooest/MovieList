package com.omer.movielist.di.module

import com.omer.movielist.di.scope.ActivityScope
import com.omer.movielist.ui.movielist.MovieListActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ActivityScope
    @ContributesAndroidInjector()
    abstract fun movieListActivity(): MovieListActivity

}