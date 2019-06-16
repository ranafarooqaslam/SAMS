package com.fastservices.sams.databinding;
import com.fastservices.sams.R;
import com.fastservices.sams.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentOrderSummaryBindingImpl extends FragmentOrderSummaryBinding implements com.fastservices.sams.generated.callback.OnCheckedChangeListener.Listener, com.fastservices.sams.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.bottomLayout, 6);
        sViewsWithIds.put(R.id.lblGrossAmount, 7);
        sViewsWithIds.put(R.id.lblDistDiscount, 8);
        sViewsWithIds.put(R.id.lblTradeOffer, 9);
        sViewsWithIds.put(R.id.lblNetAmount, 10);
        sViewsWithIds.put(R.id.lblCompanyDiscount, 11);
        sViewsWithIds.put(R.id.lblGST, 12);
        sViewsWithIds.put(R.id.tvGrossAmount, 13);
        sViewsWithIds.put(R.id.tvDistDiscount, 14);
        sViewsWithIds.put(R.id.tvTradeOffer, 15);
        sViewsWithIds.put(R.id.tvNetAmount, 16);
        sViewsWithIds.put(R.id.tvCompanyDiscount, 17);
        sViewsWithIds.put(R.id.tvGST, 18);
        sViewsWithIds.put(R.id.lblRemarks, 19);
        sViewsWithIds.put(R.id.lblFreeSKUs, 20);
        sViewsWithIds.put(R.id.llFreeSkusContainer, 21);
        sViewsWithIds.put(R.id.btnBack, 22);
        sViewsWithIds.put(R.id.btnCancel, 23);
        sViewsWithIds.put(R.id.radioGroup, 24);
    }
    // views
    @NonNull
    private final android.support.v4.widget.NestedScrollView mboundView0;
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView1;
    // variables
    @Nullable
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener etRemarksandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.remarks
            //         is viewModel.setRemarks((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(etRemarks);
            // localize variables for thread safety
            // viewModel.remarks
            java.lang.String viewModelRemarks = null;
            // viewModel
            com.fastservices.sams.modules.takeorder.OrderVM viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {




                viewModel.setRemarks(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public FragmentOrderSummaryBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 25, sIncludes, sViewsWithIds));
    }
    private FragmentOrderSummaryBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.view.View) bindings[6]
            , (android.widget.Button) bindings[22]
            , (android.widget.Button) bindings[23]
            , (android.widget.TextView) bindings[2]
            , (android.widget.EditText) bindings[3]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[9]
            , (android.widget.LinearLayout) bindings[21]
            , (android.widget.RadioButton) bindings[4]
            , (android.widget.RadioButton) bindings[5]
            , (android.widget.RadioGroup) bindings[24]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[15]
            );
        this.btnOrderComplete.setTag(null);
        this.etRemarks.setTag(null);
        this.mboundView0 = (android.support.v4.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.support.constraint.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.radioCash.setTag(null);
        this.radioCredit.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.fastservices.sams.generated.callback.OnCheckedChangeListener(this, 2);
        mCallback1 = new com.fastservices.sams.generated.callback.OnClickListener(this, 1);
        mCallback3 = new com.fastservices.sams.generated.callback.OnCheckedChangeListener(this, 3);
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
        java.lang.String viewModelRemarks = null;
        com.fastservices.sams.modules.takeorder.OrderVM viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.remarks
                    viewModelRemarks = viewModel.getRemarks();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.btnOrderComplete.setOnClickListener(mCallback1);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etRemarks, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etRemarksandroidTextAttrChanged);
            android.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.radioCash, mCallback2, (android.databinding.InverseBindingListener)null);
            android.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.radioCredit, mCallback3, (android.databinding.InverseBindingListener)null);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.etRemarks, viewModelRemarks);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnCheckedChanged(int sourceId , android.widget.CompoundButton callbackArg_0, boolean callbackArg_1) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.fastservices.sams.modules.takeorder.OrderVM viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.paymentTypeCash();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.fastservices.sams.modules.takeorder.OrderVM viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.paymentTypeCredit();
                }
                break;
            }
        }
    }
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.fastservices.sams.modules.takeorder.OrderVM viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.saveOrderNow();
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