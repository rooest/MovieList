package com.omer.movielist.di.module

import android.util.Log
import com.google.gson.FieldNamingPolicy
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.internal.bind.DateTypeAdapter
import com.omer.movielist.data.ApiConstants
import com.omer.movielist.data.RetrofitService
import com.omer.movielist.utils.extentions.debug
import com.orhanobut.logger.Logger
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.*
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
class NetworkModule {

    @Provides
    @Singleton
    fun provideGson(): Gson {
        return GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .registerTypeAdapter(Date::class.java, DateTypeAdapter())
            .create()
    }

    @Provides
    @Singleton
    fun provideLoggingInterceptor(): HttpLoggingInterceptor {
        val httpLoggingInterceptor = HttpLoggingInterceptor {
            if (isJSONValid(it)) {
                Logger.json(it)
            } else {
                Log.d("Retrofit", it)
            }
        }

        return httpLoggingInterceptor
            .setLevel(HttpLoggingInterceptor.Level.BODY)
    }


    @Provides
    @Singleton
    fun provideOkHttpClient(loggingInterceptor: HttpLoggingInterceptor): OkHttpClient {
        val okhttpBuilder = OkHttpClient.Builder()
        debug { okhttpBuilder.addInterceptor(loggingInterceptor) }
        okhttpBuilder.readTimeout(30, TimeUnit.SECONDS)
        okhttpBuilder.writeTimeout(30, TimeUnit.SECONDS)
        okhttpBuilder.connectTimeout(30, TimeUnit.SECONDS)
        return okhttpBuilder.build()
    }


    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient, gson: Gson): Retrofit =
        Retrofit.Builder()
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .baseUrl(ApiConstants.BASE_URL)
            .build()

    @Provides
    @Singleton
    fun provideRetrofitService(retrofit: Retrofit) = retrofit.create(RetrofitService::class.java)


    private fun isJSONValid(string: String): Boolean {
        try {
            JSONObject(string)
        } catch (ex: JSONException) {
            try {
                JSONArray(string)
            } catch (ex1: JSONException) {
                return false
            }
        }
        return true
    }
}
