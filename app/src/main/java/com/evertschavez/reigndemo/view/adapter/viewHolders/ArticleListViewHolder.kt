package com.evertschavez.reigndemo.view.adapter.viewHolders

import androidx.databinding.ViewDataBinding
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.evertschavez.reigndemo.BR
import com.evertschavez.reigndemo.R
import com.evertschavez.reigndemo.model.Item
import com.evertschavez.reigndemo.view.utils.TimeHelper
import org.jetbrains.anko.bundleOf
import org.jetbrains.anko.sdk27.coroutines.onClick
import java.util.*

class ArticleListViewHolder(private val dataBinding: ViewDataBinding)
    : RecyclerView.ViewHolder(dataBinding.root) {

    fun setup(itemData: Item) {
        val date = Date(itemData.created_at_i)
        itemData.elapsedTime = "- ${TimeHelper.getTimeAgo(date)}"

        if (itemData.title != null) itemData.story_title = itemData.title

        dataBinding.setVariable(BR.itemData, itemData)
        dataBinding.executePendingBindings()

        itemView.onClick {
            if (itemData.story_url != null) {
                val bundle = bundleOf("url" to itemData.story_url)
                itemView.findNavController().navigate(R.id.action_articleListFragment_to_articleDetailFragment, bundle)
            }
        }
    }
}