package com.fastservices.sams.databinding;
import com.fastservices.sams.R;
import com.fastservices.sams.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSkuListBindingImpl extends FragmentSkuListBinding implements com.fastservices.sams.generated.callback.OnClickListener.Listener, com.fastservices.sams.generated.callback.OnTextChanged.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.bottomLayout, 3);
        sViewsWithIds.put(R.id.searchLayout, 4);
        sViewsWithIds.put(R.id.rvSKUs, 5);
        sViewsWithIds.put(R.id.emptyView, 6);
        sViewsWithIds.put(R.id.tvTotalPrice, 7);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.databinding.adapters.TextViewBindingAdapter.OnTextChanged mCallback8;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener etFilterandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.searchQuerySKU.get()
            //         is viewModel.searchQuerySKU.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(etFilter);
            // localize variables for thread safety
            // viewModel.searchQuerySKU
            android.databinding.ObservableField<java.lang.String> viewModelSearchQuerySKU = null;
            // viewModel.searchQuerySKU.get()
            java.lang.String viewModelSearchQuerySKUGet = null;
            // viewModel
            com.fastservices.sams.modules.takeorder.OrderVM viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.searchQuerySKU != null
            boolean viewModelSearchQuerySKUJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelSearchQuerySKU = viewModel.getSearchQuerySKU();

                viewModelSearchQuerySKUJavaLangObjectNull = (viewModelSearchQuerySKU) != (null);
                if (viewModelSearchQuerySKUJavaLangObjectNull) {




                    viewModelSearchQuerySKU.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentSkuListBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentSkuListBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.view.View) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[6]
            , (android.widget.EditText) bindings[1]
            , (android.support.v7.widget.RecyclerView) bindings[5]
            , (android.widget.FrameLayout) bindings[4]
            , (android.widget.TextView) bindings[7]
            );
        this.btnOrderSummary.setTag(null);
        this.etFilter.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback9 = new com.fastservices.sams.generated.callback.OnClickListener(this, 2);
        mCallback8 = new com.fastservices.sams.generated.callback.OnTextChanged(this, 1);
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
            setViewModel((com.fastservices.sams.modules.takeorder.OrderVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.fastservices.sams.modules.takeorder.OrderVM ViewModel) {
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
                return onChangeViewModelSearchQuerySKU((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSearchQuerySKU(android.databinding.ObservableField<java.lang.String> ViewModelSearchQuerySKU, int fieldId) {
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
        java.lang.String viewModelSearchQuerySKUGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelSearchQuerySKU = null;
        com.fastservices.sams.modules.takeorder.OrderVM viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.searchQuerySKU
                    viewModelSearchQuerySKU = viewModel.getSearchQuerySKU();
                }
                updateRegistration(0, viewModelSearchQuerySKU);


                if (viewModelSearchQuerySKU != null) {
                    // read viewModel.searchQuerySKU.get()
                    viewModelSearchQuerySKUGet = viewModelSearchQuerySKU.get();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.btnOrderSummary.setOnClickListener(mCallback9);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etFilter, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, mCallback8, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etFilterandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.etFilter, viewModelSearchQuerySKUGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.fastservices.sams.modules.takeorder.OrderVM viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.orderSummaryClicked();
        }
    }
    public final void _internalCallbackOnTextChanged(int sourceId , java.lang.CharSequence callbackArg_0, int callbackArg_1, int callbackArg_2, int callbackArg_3) {
        // localize variables for thread safety
        // viewModel
        com.fastservices.sams.modules.takeorder.OrderVM viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            if ((callbackArg_0) != (null)) {


                callbackArg_0.toString();

                viewModel.applySKUFilter(callbackArg_0.toString());
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.searchQuerySKU
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}