package com.evertschavez.reigndemo.databinding;
import com.evertschavez.reigndemo.R;
import com.evertschavez.reigndemo.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentArticleListBindingImpl extends FragmentArticleListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.ProgressBar mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentArticleListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentArticleListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[0]
            );
        this.mboundView2 = (android.widget.ProgressBar) bindings[2];
        this.mboundView2.setTag(null);
        this.rvArticles.setTag(null);
        this.swipeContainer.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewmodel == variableId) {
            setViewmodel((com.evertschavez.reigndemo.view.ui.articles.ArticleListViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.evertschavez.reigndemo.view.ui.articles.ArticleListViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelDataLoading((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelDataLoading(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewmodelDataLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int androidxDatabindingViewDataBindingSafeUnboxViewmodelDataLoadingViewGONEViewVISIBLE = 0;
        int androidxDatabindingViewDataBindingSafeUnboxViewmodelDataLoadingViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelDataLoading = false;
        java.lang.Boolean viewmodelDataLoadingGetValue = null;
        com.evertschavez.reigndemo.view.ui.articles.ArticleListViewModel viewmodel = mViewmodel;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewmodelDataLoading = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.dataLoading
                    viewmodelDataLoading = viewmodel.getDataLoading();
                }
                updateLiveDataRegistration(0, viewmodelDataLoading);


                if (viewmodelDataLoading != null) {
                    // read viewmodel.dataLoading.getValue()
                    viewmodelDataLoadingGetValue = viewmodelDataLoading.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.dataLoading.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewmodelDataLoading = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelDataLoadingGetValue);
            if((dirtyFlags & 0x7L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxViewmodelDataLoading) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.dataLoading.getValue()) ? View.GONE : View.VISIBLE
                androidxDatabindingViewDataBindingSafeUnboxViewmodelDataLoadingViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelDataLoading) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.dataLoading.getValue()) ? View.VISIBLE : View.GONE
                androidxDatabindingViewDataBindingSafeUnboxViewmodelDataLoadingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelDataLoading) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.mboundView2.setVisibility(androidxDatabindingViewDataBindingSafeUnboxViewmodelDataLoadingViewVISIBLEViewGONE);
            this.rvArticles.setVisibility(androidxDatabindingViewDataBindingSafeUnboxViewmodelDataLoadingViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.dataLoading
        flag 1 (0x2L): viewmodel
        flag 2 (0x3L): null
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.dataLoading.getValue()) ? View.GONE : View.VISIBLE
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.dataLoading.getValue()) ? View.GONE : View.VISIBLE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.dataLoading.getValue()) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.dataLoading.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}