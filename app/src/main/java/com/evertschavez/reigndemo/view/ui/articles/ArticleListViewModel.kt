package com.evertschavez.reigndemo.view.ui.articles

import androidx.lifecycle.MutableLiveData
import com.evertschavez.reigndemo.model.ArticleRepository
import com.evertschavez.reigndemo.model.Item
import com.evertschavez.reigndemo.view.base.BaseViewModel

class ArticleListViewModel : BaseViewModel() {
    val articleListLive = MutableLiveData<List<Item>>()

    fun fetchArticleList() {
        dataLoading.value = true
        ArticleRepository.getInstance().getArticleList { isSuccess, response ->
            dataLoading.value = false
            if (isSuccess) {
                articleListLive.value = response?.hits
                noData.value = false
            } else {
                noData.value = true
            }
        }
    }
}