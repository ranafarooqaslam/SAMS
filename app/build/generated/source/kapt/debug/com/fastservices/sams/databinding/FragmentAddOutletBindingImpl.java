package com.fastservices.sams.databinding;
import com.fastservices.sams.R;
import com.fastservices.sams.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddOutletBindingImpl extends FragmentAddOutletBinding implements com.fastservices.sams.generated.callback.OnCheckedChangeListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.bottomLayout, 9);
        sViewsWithIds.put(R.id.scrollView, 10);
        sViewsWithIds.put(R.id.tilStoreName, 11);
        sViewsWithIds.put(R.id.tilOwnerName, 12);
        sViewsWithIds.put(R.id.tilPhoneNumber, 13);
        sViewsWithIds.put(R.id.tilStoreAddress, 14);
        sViewsWithIds.put(R.id.tilLandMark, 15);
        sViewsWithIds.put(R.id.spSector, 16);
        sViewsWithIds.put(R.id.spLocality, 17);
        sViewsWithIds.put(R.id.btnTakeGPS, 18);
        sViewsWithIds.put(R.id.tvMapLink, 19);
        sViewsWithIds.put(R.id.spChannel, 20);
        sViewsWithIds.put(R.id.spSubchannel, 21);
        sViewsWithIds.put(R.id.lblArea, 22);
        sViewsWithIds.put(R.id.rgArea, 23);
        sViewsWithIds.put(R.id.lblComments, 24);
        sViewsWithIds.put(R.id.lblPicture, 25);
        sViewsWithIds.put(R.id.ivCamera, 26);
        sViewsWithIds.put(R.id.imagesContainer, 27);
        sViewsWithIds.put(R.id.tvSubmit, 28);
    }
    // views
    @NonNull
    private final android.widget.EditText mboundView1;
    @NonNull
    private final android.widget.EditText mboundView2;
    @NonNull
    private final android.widget.EditText mboundView3;
    @NonNull
    private final android.widget.EditText mboundView4;
    @NonNull
    private final android.widget.EditText mboundView5;
    @NonNull
    private final android.widget.RadioButton mboundView6;
    @NonNull
    private final android.widget.RadioButton mboundView7;
    // variables
    @Nullable
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback11;
    @Nullable
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback10;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener etCommentandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.outlet.Comments
            //         is viewModel.outlet.setComments((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(etComment);
            // localize variables for thread safety
            // viewModel.outlet
            com.fastservices.sams.data.entities.OutletLocal viewModelOutlet = null;
            // viewModel.outlet != null
            boolean viewModelOutletJavaLangObjectNull = false;
            // viewModel
            com.fastservices.sams.modules.addoutlet.AddOutletVM viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.outlet.Comments
            java.lang.String viewModelOutletComments = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelOutlet = viewModel.getOutlet();

                viewModelOutletJavaLangObjectNull = (viewModelOutlet) != (null);
                if (viewModelOutletJavaLangObjectNull) {




                    viewModelOutlet.setComments(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView1androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.outlet.OutletName
            //         is viewModel.outlet.setOutletName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView1);
            // localize variables for thread safety
            // viewModel.outlet
            com.fastservices.sams.data.entities.OutletLocal viewModelOutlet = null;
            // viewModel.outlet != null
            boolean viewModelOutletJavaLangObjectNull = false;
            // viewModel
            com.fastservices.sams.modules.addoutlet.AddOutletVM viewModel = mViewModel;
            // viewModel.outlet.OutletName
            java.lang.String viewModelOutletOutletName = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelOutlet = viewModel.getOutlet();

                viewModelOutletJavaLangObjectNull = (viewModelOutlet) != (null);
                if (viewModelOutletJavaLangObjectNull) {




                    viewModelOutlet.setOutletName(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.outlet.OwnerName
            //         is viewModel.outlet.setOwnerName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // viewModel.outlet
            com.fastservices.sams.data.entities.OutletLocal viewModelOutlet = null;
            // viewModel.outlet != null
            boolean viewModelOutletJavaLangObjectNull = false;
            // viewModel
            com.fastservices.sams.modules.addoutlet.AddOutletVM viewModel = mViewModel;
            // viewModel.outlet.OwnerName
            java.lang.String viewModelOutletOwnerName = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelOutlet = viewModel.getOutlet();

                viewModelOutletJavaLangObjectNull = (viewModelOutlet) != (null);
                if (viewModelOutletJavaLangObjectNull) {




                    viewModelOutlet.setOwnerName(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView3androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.outlet.PhoneNumber
            //         is viewModel.outlet.setPhoneNumber((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView3);
            // localize variables for thread safety
            // viewModel.outlet.PhoneNumber
            java.lang.String viewModelOutletPhoneNumber = null;
            // viewModel.outlet
            com.fastservices.sams.data.entities.OutletLocal viewModelOutlet = null;
            // viewModel.outlet != null
            boolean viewModelOutletJavaLangObjectNull = false;
            // viewModel
            com.fastservices.sams.modules.addoutlet.AddOutletVM viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelOutlet = viewModel.getOutlet();

                viewModelOutletJavaLangObjectNull = (viewModelOutlet) != (null);
                if (viewModelOutletJavaLangObjectNull) {




                    viewModelOutlet.setPhoneNumber(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView4androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.outlet.OutletAddress
            //         is viewModel.outlet.setOutletAddress((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView4);
            // localize variables for thread safety
            // viewModel.outlet
            com.fastservices.sams.data.entities.OutletLocal viewModelOutlet = null;
            // viewModel.outlet != null
            boolean viewModelOutletJavaLangObjectNull = false;
            // viewModel.outlet.OutletAddress
            java.lang.String viewModelOutletOutletAddress = null;
            // viewModel
            com.fastservices.sams.modules.addoutlet.AddOutletVM viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelOutlet = viewModel.getOutlet();

                viewModelOutletJavaLangObjectNull = (viewModelOutlet) != (null);
                if (viewModelOutletJavaLangObjectNull) {




                    viewModelOutlet.setOutletAddress(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView5androidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.outlet.LandMark
            //         is viewModel.outlet.setLandMark((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView5);
            // localize variables for thread safety
            // viewModel.outlet
            com.fastservices.sams.data.entities.OutletLocal viewModelOutlet = null;
            // viewModel.outlet != null
            boolean viewModelOutletJavaLangObjectNull = false;
            // viewModel.outlet.LandMark
            java.lang.String viewModelOutletLandMark = null;
            // viewModel
            com.fastservices.sams.modules.addoutlet.AddOutletVM viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelOutlet = viewModel.getOutlet();

                viewModelOutletJavaLangObjectNull = (viewModelOutlet) != (null);
                if (viewModelOutletJavaLangObjectNull) {




                    viewModelOutlet.setLandMark(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentAddOutletBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 29, sIncludes, sViewsWithIds));
    }
    private FragmentAddOutletBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.view.View) bindings[9]
            , (android.widget.Button) bindings[18]
            , (android.widget.EditText) bindings[8]
            , (android.widget.LinearLayout) bindings[27]
            , (android.widget.ImageView) bindings[26]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[25]
            , (android.widget.RadioGroup) bindings[23]
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.ScrollView) bindings[10]
            , (fr.ganfra.materialspinner.MaterialSpinner) bindings[20]
            , (fr.ganfra.materialspinner.MaterialSpinner) bindings[17]
            , (fr.ganfra.materialspinner.MaterialSpinner) bindings[16]
            , (fr.ganfra.materialspinner.MaterialSpinner) bindings[21]
            , (android.support.design.widget.TextInputLayout) bindings[15]
            , (android.support.design.widget.TextInputLayout) bindings[12]
            , (android.support.design.widget.TextInputLayout) bindings[13]
            , (android.support.design.widget.TextInputLayout) bindings[14]
            , (android.support.design.widget.TextInputLayout) bindings[11]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[28]
            );
        this.etComment.setTag(null);
        this.mboundView1 = (android.widget.EditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.EditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.EditText) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.EditText) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.EditText) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.RadioButton) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.RadioButton) bindings[7];
        this.mboundView7.setTag(null);
        this.rootLayout.setTag(null);
        setRootTag(root);
        // listeners
        mCallback11 = new com.fastservices.sams.generated.callback.OnCheckedChangeListener(this, 2);
        mCallback10 = new com.fastservices.sams.generated.callback.OnCheckedChangeListener(this, 1);
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
            setViewModel((com.fastservices.sams.modules.addoutlet.AddOutletVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.fastservices.sams.modules.addoutlet.AddOutletVM ViewModel) {
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
        java.lang.String viewModelOutletPhoneNumber = null;
        java.lang.String viewModelOutletOutletAddress = null;
        java.lang.String viewModelOutletLandMark = null;
        java.lang.String viewModelOutletOutletName = null;
        com.fastservices.sams.data.entities.OutletLocal viewModelOutlet = null;
        java.lang.String viewModelOutletOwnerName = null;
        com.fastservices.sams.modules.addoutlet.AddOutletVM viewModel = mViewModel;
        java.lang.String viewModelOutletComments = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.outlet
                    viewModelOutlet = viewModel.getOutlet();
                }


                if (viewModelOutlet != null) {
                    // read viewModel.outlet.PhoneNumber
                    viewModelOutletPhoneNumber = viewModelOutlet.getPhoneNumber();
                    // read viewModel.outlet.OutletAddress
                    viewModelOutletOutletAddress = viewModelOutlet.getOutletAddress();
                    // read viewModel.outlet.LandMark
                    viewModelOutletLandMark = viewModelOutlet.getLandMark();
                    // read viewModel.outlet.OutletName
                    viewModelOutletOutletName = viewModelOutlet.getOutletName();
                    // read viewModel.outlet.OwnerName
                    viewModelOutletOwnerName = viewModelOutlet.getOwnerName();
                    // read viewModel.outlet.Comments
                    viewModelOutletComments = viewModelOutlet.getComments();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.etComment, viewModelOutletComments);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewModelOutletOutletName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelOutletOwnerName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelOutletPhoneNumber);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewModelOutletOutletAddress);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewModelOutletLandMark);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etComment, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etCommentandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView1androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView3, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView3androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView5, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView5androidTextAttrChanged);
            android.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.mboundView6, mCallback10, (android.databinding.InverseBindingListener)null);
            android.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.mboundView7, mCallback11, (android.databinding.InverseBindingListener)null);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnCheckedChanged(int sourceId , android.widget.CompoundButton callbackArg_0, boolean callbackArg_1) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.fastservices.sams.modules.addoutlet.AddOutletVM viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.ruralSelected();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.fastservices.sams.modules.addoutlet.AddOutletVM viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.urbanSelected();
                }
                break;
            }
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