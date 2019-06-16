package com.fastservices.sams.databinding;
import com.fastservices.sams.R;
import com.fastservices.sams.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentOutletBindingImpl extends FragmentOutletBinding implements com.fastservices.sams.generated.callback.OnTextChanged.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.bottomLayout, 2);
        sViewsWithIds.put(R.id.topLayout, 3);
        sViewsWithIds.put(R.id.btnSection, 4);
        sViewsWithIds.put(R.id.searchLayout, 5);
        sViewsWithIds.put(R.id.ivListView, 6);
        sViewsWithIds.put(R.id.separator, 7);
        sViewsWithIds.put(R.id.ivGridView, 8);
        sViewsWithIds.put(R.id.rvOutlets, 9);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.databinding.adapters.TextViewBindingAdapter.OnTextChanged mCallback23;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener etFilterandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.searchQuery.get()
            //         is viewModel.searchQuery.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(etFilter);
            // localize variables for thread safety
            // viewModel.searchQuery
            android.databinding.ObservableField<java.lang.String> viewModelSearchQuery = null;
            // viewModel.searchQuery.get()
            java.lang.String viewModelSearchQueryGet = null;
            // viewModel
            com.fastservices.sams.modules.outlet.OutletsVM viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.searchQuery != null
            boolean viewModelSearchQueryJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelSearchQuery = viewModel.getSearchQuery();

                viewModelSearchQueryJavaLangObjectNull = (viewModelSearchQuery) != (null);
                if (viewModelSearchQueryJavaLangObjectNull) {




                    viewModelSearchQuery.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentOutletBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentOutletBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.view.View) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.EditText) bindings[1]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[6]
            , (android.support.v7.widget.RecyclerView) bindings[9]
            , (android.widget.LinearLayout) bindings[5]
            , (android.view.View) bindings[7]
            , (android.support.v7.widget.CardView) bindings[3]
            );
        this.etFilter.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback23 = new com.fastservices.sams.generated.callback.OnTextChanged(this, 1);
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
        if (BR.viewModel == variableId) {
            setViewModel((com.fastservices.sams.modules.outlet.OutletsVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.fastservices.sams.modules.outlet.OutletsVM ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelSearchQuery((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSearchQuery(android.databinding.ObservableField<java.lang.String> ViewModelSearchQuery, int fieldId) {
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
        java.lang.String viewModelSearchQueryGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelSearchQuery = null;
        com.fastservices.sams.modules.outlet.OutletsVM viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.searchQuery
                    viewModelSearchQuery = viewModel.getSearchQuery();
                }
                updateRegistration(0, viewModelSearchQuery);


                if (viewModelSearchQuery != null) {
                    // read viewModel.searchQuery.get()
                    viewModelSearchQueryGet = viewModelSearchQuery.get();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.etFilter, viewModelSearchQueryGet);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etFilter, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, mCallback23, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etFilterandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnTextChanged(int sourceId , java.lang.CharSequence callbackArg_0, int callbackArg_1, int callbackArg_2, int callbackArg_3) {
        // localize variables for thread safety
        // viewModel
        com.fastservices.sams.modules.outlet.OutletsVM viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            if ((callbackArg_0) != (null)) {


                callbackArg_0.toString();

                viewModel.applyFilter(callbackArg_0.toString());
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.searchQuery
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}