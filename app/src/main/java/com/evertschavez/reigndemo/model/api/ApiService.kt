package com.evertschavez.reigndemo.model.api

import com.evertschavez.reigndemo.model.HnResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("api/v1/search_by_date")
    fun getArticles(@Query("query") search: String = "android"): Call<HnResponse>
}