package com.evertschavez.reigndemo.model.api

import com.evertschavez.reigndemo.HnApp
import com.evertschavez.reigndemo.view.utils.Constants.Companion.BASE_URL
import com.evertschavez.reigndemo.view.utils.Constants.Companion.IF_DEBUG
import com.evertschavez.reigndemo.view.utils.Constants.Companion.REQUEST_TIMEOUT
import com.evertschavez.reigndemo.view.utils.NetworkUtils
import com.google.gson.GsonBuilder
import okhttp3.Cache
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object ApiClient {
    val instance: ApiService = Retrofit.Builder().run {
        val gson = GsonBuilder()
            .enableComplexMapKeySerialization()
            .setPrettyPrinting()
            .create()

        baseUrl(BASE_URL)
        addConverterFactory(GsonConverterFactory.create(gson))
        client(createRequestInterceptorClient())
        build()
    }.create(ApiService::class.java)

    private fun createRequestInterceptorClient(): OkHttpClient {
        val interceptor = Interceptor { chain ->
            val original = chain.request()
            val requestBuilder =
                if (NetworkUtils.hasNetwork(HnApp.instance)!!)
                    original.newBuilder().header("Cache-Control",
                        "public, max-age=" + 5)
                else
                    original.newBuilder().header("Cache-Control",
                        "public, only-if-cache, max-state=" + 60 * 60 * 24 * 7)
            val request = requestBuilder.build()
            chain.proceed(request)
        }

        val cacheSize = (5 * 1024 * 1024).toLong()
        val myCache = Cache(HnApp.instance.cacheDir, cacheSize)

        return if (IF_DEBUG) {
            OkHttpClient.Builder()
                .cache(myCache)
                .addInterceptor(interceptor)
                .addInterceptor(
                    HttpLoggingInterceptor()
                    .setLevel(HttpLoggingInterceptor.Level.BODY))
                .connectTimeout(REQUEST_TIMEOUT.toLong(), TimeUnit.SECONDS)
                .readTimeout(REQUEST_TIMEOUT.toLong(), TimeUnit.SECONDS)
                .writeTimeout(REQUEST_TIMEOUT.toLong(), TimeUnit.SECONDS)
                .build()
        } else {
            OkHttpClient.Builder()
                .cache(myCache)
                .addInterceptor(interceptor)
                .connectTimeout(REQUEST_TIMEOUT.toLong(), TimeUnit.SECONDS)
                .readTimeout(REQUEST_TIMEOUT.toLong(), TimeUnit.SECONDS)
                .writeTimeout(REQUEST_TIMEOUT.toLong(), TimeUnit.SECONDS)
                .build()
        }
    }
}