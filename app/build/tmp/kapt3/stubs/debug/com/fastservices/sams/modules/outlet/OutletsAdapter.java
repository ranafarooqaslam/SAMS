package com.fastservices.sams.modules.outlet;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\u0012\u001a\n \u0013*\u0004\u0018\u00010\u00050\u00052\u0006\u0010\u0014\u001a\u00020\bJ\b\u0010\u0015\u001a\u00020\bH\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\bH\u0016J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\bH\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001e"}, d2 = {"Lcom/fastservices/sams/modules/outlet/OutletsAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/fastservices/sams/modules/outlet/OutletVH;", "data", "Landroid/databinding/ObservableArrayList;", "Lcom/fastservices/sams/data/entities/Outlet;", "noOrders", "", "", "clickListener", "Lcom/fastservices/sams/modules/outlet/ClickListener;", "(Landroid/databinding/ObservableArrayList;Ljava/util/List;Lcom/fastservices/sams/modules/outlet/ClickListener;)V", "getData", "()Landroid/databinding/ObservableArrayList;", "setData", "(Landroid/databinding/ObservableArrayList;)V", "getNoOrders", "()Ljava/util/List;", "getItemAtPosition", "kotlin.jvm.PlatformType", "pos", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "type", "app_debug"})
public final class OutletsAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.fastservices.sams.modules.outlet.OutletVH> {
    @org.jetbrains.annotations.NotNull()
    private android.databinding.ObservableArrayList<com.fastservices.sams.data.entities.Outlet> data;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.Integer> noOrders = null;
    private final com.fastservices.sams.modules.outlet.ClickListener clickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.fastservices.sams.modules.outlet.OutletVH onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int type) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.modules.outlet.OutletVH holder, int position) {
    }
    
    public final com.fastservices.sams.data.entities.Outlet getItemAtPosition(int pos) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableArrayList<com.fastservices.sams.data.entities.Outlet> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    android.databinding.ObservableArrayList<com.fastservices.sams.data.entities.Outlet> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> getNoOrders() {
        return null;
    }
    
    public OutletsAdapter(@org.jetbrains.annotations.NotNull()
    android.databinding.ObservableArrayList<com.fastservices.sams.data.entities.Outlet> data, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> noOrders, @org.jetbrains.annotations.Nullable()
    com.fastservices.sams.modules.outlet.ClickListener clickListener) {
        super();
    }
}