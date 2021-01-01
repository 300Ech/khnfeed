package com.evertschavez.reigndemo.view.ui.articles;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nR\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/evertschavez/reigndemo/view/ui/articles/ArticleListViewModel;", "Lcom/evertschavez/reigndemo/view/base/BaseViewModel;", "()V", "articleListLive", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/evertschavez/reigndemo/model/Item;", "getArticleListLive", "()Landroidx/lifecycle/MutableLiveData;", "fetchArticleList", "", "loadFromLocalDb", "app_debug"})
public final class ArticleListViewModel extends com.evertschavez.reigndemo.view.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.evertschavez.reigndemo.model.Item>> articleListLive = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.evertschavez.reigndemo.model.Item>> getArticleListLive() {
        return null;
    }
    
    public final void fetchArticleList() {
    }
    
    public final void loadFromLocalDb() {
    }
    
    public ArticleListViewModel() {
        super();
    }
}