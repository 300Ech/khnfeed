package com.evertschavez.reigndemo.view.ui.articles;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.evertschavez.reigndemo.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ArticleListFragmentDirections {
  private ArticleListFragmentDirections() {
  }

  @NonNull
  public static ActionArticleListFragmentToArticleDetailFragment actionArticleListFragmentToArticleDetailFragment() {
    return new ActionArticleListFragmentToArticleDetailFragment();
  }

  public static class ActionArticleListFragmentToArticleDetailFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionArticleListFragmentToArticleDetailFragment() {
    }

    @NonNull
    public ActionArticleListFragmentToArticleDetailFragment setUrl(@NonNull String url) {
      if (url == null) {
        throw new IllegalArgumentException("Argument \"url\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("url", url);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("url")) {
        String url = (String) arguments.get("url");
        __result.putString("url", url);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_articleListFragment_to_articleDetailFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getUrl() {
      return (String) arguments.get("url");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionArticleListFragmentToArticleDetailFragment that = (ActionArticleListFragmentToArticleDetailFragment) object;
      if (arguments.containsKey("url") != that.arguments.containsKey("url")) {
        return false;
      }
      if (getUrl() != null ? !getUrl().equals(that.getUrl()) : that.getUrl() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getUrl() != null ? getUrl().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionArticleListFragmentToArticleDetailFragment(actionId=" + getActionId() + "){"
          + "url=" + getUrl()
          + "}";
    }
  }
}
