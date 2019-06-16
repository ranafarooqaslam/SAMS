package com.fastservices.sams.databinding;
import com.fastservices.sams.R;
import com.fastservices.sams.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentOutletNoOrderBindingImpl extends FragmentOutletNoOrderBinding implements com.fastservices.sams.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.bottomLayout, 8);
        sViewsWithIds.put(R.id.ivStore, 9);
        sViewsWithIds.put(R.id.lblStoreName, 10);
        sViewsWithIds.put(R.id.lblStoreAddress, 11);
        sViewsWithIds.put(R.id.lblOwnerName, 12);
        sViewsWithIds.put(R.id.lblContactNumber, 13);
        sViewsWithIds.put(R.id.tvContactNumber, 14);
        sViewsWithIds.put(R.id.lblStoreType, 15);
        sViewsWithIds.put(R.id.tvStoreType, 16);
        sViewsWithIds.put(R.id.lblLastOrderDate, 17);
        sViewsWithIds.put(R.id.tvLastOrderDate, 18);
        sViewsWithIds.put(R.id.lblLastOrderAmount, 19);
        sViewsWithIds.put(R.id.tvLastOrderAmount, 20);
        sViewsWithIds.put(R.id.lblClosingBalance, 21);
        sViewsWithIds.put(R.id.tvClosingBalance, 22);
        sViewsWithIds.put(R.id.divider, 23);
        sViewsWithIds.put(R.id.btnTakeGPS, 24);
        sViewsWithIds.put(R.id.tvMapLink, 25);
        sViewsWithIds.put(R.id.ivCamera, 26);
        sViewsWithIds.put(R.id.lblPicture, 27);
        sViewsWithIds.put(R.id.imagesContainer, 28);
        sViewsWithIds.put(R.id.divider2, 29);
        sViewsWithIds.put(R.id.lblReason, 30);
        sViewsWithIds.put(R.id.multiLineRadioGroup, 31);
        sViewsWithIds.put(R.id.textView2, 32);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener etRemarksandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.comments
            //         is viewModel.setComments((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(etRemarks);
            // localize variables for thread safety
            // viewModel
            com.fastservices.sams.modules.outletnoorder.OutletNoOrderVM viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.comments
            java.lang.String viewModelComments = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {




                viewModel.setComments(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public FragmentOutletNoOrderBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 33, sIncludes, sViewsWithIds));
    }
    private FragmentOutletNoOrderBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.view.View) bindings[8]
            , (android.widget.TextView) bindings[7]
            , (android.widget.Button) bindings[24]
            , (android.support.constraint.ConstraintLayout) bindings[4]
            , (android.view.View) bindings[23]
            , (android.view.View) bindings[29]
            , (android.widget.EditText) bindings[6]
            , (android.widget.LinearLayout) bindings[28]
            , (android.widget.ImageView) bindings[26]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[27]
            , (android.widget.TextView) bindings[30]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[15]
            , (com.whygraphics.multilineradiogroup.MultiLineRadioGroup) bindings[31]
            , (android.widget.TextView) bindings[32]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[16]
            );
        this.btnSubmit.setTag(null);
        this.detailsLayout.setTag(null);
        this.etRemarks.setTag(null);
        this.ivCollapse.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvOwnerName.setTag(null);
        this.tvStoreAddress.setTag(null);
        this.tvStoreName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new com.fastservices.sams.generated.callback.OnClickListener(this, 2);
        mCallback4 = new com.fastservices.sams.generated.callback.OnClickListener(this, 1);
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
            setViewModel((com.fastservices.sams.modules.outletnoorder.OutletNoOrderVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.fastservices.sams.modules.outletnoorder.OutletNoOrderVM ViewModel) {
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
                return onChangeViewModelToggleDetailLayout((android.databinding.ObservableField<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelToggleDetailLayout(android.databinding.ObservableField<java.lang.Integer> ViewModelToggleDetailLayout, int fieldId) {
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
        java.lang.String viewModelOutletStoreAddress = null;
        android.databinding.ObservableField<java.lang.Integer> viewModelToggleDetailLayout = null;
        java.lang.Integer viewModelToggleDetailLayoutGet = null;
        java.lang.String viewModelOutletOwnerName = null;
        int androidDatabindingViewDataBindingSafeUnboxViewModelToggleDetailLayoutGet = 0;
        java.lang.String viewModelOutletOutletName = null;
        com.fastservices.sams.data.entities.Outlet viewModelOutlet = null;
        java.lang.String viewModelComments = null;
        com.fastservices.sams.modules.outletnoorder.OutletNoOrderVM viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.toggleDetailLayout
                    viewModelToggleDetailLayout = viewModel.getToggleDetailLayout();
                }
                updateRegistration(0, viewModelToggleDetailLayout);


                if (viewModelToggleDetailLayout != null) {
                    // read viewModel.toggleDetailLayout.get()
                    viewModelToggleDetailLayoutGet = viewModelToggleDetailLayout.get();
                }


                // read android.databinding.ViewDataBinding.safeUnbox(viewModel.toggleDetailLayout.get())
                androidDatabindingViewDataBindingSafeUnboxViewModelToggleDetailLayoutGet = android.databinding.ViewDataBinding.safeUnbox(viewModelToggleDetailLayoutGet);
            if ((dirtyFlags & 0x6L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.outlet
                        viewModelOutlet = viewModel.getOutlet();
                        // read viewModel.comments
                        viewModelComments = viewModel.getComments();
                    }


                    if (viewModelOutlet != null) {
                        // read viewModel.outlet.storeAddress
                        viewModelOutletStoreAddress = viewModelOutlet.getStoreAddress();
                        // read viewModel.outlet.ownerName
                        viewModelOutletOwnerName = viewModelOutlet.getOwnerName();
                        // read viewModel.outlet.outletName
                        viewModelOutletOutletName = viewModelOutlet.getOutletName();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.btnSubmit.setOnClickListener(mCallback5);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etRemarks, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etRemarksandroidTextAttrChanged);
            this.ivCollapse.setOnClickListener(mCallback4);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.detailsLayout.setVisibility(androidDatabindingViewDataBindingSafeUnboxViewModelToggleDetailLayoutGet);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.etRemarks, viewModelComments);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvOwnerName, viewModelOutletOwnerName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvStoreAddress, viewModelOutletStoreAddress);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvStoreName, viewModelOutletOutletName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.fastservices.sams.modules.outletnoorder.OutletNoOrderVM viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.submitNoOrder();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.fastservices.sams.modules.outletnoorder.OutletNoOrderVM viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.collapseClicked();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.toggleDetailLayout
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}