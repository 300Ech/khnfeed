package com.evertschavez.reigndemo.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.evertschavez.reigndemo.databinding.ViewArticleListItemBinding
import com.evertschavez.reigndemo.model.Item
import com.evertschavez.reigndemo.view.adapter.viewHolders.ArticleListViewHolder

class ArticleListAdapter : RecyclerView.Adapter<ArticleListViewHolder>() {
    var articlesList: List<Item> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val dataBinding = ViewArticleListItemBinding.inflate(inflater, parent, false)
        return ArticleListViewHolder(dataBinding)
    }

    override fun getItemCount() = articlesList.size

    override fun onBindViewHolder(holder: ArticleListViewHolder, position: Int) {
        holder.setup(articlesList[position])
    }

    fun updateArticlesList(repoList: List<Item>) {
        this.articlesList = repoList
        notifyDataSetChanged()
    }

    fun removeItem(position: Int) {
        val arrayList = ArrayList<Item>(this.articlesList)
        arrayList.removeAt(position)
        this.articlesList = arrayList
        notifyItemRemoved(position)
    }

    fun restoreItem(item: Item, position: Int) {
        val arrayList = ArrayList<Item>(this.articlesList)
        arrayList.add(position, item)
        this.articlesList = arrayList
        notifyItemInserted(position)
    }

    fun getData(): List<Item> {
        return this.articlesList
    }
}