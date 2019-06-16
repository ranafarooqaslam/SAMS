package com.fastservices.sams.databinding;
import com.fastservices.sams.R;
import com.fastservices.sams.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDailyProductivityBindingImpl extends FragmentDailyProductivityBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.lblScheduledOutlets, 9);
        sViewsWithIds.put(R.id.lblVisitedOutlets, 10);
        sViewsWithIds.put(R.id.lblProductiveOutlets, 11);
        sViewsWithIds.put(R.id.lblNonVisitedOutlet, 12);
        sViewsWithIds.put(R.id.lblTotalSKUs, 13);
        sViewsWithIds.put(R.id.lblTotalNetAmount, 14);
        sViewsWithIds.put(R.id.lblAvgSKU, 15);
        sViewsWithIds.put(R.id.lblAvgSKU2, 16);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDailyProductivityBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private FragmentDailyProductivityBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 8
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvAvgSKU.setTag(null);
        this.tvAvgSKU2.setTag(null);
        this.tvNonVisitedOutlet.setTag(null);
        this.tvProductiveOutlets.setTag(null);
        this.tvScheduledOutlets.setTag(null);
        this.tvTotalNetAmount.setTag(null);
        this.tvTotalSKUs.setTag(null);
        this.tvVisitedOutlets.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
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
            setViewModel((com.fastservices.sams.modules.dailyproductivity.DPViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.fastservices.sams.modules.dailyproductivity.DPViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelFOutletCount((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelFTotalSKU((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelFAvgSKU((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelFAvgAmount((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelFProductive((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModelFTotalAmount((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewModelFNonVisited((android.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeViewModelFVisited((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelFOutletCount(android.databinding.ObservableField<java.lang.String> ViewModelFOutletCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFTotalSKU(android.databinding.ObservableField<java.lang.String> ViewModelFTotalSKU, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFAvgSKU(android.databinding.ObservableField<java.lang.String> ViewModelFAvgSKU, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFAvgAmount(android.databinding.ObservableField<java.lang.String> ViewModelFAvgAmount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFProductive(android.databinding.ObservableField<java.lang.String> ViewModelFProductive, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFTotalAmount(android.databinding.ObservableField<java.lang.String> ViewModelFTotalAmount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFNonVisited(android.databinding.ObservableField<java.lang.String> ViewModelFNonVisited, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFVisited(android.databinding.ObservableField<java.lang.String> ViewModelFVisited, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
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
        java.lang.String viewModelFTotalSKUGet = null;
        java.lang.String viewModelFOutletCountGet = null;
        java.lang.String viewModelFTotalAmountGet = null;
        java.lang.String viewModelFProductiveGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelFOutletCount = null;
        android.databinding.ObservableField<java.lang.String> viewModelFTotalSKU = null;
        java.lang.String viewModelFNonVisitedGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelFAvgSKU = null;
        android.databinding.ObservableField<java.lang.String> viewModelFAvgAmount = null;
        java.lang.String viewModelFAvgSKUGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelFProductive = null;
        java.lang.String viewModelFAvgAmountGet = null;
        android.databinding.ObservableField<java.lang.String> viewModelFTotalAmount = null;
        android.databinding.ObservableField<java.lang.String> viewModelFNonVisited = null;
        com.fastservices.sams.modules.dailyproductivity.DPViewModel viewModel = mViewModel;
        android.databinding.ObservableField<java.lang.String> viewModelFVisited = null;
        java.lang.String viewModelFVisitedGet = null;

        if ((dirtyFlags & 0x3ffL) != 0) {


            if ((dirtyFlags & 0x301L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.FOutletCount
                        viewModelFOutletCount = viewModel.getFOutletCount();
                    }
                    updateRegistration(0, viewModelFOutletCount);


                    if (viewModelFOutletCount != null) {
                        // read viewModel.FOutletCount.get()
                        viewModelFOutletCountGet = viewModelFOutletCount.get();
                    }
            }
            if ((dirtyFlags & 0x302L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.FTotalSKU
                        viewModelFTotalSKU = viewModel.getFTotalSKU();
                    }
                    updateRegistration(1, viewModelFTotalSKU);


                    if (viewModelFTotalSKU != null) {
                        // read viewModel.FTotalSKU.get()
                        viewModelFTotalSKUGet = viewModelFTotalSKU.get();
                    }
            }
            if ((dirtyFlags & 0x304L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.FAvgSKU
                        viewModelFAvgSKU = viewModel.getFAvgSKU();
                    }
                    updateRegistration(2, viewModelFAvgSKU);


                    if (viewModelFAvgSKU != null) {
                        // read viewModel.FAvgSKU.get()
                        viewModelFAvgSKUGet = viewModelFAvgSKU.get();
                    }
            }
            if ((dirtyFlags & 0x308L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.FAvgAmount
                        viewModelFAvgAmount = viewModel.getFAvgAmount();
                    }
                    updateRegistration(3, viewModelFAvgAmount);


                    if (viewModelFAvgAmount != null) {
                        // read viewModel.FAvgAmount.get()
                        viewModelFAvgAmountGet = viewModelFAvgAmount.get();
                    }
            }
            if ((dirtyFlags & 0x310L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.FProductive
                        viewModelFProductive = viewModel.getFProductive();
                    }
                    updateRegistration(4, viewModelFProductive);


                    if (viewModelFProductive != null) {
                        // read viewModel.FProductive.get()
                        viewModelFProductiveGet = viewModelFProductive.get();
                    }
            }
            if ((dirtyFlags & 0x320L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.FTotalAmount
                        viewModelFTotalAmount = viewModel.getFTotalAmount();
                    }
                    updateRegistration(5, viewModelFTotalAmount);


                    if (viewModelFTotalAmount != null) {
                        // read viewModel.FTotalAmount.get()
                        viewModelFTotalAmountGet = viewModelFTotalAmount.get();
                    }
            }
            if ((dirtyFlags & 0x340L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.FNonVisited
                        viewModelFNonVisited = viewModel.getFNonVisited();
                    }
                    updateRegistration(6, viewModelFNonVisited);


                    if (viewModelFNonVisited != null) {
                        // read viewModel.FNonVisited.get()
                        viewModelFNonVisitedGet = viewModelFNonVisited.get();
                    }
            }
            if ((dirtyFlags & 0x380L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.FVisited
                        viewModelFVisited = viewModel.getFVisited();
                    }
                    updateRegistration(7, viewModelFVisited);


                    if (viewModelFVisited != null) {
                        // read viewModel.FVisited.get()
                        viewModelFVisitedGet = viewModelFVisited.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x304L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvAvgSKU, viewModelFAvgSKUGet);
        }
        if ((dirtyFlags & 0x308L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvAvgSKU2, viewModelFAvgAmountGet);
        }
        if ((dirtyFlags & 0x340L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvNonVisitedOutlet, viewModelFNonVisitedGet);
        }
        if ((dirtyFlags & 0x310L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvProductiveOutlets, viewModelFProductiveGet);
        }
        if ((dirtyFlags & 0x301L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvScheduledOutlets, viewModelFOutletCountGet);
        }
        if ((dirtyFlags & 0x320L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvTotalNetAmount, viewModelFTotalAmountGet);
        }
        if ((dirtyFlags & 0x302L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvTotalSKUs, viewModelFTotalSKUGet);
        }
        if ((dirtyFlags & 0x380L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvVisitedOutlets, viewModelFVisitedGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.FOutletCount
        flag 1 (0x2L): viewModel.FTotalSKU
        flag 2 (0x3L): viewModel.FAvgSKU
        flag 3 (0x4L): viewModel.FAvgAmount
        flag 4 (0x5L): viewModel.FProductive
        flag 5 (0x6L): viewModel.FTotalAmount
        flag 6 (0x7L): viewModel.FNonVisited
        flag 7 (0x8L): viewModel.FVisited
        flag 8 (0x9L): viewModel
        flag 9 (0xaL): null
    flag mapping end*/
    //end
}