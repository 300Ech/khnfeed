package com.evertschavez.reigndemo.model

import com.evertschavez.reigndemo.model.api.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ArticleRepository {
    fun getArticleList(onResult: (isSuccess: Boolean, response: HnResponse?) -> Unit) {
        ApiClient.instance.getArticles().enqueue(object : Callback<HnResponse> {
            override fun onResponse(call: Call<HnResponse>?, response: Response<HnResponse>?) {
                if (response != null && response.isSuccessful)
                    onResult(true, response.body()!!)
                else
                    onResult(false, null)
            }

            override fun onFailure(call: Call<HnResponse>?, t: Throwable?) {
                onResult(false, null)
            }
        })
    }

    companion object {
        private var INSTANCE: ArticleRepository? = null
        fun getInstance() = INSTANCE
            ?: ArticleRepository().also {
                INSTANCE = it
            }
    }
}