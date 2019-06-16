package com.fastservices.sams.databinding;
import com.fastservices.sams.R;
import com.fastservices.sams.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDashboardBindingImpl extends FragmentDashboardBinding implements com.fastservices.sams.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.bottomLayout, 10);
        sViewsWithIds.put(R.id.constraintLayout2, 11);
        sViewsWithIds.put(R.id.tvEndMyDay, 12);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback25;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDashboardBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private FragmentDashboardBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.view.View) bindings[10]
            , (android.support.constraint.ConstraintLayout) bindings[11]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            );
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvAddOutlet.setTag(null);
        this.tvDataSync.setTag(null);
        this.tvMerchendising.setTag(null);
        this.tvOutletCompaint.setTag(null);
        this.tvStartMyDay.setTag(null);
        this.tvStockPositioning.setTag(null);
        this.tvStockReturn.setTag(null);
        this.tvTakeOrder.setTag(null);
        this.tvViewReport.setTag(null);
        setRootTag(root);
        // listeners
        mCallback25 = new com.fastservices.sams.generated.callback.OnClickListener(this, 1);
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
            setViewModel((com.fastservices.sams.modules.dashboard.DashboardVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.fastservices.sams.modules.dashboard.DashboardVM ViewModel) {
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
        boolean viewModelMenuItemsGetInt5IsActive = false;
        com.fastservices.sams.data.entities.Menu viewModelMenuItemsGetInt1 = null;
        boolean viewModelMenuItemsGetInt7IsActive = false;
        com.fastservices.sams.data.entities.Menu viewModelMenuItemsGetInt3 = null;
        com.fastservices.sams.data.entities.Menu viewModelMenuItemsGetInt5 = null;
        boolean viewModelMenuItemsGetInt0IsActive = false;
        boolean viewModelMenuItemsGetInt3IsActive = false;
        com.fastservices.sams.data.entities.Menu viewModelMenuItemsGetInt7 = null;
        boolean viewModelMenuItemsGetInt4IsActive = false;
        com.fastservices.sams.data.entities.Menu viewModelMenuItemsGetInt0 = null;
        boolean viewModelMenuItemsGetInt6IsActive = false;
        java.util.List<com.fastservices.sams.data.entities.Menu> viewModelMenuItems = null;
        boolean viewModelMenuItemsGetInt2IsActive = false;
        com.fastservices.sams.data.entities.Menu viewModelMenuItemsGetInt2 = null;
        com.fastservices.sams.data.entities.Menu viewModelMenuItemsGetInt4 = null;
        boolean viewModelMenuItemsGetInt1IsActive = false;
        com.fastservices.sams.data.entities.Menu viewModelMenuItemsGetInt6 = null;
        com.fastservices.sams.modules.dashboard.DashboardVM viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.menuItems
                    viewModelMenuItems = viewModel.getMenuItems();
                }


                if (viewModelMenuItems != null) {
                    // read viewModel.menuItems.get(1)
                    viewModelMenuItemsGetInt1 = viewModelMenuItems.get(1);
                    // read viewModel.menuItems.get(3)
                    viewModelMenuItemsGetInt3 = viewModelMenuItems.get(3);
                    // read viewModel.menuItems.get(5)
                    viewModelMenuItemsGetInt5 = viewModelMenuItems.get(5);
                    // read viewModel.menuItems.get(7)
                    viewModelMenuItemsGetInt7 = viewModelMenuItems.get(7);
                    // read viewModel.menuItems.get(0)
                    viewModelMenuItemsGetInt0 = viewModelMenuItems.get(0);
                    // read viewModel.menuItems.get(2)
                    viewModelMenuItemsGetInt2 = viewModelMenuItems.get(2);
                    // read viewModel.menuItems.get(4)
                    viewModelMenuItemsGetInt4 = viewModelMenuItems.get(4);
                    // read viewModel.menuItems.get(6)
                    viewModelMenuItemsGetInt6 = viewModelMenuItems.get(6);
                }


                if (viewModelMenuItemsGetInt1 != null) {
                    // read viewModel.menuItems.get(1).isActive
                    viewModelMenuItemsGetInt1IsActive = viewModelMenuItemsGetInt1.isActive();
                }
                if (viewModelMenuItemsGetInt3 != null) {
                    // read viewModel.menuItems.get(3).isActive
                    viewModelMenuItemsGetInt3IsActive = viewModelMenuItemsGetInt3.isActive();
                }
                if (viewModelMenuItemsGetInt5 != null) {
                    // read viewModel.menuItems.get(5).isActive
                    viewModelMenuItemsGetInt5IsActive = viewModelMenuItemsGetInt5.isActive();
                }
                if (viewModelMenuItemsGetInt7 != null) {
                    // read viewModel.menuItems.get(7).isActive
                    viewModelMenuItemsGetInt7IsActive = viewModelMenuItemsGetInt7.isActive();
                }
                if (viewModelMenuItemsGetInt0 != null) {
                    // read viewModel.menuItems.get(0).isActive
                    viewModelMenuItemsGetInt0IsActive = viewModelMenuItemsGetInt0.isActive();
                }
                if (viewModelMenuItemsGetInt2 != null) {
                    // read viewModel.menuItems.get(2).isActive
                    viewModelMenuItemsGetInt2IsActive = viewModelMenuItemsGetInt2.isActive();
                }
                if (viewModelMenuItemsGetInt4 != null) {
                    // read viewModel.menuItems.get(4).isActive
                    viewModelMenuItemsGetInt4IsActive = viewModelMenuItemsGetInt4.isActive();
                }
                if (viewModelMenuItemsGetInt6 != null) {
                    // read viewModel.menuItems.get(6).isActive
                    viewModelMenuItemsGetInt6IsActive = viewModelMenuItemsGetInt6.isActive();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.tvAddOutlet.setEnabled(viewModelMenuItemsGetInt1IsActive);
            this.tvDataSync.setEnabled(viewModelMenuItemsGetInt5IsActive);
            this.tvMerchendising.setEnabled(viewModelMenuItemsGetInt6IsActive);
            this.tvOutletCompaint.setEnabled(viewModelMenuItemsGetInt2IsActive);
            this.tvStockPositioning.setEnabled(viewModelMenuItemsGetInt7IsActive);
            this.tvStockReturn.setEnabled(viewModelMenuItemsGetInt3IsActive);
            this.tvTakeOrder.setEnabled(viewModelMenuItemsGetInt0IsActive);
            this.tvViewReport.setEnabled(viewModelMenuItemsGetInt4IsActive);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.tvStartMyDay.setOnClickListener(mCallback25);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.fastservices.sams.modules.dashboard.DashboardVM viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.startMyDay();
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