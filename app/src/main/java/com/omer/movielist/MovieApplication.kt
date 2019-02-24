package com.omer.movielist

import com.omer.movielist.di.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class MovieApplication : DaggerApplication() {


    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
        DaggerAppComponent.builder().create(this)
//        AndroidInjector { }
}
