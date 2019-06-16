package com.fastservices.sams.databinding;
import com.fastservices.sams.R;
import com.fastservices.sams.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMerchandisingBindingImpl extends FragmentMerchandisingBinding implements com.fastservices.sams.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.bottomLayout, 3);
        sViewsWithIds.put(R.id.tvSelectedOutlet, 4);
        sViewsWithIds.put(R.id.divider1, 5);
        sViewsWithIds.put(R.id.ivFullImage, 6);
        sViewsWithIds.put(R.id.lblStockImage, 7);
        sViewsWithIds.put(R.id.ivCameraBeforeMerchandise, 8);
        sViewsWithIds.put(R.id.imageContainerBefore, 9);
        sViewsWithIds.put(R.id.divider2, 10);
        sViewsWithIds.put(R.id.lblInvoiceImage, 11);
        sViewsWithIds.put(R.id.ivCameraAfterMerchandise, 12);
        sViewsWithIds.put(R.id.imageContainerAfter, 13);
        sViewsWithIds.put(R.id.divider3, 14);
        sViewsWithIds.put(R.id.lblComments, 15);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener etCommentandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.merchandise.Remarks
            //         is viewModel.merchandise.setRemarks((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(etComment);
            // localize variables for thread safety
            // viewModel.merchandise != null
            boolean viewModelMerchandiseJavaLangObjectNull = false;
            // viewModel
            com.fastservices.sams.modules.merchandise.MerchandisingVM viewModel = mViewModel;
            // viewModel.merchandise
            com.fastservices.sams.data.entities.Merchandise viewModelMerchandise = null;
            // viewModel.merchandise.Remarks
            java.lang.String viewModelMerchandiseRemarks = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelMerchandise = viewModel.getMerchandise();

                viewModelMerchandiseJavaLangObjectNull = (viewModelMerchandise) != (null);
                if (viewModelMerchandiseJavaLangObjectNull) {




                    viewModelMerchandise.setRemarks(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentMerchandisingBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private FragmentMerchandisingBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.view.View) bindings[3]
            , (android.view.View) bindings[5]
            , (android.view.View) bindings[10]
            , (android.view.View) bindings[14]
            , (android.widget.EditText) bindings[1]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[4]
            );
        this.etComment.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        mCallback16 = new com.fastservices.sams.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            setViewModel((com.fastservices.sams.modules.merchandise.MerchandisingVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.fastservices.sams.modules.merchandise.MerchandisingVM ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.fastservices.sams.data.entities.Merchandise viewModelMerchandise = null;
        java.lang.String viewModelMerchandiseRemarks = null;
        com.fastservices.sams.modules.merchandise.MerchandisingVM viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.merchandise
                    viewModelMerchandise = viewModel.getMerchandise();
                }


                if (viewModelMerchandise != null) {
                    // read viewModel.merchandise.Remarks
                    viewModelMerchandiseRemarks = viewModelMerchandise.getRemarks();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.etComment, viewModelMerchandiseRemarks);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etComment, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etCommentandroidTextAttrChanged);
            this.mboundView2.setOnClickListener(mCallback16);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.fastservices.sams.modules.merchandise.MerchandisingVM viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.submitMerchandising();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}