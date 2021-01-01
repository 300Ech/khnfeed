package com.evertschavez.reigndemo.view.ui.articles

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.evertschavez.reigndemo.databinding.FragmentArticleListBinding
import com.evertschavez.reigndemo.model.DeletedArticle
import com.evertschavez.reigndemo.model.database.ObjectBox
import com.evertschavez.reigndemo.view.adapter.ArticleListAdapter
import com.evertschavez.reigndemo.view.adapter.SwipeToDeleteCallback
import com.evertschavez.reigndemo.view.utils.Network
import com.google.android.material.snackbar.Snackbar
import io.objectbox.Box
import io.objectbox.kotlin.boxFor
import kotlinx.android.synthetic.main.fragment_article_list.*
import org.jetbrains.anko.longToast

class ArticleListFragment : Fragment() {
    private lateinit var viewDataBinding: FragmentArticleListBinding
    private lateinit var articlesAdapter: ArticleListAdapter
    val deleteItemsBox: Box<DeletedArticle> = ObjectBox.boxStore.boxFor()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewDataBinding = FragmentArticleListBinding.inflate(inflater, container, false).apply {
            viewmodel = ViewModelProviders.of(this@ArticleListFragment)
                .get(ArticleListViewModel::class.java)
            setLifecycleOwner(viewLifecycleOwner)
        }
        return viewDataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fetchData()

        setupAdapter()
        setupObservers()

        swipeContainer.setOnRefreshListener {
            fetchData()
            swipeContainer.isRefreshing = false
        }
    }

    override fun onStart() {
        super.onStart()
        (activity as AppCompatActivity).supportActionBar!!.hide()
    }

    override fun onStop() {
        super.onStop()
        (activity as AppCompatActivity).supportActionBar!!.show()
    }

    override fun onResume() {
        super.onResume()
        (activity as AppCompatActivity).supportActionBar!!.hide()
    }

    private fun fetchData() {
        Network.isNetworkAvailableWithInternetAccess(context!!).observe(this, Observer {
            if (it != null) {
                if (it) {
                    viewDataBinding.viewmodel?.fetchArticleList()
                } else {
                    //Network is not available do another work
                    viewDataBinding.viewmodel?.loadFromLocalDb()
                }
            }
        })
    }

    private fun setupObservers() {
        viewDataBinding.viewmodel?.articleListLive?.observe(viewLifecycleOwner, Observer {
            val deletedItems = deleteItemsBox.all
            val keysOfDeletedItems = deletedItems.map { it.id }
            var mutableList = it.toMutableList()
            mutableList.removeAll { it.objectID in keysOfDeletedItems }

            articlesAdapter.updateArticlesList(mutableList)
        })

        viewDataBinding.viewmodel?.toastMessage?.observe(viewLifecycleOwner, Observer {
            activity?.longToast(it)
        })
    }

    private fun setupAdapter() {
        val viewModel = viewDataBinding.viewmodel
        if (viewModel != null) {
            articlesAdapter = ArticleListAdapter()
            val layoutManager = LinearLayoutManager(activity)
            rvArticles.layoutManager = layoutManager
            rvArticles.addItemDecoration(DividerItemDecoration(activity, layoutManager.orientation))
            rvArticles.adapter = articlesAdapter
            enableSwipeToDeleteAndUndo()
        }
    }

    private fun enableSwipeToDeleteAndUndo() {
        val swipeToDeleteCallback = object : SwipeToDeleteCallback(context!!) {
            override fun onSwiped(@NonNull viewHolder: RecyclerView.ViewHolder, i: Int) {
                val position = viewHolder.adapterPosition
                val item = articlesAdapter!!.getData().get(position)

                articlesAdapter!!.removeItem(position)

                val deletedItem = DeletedArticle(item.objectID)
                deleteItemsBox.put(deletedItem)

                val snack = Snackbar.make(
                    swipeContainer,
                    "Article was removed from the list.",
                    Snackbar.LENGTH_LONG
                )
                snack.setAction("UNDO") {
                    deleteItemsBox.remove(item.objectID)
                    articlesAdapter!!.restoreItem(item, position)
                    rvArticles.scrollToPosition(position)
                }

                snack.setActionTextColor(Color.YELLOW)
                snack.show()

            }
        }

        val itemTouchhelper = ItemTouchHelper(swipeToDeleteCallback)
        itemTouchhelper.attachToRecyclerView(rvArticles)
    }
}