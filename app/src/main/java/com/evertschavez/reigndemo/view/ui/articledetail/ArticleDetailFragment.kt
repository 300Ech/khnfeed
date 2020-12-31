package com.evertschavez.reigndemo.view.ui.articledetail

import android.graphics.Bitmap
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.evertschavez.reigndemo.view.ui.articledetail.ArticleDetailFragmentArgs
import com.evertschavez.reigndemo.R
import kotlinx.android.synthetic.main.fragment_article_detail.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class ArticleDetailFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_article_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val url = arguments?.let { ArticleDetailFragmentArgs.fromBundle(it).url }

        setupWebView()
        setClickListeners()

        article_url_webiew.loadUrl(url)
    }

    private fun setClickListeners() {
        webiew_back_button.onClick {
            article_url_webiew.goBack()
        }

        webiew_forward_button.onClick {
            article_url_webiew.goForward()
        }

        webiew_refresh_button.onClick {
            article_url_webiew.reload()
        }
    }

    private fun setupWebView() {
        article_url_webiew.setInitialScale(1)
        val webSettings = article_url_webiew.settings
        webSettings.setAppCacheEnabled(false)
        webSettings.builtInZoomControls = true
        webSettings.displayZoomControls = false
        webSettings.javaScriptEnabled = true
        webSettings.useWideViewPort = true
        webSettings.domStorageEnabled = true

        article_url_webiew.webViewClient = object : WebViewClient() {
            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)
                if (webiew_back_button != null && webiew_forward_button != null && article_url_webiew != null && webiew_progress_view != null) {
                    webiew_back_button.isEnabled = article_url_webiew.canGoBack()
                    webiew_forward_button.isEnabled = article_url_webiew.canGoForward()
                    webiew_progress_view.visibility = View.VISIBLE
                }
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                if (webiew_back_button != null && webiew_forward_button != null && article_url_webiew != null && webiew_progress_view != null) {
                    webiew_back_button.isEnabled = article_url_webiew.canGoBack()
                    webiew_forward_button.isEnabled = article_url_webiew.canGoForward()
                    webiew_progress_view.visibility = View.GONE
                }
            }
        }
    }
}