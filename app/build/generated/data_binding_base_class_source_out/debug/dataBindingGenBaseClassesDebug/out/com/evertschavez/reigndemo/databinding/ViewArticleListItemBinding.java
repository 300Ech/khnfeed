package com.evertschavez.reigndemo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.evertschavez.reigndemo.model.Item;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ViewArticleListItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView author;

  @NonNull
  public final LinearLayout detailsContainer;

  @NonNull
  public final TextView elapsedTime;

  @NonNull
  public final LinearLayout headerContainer;

  @NonNull
  public final TextView storyTitle;

  @Bindable
  protected Item mItemData;

  protected ViewArticleListItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView author, LinearLayout detailsContainer, TextView elapsedTime,
      LinearLayout headerContainer, TextView storyTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.author = author;
    this.detailsContainer = detailsContainer;
    this.elapsedTime = elapsedTime;
    this.headerContainer = headerContainer;
    this.storyTitle = storyTitle;
  }

  public abstract void setItemData(@Nullable Item itemData);

  @Nullable
  public Item getItemData() {
    return mItemData;
  }

  @NonNull
  public static ViewArticleListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.view_article_list_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ViewArticleListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ViewArticleListItemBinding>inflateInternal(inflater, com.evertschavez.reigndemo.R.layout.view_article_list_item, root, attachToRoot, component);
  }

  @NonNull
  public static ViewArticleListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.view_article_list_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ViewArticleListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ViewArticleListItemBinding>inflateInternal(inflater, com.evertschavez.reigndemo.R.layout.view_article_list_item, null, false, component);
  }

  public static ViewArticleListItemBinding bind(@NonNull View view) {
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
  public static ViewArticleListItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (ViewArticleListItemBinding)bind(component, view, com.evertschavez.reigndemo.R.layout.view_article_list_item);
  }
}
