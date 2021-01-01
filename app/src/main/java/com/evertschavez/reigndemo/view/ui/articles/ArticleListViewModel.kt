package com.evertschavez.reigndemo.view.ui.articles

import androidx.lifecycle.MutableLiveData
import com.evertschavez.reigndemo.model.ArticleRepository
import com.evertschavez.reigndemo.model.Item
import com.evertschavez.reigndemo.model.Item_
import com.evertschavez.reigndemo.model.database.ObjectBox
import com.evertschavez.reigndemo.view.base.BaseViewModel
import io.objectbox.Box
import io.objectbox.kotlin.boxFor

class ArticleListViewModel : BaseViewModel() {
    val articleListLive = MutableLiveData<List<Item>>()

    fun fetchArticleList() {
        dataLoading.value = true

        ArticleRepository.getInstance().getArticleList { isSuccess, response ->
            dataLoading.value = false
            if (isSuccess) {
                articleListLive.value = response?.hits

                // save data to local db
                val newItems: Box<Item> = ObjectBox.boxStore.boxFor()
                newItems.put(response?.hits)
                noData.value = false
            } else loadFromLocalDb()
        }
    }

    // load data from local db
    fun loadFromLocalDb() {
        dataLoading.value = true
        val storedItems: Box<Item> = ObjectBox.boxStore.boxFor()

        val query = storedItems.query().run {
            orderDesc(Item_.objectID)
            build()
        }

        articleListLive.value = query.find()
        dataLoading.value = false
        noData.value = false
    }
}