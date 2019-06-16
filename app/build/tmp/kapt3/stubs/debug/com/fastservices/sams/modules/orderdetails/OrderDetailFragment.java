package com.fastservices.sams.modules.orderdetails;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0003J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0016J\b\u0010\u001a\u001a\u00020\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/fastservices/sams/modules/orderdetails/OrderDetailFragment;", "Lcom/fastservices/sams/modules/base/BaseFragment;", "Lcom/fastservices/sams/modules/orderdetails/DeleteClickListener;", "()V", "binding", "Lcom/fastservices/sams/databinding/FragmentOrderDetailsBinding;", "viewModel", "Lcom/fastservices/sams/modules/takeorder/OrderVM;", "doBinding", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "getLayoutResId", "", "getTitle", "", "getVM", "Lcom/fastservices/sams/modules/base/BaseVM;", "onItemDeleted", "", "item", "Lcom/fastservices/sams/data/entities/OrderItem;", "setObservers", "setUp", "setVM", "Companion", "app_debug"})
public final class OrderDetailFragment extends com.fastservices.sams.modules.base.BaseFragment implements com.fastservices.sams.modules.orderdetails.DeleteClickListener {
    private com.fastservices.sams.modules.takeorder.OrderVM viewModel;
    private com.fastservices.sams.databinding.FragmentOrderDetailsBinding binding;
    public static final com.fastservices.sams.modules.orderdetails.OrderDetailFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onItemDeleted(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.data.entities.OrderItem item) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View doBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.fastservices.sams.modules.base.BaseVM getVM() {
        return null;
    }
    
    @java.lang.Override()
    public int getLayoutResId() {
        return 0;
    }
    
    @java.lang.Override()
    public void setUp() {
    }
    
    @java.lang.Override()
    public void setVM() {
    }
    
    @java.lang.Override()
    public void setObservers() {
    }
    
    public OrderDetailFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/fastservices/sams/modules/orderdetails/OrderDetailFragment$Companion;", "", "()V", "newInstance", "Lcom/fastservices/sams/modules/orderdetails/OrderDetailFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.fastservices.sams.modules.orderdetails.OrderDetailFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}