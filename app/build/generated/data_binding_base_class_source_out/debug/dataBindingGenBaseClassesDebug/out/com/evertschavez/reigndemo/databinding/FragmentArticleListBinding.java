package com.evertschavez.reigndemo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.evertschavez.reigndemo.view.ui.articles.ArticleListViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentArticleListBinding extends ViewDataBinding {
  @NonNull
  public final RelativeLayout rootView;

  @NonNull
  public final RecyclerView rvArticles;

  @NonNull
  public final SwipeRefreshLayout swipeContainer;

  @Bindable
  protected ArticleListViewModel mViewmodel;

  protected FragmentArticleListBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RelativeLayout rootView, RecyclerView rvArticles, SwipeRefreshLayout swipeContainer) {
    super(_bindingComponent, _root, _localFieldCount);
    this.rootView = rootView;
    this.rvArticles = rvArticles;
    this.swipeContainer = swipeContainer;
  }

  public abstract void setViewmodel(@Nullable ArticleListViewModel viewmodel);

  @Nullable
  public ArticleListViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentArticleListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_article_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentArticleListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentArticleListBinding>inflateInternal(inflater, com.evertschavez.reigndemo.R.layout.fragment_article_list, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentArticleListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_article_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentArticleListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentArticleListBinding>inflateInternal(inflater, com.evertschavez.reigndemo.R.layout.fragment_article_list, null, false, component);
  }

  public static FragmentArticleListBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentArticleListBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentArticleListBinding)bind(component, view, com.evertschavez.reigndemo.R.layout.fragment_article_list);
  }
}
