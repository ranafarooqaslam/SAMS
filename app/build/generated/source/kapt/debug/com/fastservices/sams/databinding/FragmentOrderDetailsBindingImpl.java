package com.fastservices.sams.databinding;
import com.fastservices.sams.R;
import com.fastservices.sams.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentOrderDetailsBindingImpl extends FragmentOrderDetailsBinding implements com.fastservices.sams.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.bottomLayout, 2);
        sViewsWithIds.put(R.id.lblItemName, 3);
        sViewsWithIds.put(R.id.lblNumberOfPieces, 4);
        sViewsWithIds.put(R.id.lblUnitPricesOfPieces, 5);
        sViewsWithIds.put(R.id.lblNumberCarton, 6);
        sViewsWithIds.put(R.id.lblUnitPriceCarton, 7);
        sViewsWithIds.put(R.id.lblTotalPrice, 8);
        sViewsWithIds.put(R.id.space, 9);
        sViewsWithIds.put(R.id.rvOrderItems, 10);
        sViewsWithIds.put(R.id.footer, 11);
        sViewsWithIds.put(R.id.lblFooterTotal, 12);
        sViewsWithIds.put(R.id.tvFooterTotalUnit, 13);
        sViewsWithIds.put(R.id.lblFooterUnitPricesOfPieces, 14);
        sViewsWithIds.put(R.id.tvFooterCartons, 15);
        sViewsWithIds.put(R.id.lblFooterUnitPriceCarton, 16);
        sViewsWithIds.put(R.id.lblFooterTotalPrice, 17);
        sViewsWithIds.put(R.id.ivFooterDelete, 18);
        sViewsWithIds.put(R.id.tvTotalPrice, 19);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback21;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentOrderDetailsBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private FragmentOrderDetailsBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.view.View) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.support.constraint.ConstraintLayout) bindings[11]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[5]
            , (android.support.v7.widget.RecyclerView) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[19]
            );
        this.btnOrderSummary.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback21 = new com.fastservices.sams.generated.callback.OnClickListener(this, 1);
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
        com.fastservices.sams.modules.takeorder.OrderVM viewModel = mViewModel;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.btnOrderSummary.setOnClickListener(mCallback21);
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
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}