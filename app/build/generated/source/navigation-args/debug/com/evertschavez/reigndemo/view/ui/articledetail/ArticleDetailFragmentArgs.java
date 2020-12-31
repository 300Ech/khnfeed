package com.evertschavez.reigndemo.view.ui.articledetail;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ArticleDetailFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ArticleDetailFragmentArgs() {
  }

  private ArticleDetailFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ArticleDetailFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ArticleDetailFragmentArgs __result = new ArticleDetailFragmentArgs();
    bundle.setClassLoader(ArticleDetailFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("url")) {
      String url;
      url = bundle.getString("url");
      if (url == null) {
        throw new IllegalArgumentException("Argument \"url\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("url", url);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getUrl() {
    return (String) arguments.get("url");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("url")) {
      String url = (String) arguments.get("url");
      __result.putString("url", url);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    ArticleDetailFragmentArgs that = (ArticleDetailFragmentArgs) object;
    if (arguments.containsKey("url") != that.arguments.containsKey("url")) {
      return false;
    }
    if (getUrl() != null ? !getUrl().equals(that.getUrl()) : that.getUrl() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getUrl() != null ? getUrl().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "ArticleDetailFragmentArgs{"
        + "url=" + getUrl()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(ArticleDetailFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder() {
    }

    @NonNull
    public ArticleDetailFragmentArgs build() {
      ArticleDetailFragmentArgs result = new ArticleDetailFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setUrl(@NonNull String url) {
      if (url == null) {
        throw new IllegalArgumentException("Argument \"url\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("url", url);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getUrl() {
      return (String) arguments.get("url");
    }
  }
}
