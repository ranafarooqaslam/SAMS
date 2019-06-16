package com.fastservices.sams.databinding;
import com.fastservices.sams.R;
import com.fastservices.sams.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentReplacementBindingImpl extends FragmentReplacementBinding implements com.fastservices.sams.generated.callback.OnClickListener.Listener, com.fastservices.sams.generated.callback.OnCheckedChangeListener.Listener, com.fastservices.sams.generated.callback.AfterTextChanged.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.bottomLayout, 9);
        sViewsWithIds.put(R.id.tvSelectedOutlet, 10);
        sViewsWithIds.put(R.id.rgReason, 11);
        sViewsWithIds.put(R.id.spReason, 12);
        sViewsWithIds.put(R.id.tilDescription, 13);
        sViewsWithIds.put(R.id.spSKU, 14);
        sViewsWithIds.put(R.id.tilQuantity, 15);
        sViewsWithIds.put(R.id.lblTotalAmount, 16);
        sViewsWithIds.put(R.id.tilInvoice, 17);
        sViewsWithIds.put(R.id.tilBatchNumber, 18);
        sViewsWithIds.put(R.id.lblPurchaseDate, 19);
        sViewsWithIds.put(R.id.ivCalender, 20);
        sViewsWithIds.put(R.id.tvPurchaseDate, 21);
        sViewsWithIds.put(R.id.divider1, 22);
        sViewsWithIds.put(R.id.lblStockImage, 23);
        sViewsWithIds.put(R.id.ivCameraStockImage, 24);
        sViewsWithIds.put(R.id.imagesContainerStock, 25);
        sViewsWithIds.put(R.id.divider2, 26);
        sViewsWithIds.put(R.id.lblInvoiceImage, 27);
        sViewsWithIds.put(R.id.ivCameraInvoice, 28);
        sViewsWithIds.put(R.id.imagesContainerInvoice, 29);
        sViewsWithIds.put(R.id.divider3, 30);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.RadioButton mboundView1;
    @NonNull
    private final android.widget.RadioButton mboundView2;
    @NonNull
    private final android.widget.EditText mboundView3;
    @NonNull
    private final android.widget.EditText mboundView4;
    @NonNull
    private final android.widget.EditText mboundView6;
    @NonNull
    private final android.widget.EditText mboundView7;
    @NonNull
    private final android.widget.TextView mboundView8;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback13;
    @Nullable
    private final android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged mCallback14;
    @Nullable
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback12;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener mboundView3androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.description
            //         is viewModel.setDescription((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView3);
            // localize variables for thread safety
            // viewModel
            com.fastservices.sams.modules.replacement.ReplacementVM viewModel = mViewModel;
            // viewModel.description
            java.lang.String viewModelDescription = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {




                viewModel.setDescription(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView4androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.quantity.get()
            //         is viewModel.quantity.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView4);
            // localize variables for thread safety
            // viewModel.quantity != null
            boolean viewModelQuantityJavaLangObjectNull = false;
            // viewModel
            com.fastservices.sams.modules.replacement.ReplacementVM viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.quantity
            android.databinding.ObservableField<java.lang.String> viewModelQuantity = null;
            // viewModel.quantity.get()
            java.lang.String viewModelQuantityGet = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelQuantity = viewModel.getQuantity();

                viewModelQuantityJavaLangObjectNull = (viewModelQuantity) != (null);
                if (viewModelQuantityJavaLangObjectNull) {




                    viewModelQuantity.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView6androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.invoiceNumber
            //         is viewModel.setInvoiceNumber((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView6);
            // localize variables for thread safety
            // viewModel
            com.fastservices.sams.modules.replacement.ReplacementVM viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.invoiceNumber
            java.lang.String viewModelInvoiceNumber = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {




                viewModel.setInvoiceNumber(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView7androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.batchNumber
            //         is viewModel.setBatchNumber((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView7);
            // localize variables for thread safety
            // viewModel.batchNumber
            java.lang.String viewModelBatchNumber = null;
            // viewModel
            com.fastservices.sams.modules.replacement.ReplacementVM viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {




                viewModel.setBatchNumber(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public FragmentReplacementBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 31, sIncludes, sViewsWithIds));
    }
    private FragmentReplacementBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.view.View) bindings[9]
            , (android.view.View) bindings[22]
            , (android.view.View) bindings[26]
            , (android.view.View) bindings[30]
            , (android.widget.LinearLayout) bindings[29]
            , (android.widget.LinearLayout) bindings[25]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.ImageView) bindings[28]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.TextView) bindings[27]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[16]
            , (android.widget.RadioGroup) bindings[11]
            , (fr.ganfra.materialspinner.MaterialSpinner) bindings[12]
            , (fr.ganfra.materialspinner.MaterialSpinner) bindings[14]
            , (android.support.design.widget.TextInputLayout) bindings[18]
            , (android.support.design.widget.TextInputLayout) bindings[13]
            , (android.support.design.widget.TextInputLayout) bindings[17]
            , (android.support.design.widget.TextInputLayout) bindings[15]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[5]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.RadioButton) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.RadioButton) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.EditText) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.EditText) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView6 = (android.widget.EditText) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.EditText) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.tvTotalAmount.setTag(null);
        setRootTag(root);
        // listeners
        mCallback15 = new com.fastservices.sams.generated.callback.OnClickListener(this, 4);
        mCallback13 = new com.fastservices.sams.generated.callback.OnCheckedChangeListener(this, 2);
        mCallback14 = new com.fastservices.sams.generated.callback.AfterTextChanged(this, 3);
        mCallback12 = new com.fastservices.sams.generated.callback.OnCheckedChangeListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            setViewModel((com.fastservices.sams.modules.replacement.ReplacementVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.fastservices.sams.modules.replacement.ReplacementVM ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelTotalPrice((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelQuantity((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelTotalPrice(android.databinding.ObservableField<java.lang.String> ViewModelTotalPrice, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelQuantity(android.databinding.ObservableField<java.lang.String> ViewModelQuantity, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        java.lang.String viewModelQuantityGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelTotalPrice = null;
        java.lang.String viewModelTotalPriceGet = null;
        java.lang.String viewModelDescription = null;
        java.lang.String viewModelBatchNumber = null;
        java.lang.String viewModelInvoiceNumber = null;
        android.databinding.ObservableField<java.lang.String> viewModelQuantity = null;
        com.fastservices.sams.modules.replacement.ReplacementVM viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.totalPrice
                        viewModelTotalPrice = viewModel.getTotalPrice();
                    }
                    updateRegistration(0, viewModelTotalPrice);


                    if (viewModelTotalPrice != null) {
                        // read viewModel.totalPrice.get()
                        viewModelTotalPriceGet = viewModelTotalPrice.get();
                    }
            }
            if ((dirtyFlags & 0xcL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.description
                        viewModelDescription = viewModel.getDescription();
                        // read viewModel.batchNumber
                        viewModelBatchNumber = viewModel.getBatchNumber();
                        // read viewModel.invoiceNumber
                        viewModelInvoiceNumber = viewModel.getInvoiceNumber();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.quantity
                        viewModelQuantity = viewModel.getQuantity();
                    }
                    updateRegistration(1, viewModelQuantity);


                    if (viewModelQuantity != null) {
                        // read viewModel.quantity.get()
                        viewModelQuantityGet = viewModelQuantity.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            android.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.mboundView1, mCallback12, (android.databinding.InverseBindingListener)null);
            android.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.mboundView2, mCallback13, (android.databinding.InverseBindingListener)null);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView3, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView3androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, mCallback14, mboundView4androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView6, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView6androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView7, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView7androidTextAttrChanged);
            this.mboundView8.setOnClickListener(mCallback15);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelDescription);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewModelInvoiceNumber);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, viewModelBatchNumber);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewModelQuantityGet);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvTotalAmount, viewModelTotalPriceGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.fastservices.sams.modules.replacement.ReplacementVM viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onClickSubmit();
        }
    }
    public final void _internalCallbackOnCheckedChanged(int sourceId , android.widget.CompoundButton callbackArg_0, boolean callbackArg_1) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.fastservices.sams.modules.replacement.ReplacementVM viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.damageRadioSelected();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.fastservices.sams.modules.replacement.ReplacementVM viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.replacementRadioSelected();
                }
                break;
            }
        }
    }
    public final void _internalCallbackAfterTextChanged(int sourceId , android.text.Editable callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.fastservices.sams.modules.replacement.ReplacementVM viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onQuantityTextChanged();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.totalPrice
        flag 1 (0x2L): viewModel.quantity
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}