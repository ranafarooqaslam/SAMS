package com.fastservices.sams.databinding;
import com.fastservices.sams.R;
import com.fastservices.sams.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentTakeOrderBindingImpl extends FragmentTakeOrderBinding implements com.fastservices.sams.generated.callback.OnTextChanged.Listener, com.fastservices.sams.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.bottomLayout, 10);
        sViewsWithIds.put(R.id.ivStore, 11);
        sViewsWithIds.put(R.id.lblStoreName, 12);
        sViewsWithIds.put(R.id.lblStoreAddress, 13);
        sViewsWithIds.put(R.id.lblOwnerName, 14);
        sViewsWithIds.put(R.id.lblContactNumber, 15);
        sViewsWithIds.put(R.id.lblStoreType, 16);
        sViewsWithIds.put(R.id.tvStoreType, 17);
        sViewsWithIds.put(R.id.lblLastOrderDate, 18);
        sViewsWithIds.put(R.id.tvLastOrderDate, 19);
        sViewsWithIds.put(R.id.lblLastOrderAmount, 20);
        sViewsWithIds.put(R.id.tvLastOrderAmount, 21);
        sViewsWithIds.put(R.id.lblClosingBalance, 22);
        sViewsWithIds.put(R.id.tvClosingBalance, 23);
        sViewsWithIds.put(R.id.divider, 24);
        sViewsWithIds.put(R.id.btnTakeGPS, 25);
        sViewsWithIds.put(R.id.tvMapLink, 26);
        sViewsWithIds.put(R.id.ivCamera, 27);
        sViewsWithIds.put(R.id.lblPicture, 28);
        sViewsWithIds.put(R.id.imagesContainer, 29);
        sViewsWithIds.put(R.id.divider2, 30);
        sViewsWithIds.put(R.id.searchLayout, 31);
        sViewsWithIds.put(R.id.rvCategories, 32);
        sViewsWithIds.put(R.id.emptyView, 33);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView9;
    // variables
    @Nullable
    private final android.databinding.adapters.TextViewBindingAdapter.OnTextChanged mCallback19;
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback20;
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener etFilterandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.searchQuery
            //         is viewModel.setSearchQuery((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(etFilter);
            // localize variables for thread safety
            // viewModel.searchQuery
            java.lang.String viewModelSearchQuery = null;
            // viewModel
            com.fastservices.sams.modules.takeorder.OrderVM viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {




                viewModel.setSearchQuery(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public FragmentTakeOrderBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 34, sIncludes, sViewsWithIds));
    }
    private FragmentTakeOrderBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.view.View) bindings[10]
            , (android.widget.Button) bindings[25]
            , (android.support.constraint.ConstraintLayout) bindings[4]
            , (android.view.View) bindings[24]
            , (android.view.View) bindings[30]
            , (android.widget.TextView) bindings[33]
            , (android.widget.EditText) bindings[8]
            , (android.widget.LinearLayout) bindings[29]
            , (android.widget.ImageView) bindings[27]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[28]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[16]
            , (android.support.v7.widget.RecyclerView) bindings[32]
            , (android.widget.LinearLayout) bindings[31]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[17]
            );
        this.detailsLayout.setTag(null);
        this.etFilter.setTag(null);
        this.ivCollapse.setTag(null);
        this.ivSorting.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        this.tvContactNumber.setTag(null);
        this.tvOwnerName.setTag(null);
        this.tvStoreAddress.setTag(null);
        this.tvStoreName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback19 = new com.fastservices.sams.generated.callback.OnTextChanged(this, 3);
        mCallback17 = new com.fastservices.sams.generated.callback.OnClickListener(this, 1);
        mCallback20 = new com.fastservices.sams.generated.callback.OnClickListener(this, 4);
        mCallback18 = new com.fastservices.sams.generated.callback.OnClickListener(this, 2);
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
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelToggleDetailLayout((android.databinding.ObservableField<java.lang.Integer>) object, fieldId);
            case 1 :
                return onChangeViewModelAscending((android.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
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
    private boolean onChangeViewModelAscending(android.databinding.ObservableField<java.lang.Boolean> ViewModelAscending, int fieldId) {
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
        java.lang.String viewModelOutletStoreAddress = null;
        java.lang.Boolean viewModelAscendingGet = null;
        android.databinding.ObservableField<java.lang.Integer> viewModelToggleDetailLayout = null;
        java.lang.String viewModelOutletPhoneNumber = null;
        java.lang.Integer viewModelToggleDetailLayoutGet = null;
        java.lang.String viewModelSearchQuery = null;
        android.graphics.drawable.Drawable viewModelAscendingGetIvSortingAndroidDrawableIcSortAscIvSortingAndroidDrawableIcSortDesc = null;
        java.lang.String viewModelOutletOwnerName = null;
        int androidDatabindingViewDataBindingSafeUnboxViewModelToggleDetailLayoutGet = 0;
        android.databinding.ObservableField<java.lang.Boolean> viewModelAscending = null;
        java.lang.String viewModelOutletOutletName = null;
        com.fastservices.sams.data.entities.Outlet viewModelOutlet = null;
        boolean androidDatabindingViewDataBindingSafeUnboxViewModelAscendingGet = false;
        com.fastservices.sams.modules.takeorder.OrderVM viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

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
            }
            if ((dirtyFlags & 0xcL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.searchQuery
                        viewModelSearchQuery = viewModel.getSearchQuery();
                        // read viewModel.outlet
                        viewModelOutlet = viewModel.getOutlet();
                    }


                    if (viewModelOutlet != null) {
                        // read viewModel.outlet.storeAddress
                        viewModelOutletStoreAddress = viewModelOutlet.getStoreAddress();
                        // read viewModel.outlet.phoneNumber
                        viewModelOutletPhoneNumber = viewModelOutlet.getPhoneNumber();
                        // read viewModel.outlet.ownerName
                        viewModelOutletOwnerName = viewModelOutlet.getOwnerName();
                        // read viewModel.outlet.outletName
                        viewModelOutletOutletName = viewModelOutlet.getOutletName();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.ascending
                        viewModelAscending = viewModel.getAscending();
                    }
                    updateRegistration(1, viewModelAscending);


                    if (viewModelAscending != null) {
                        // read viewModel.ascending.get()
                        viewModelAscendingGet = viewModelAscending.get();
                    }


                    // read android.databinding.ViewDataBinding.safeUnbox(viewModel.ascending.get())
                    androidDatabindingViewDataBindingSafeUnboxViewModelAscendingGet = android.databinding.ViewDataBinding.safeUnbox(viewModelAscendingGet);
                if((dirtyFlags & 0xeL) != 0) {
                    if(androidDatabindingViewDataBindingSafeUnboxViewModelAscendingGet) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read android.databinding.ViewDataBinding.safeUnbox(viewModel.ascending.get()) ? @android:drawable/ic_sort_asc : @android:drawable/ic_sort_desc
                    viewModelAscendingGetIvSortingAndroidDrawableIcSortAscIvSortingAndroidDrawableIcSortDesc = ((androidDatabindingViewDataBindingSafeUnboxViewModelAscendingGet) ? (getDrawableFromResource(ivSorting, R.drawable.ic_sort_asc)) : (getDrawableFromResource(ivSorting, R.drawable.ic_sort_desc)));
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.detailsLayout.setVisibility(androidDatabindingViewDataBindingSafeUnboxViewModelToggleDetailLayoutGet);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.etFilter, viewModelSearchQuery);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvContactNumber, viewModelOutletPhoneNumber);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvOwnerName, viewModelOutletOwnerName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvStoreAddress, viewModelOutletStoreAddress);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvStoreName, viewModelOutletOutletName);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etFilter, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, mCallback19, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etFilterandroidTextAttrChanged);
            this.ivCollapse.setOnClickListener(mCallback17);
            this.ivSorting.setOnClickListener(mCallback18);
            this.mboundView9.setOnClickListener(mCallback20);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            android.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.ivSorting, viewModelAscendingGetIvSortingAndroidDrawableIcSortAscIvSortingAndroidDrawableIcSortDesc);
        }
    }
    // Listener Stub Implementations
    // callback impls
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

                viewModel.applyFilter(callbackArg_0.toString());
            }
        }
    }
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.fastservices.sams.modules.takeorder.OrderVM viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.collapseClicked();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                com.fastservices.sams.modules.takeorder.OrderVM viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.orderSummaryClicked();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.fastservices.sams.modules.takeorder.OrderVM viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.sorting();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.toggleDetailLayout
        flag 1 (0x2L): viewModel.ascending
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): android.databinding.ViewDataBinding.safeUnbox(viewModel.ascending.get()) ? @android:drawable/ic_sort_asc : @android:drawable/ic_sort_desc
        flag 5 (0x6L): android.databinding.ViewDataBinding.safeUnbox(viewModel.ascending.get()) ? @android:drawable/ic_sort_asc : @android:drawable/ic_sort_desc
    flag mapping end*/
    //end
}