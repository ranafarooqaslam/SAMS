package com.fastservices.sams.modules.orderdetails;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/fastservices/sams/modules/orderdetails/OrderDetailAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/fastservices/sams/modules/orderdetails/OrderRowVH;", "data", "Ljava/util/ArrayList;", "Lcom/fastservices/sams/data/entities/OrderItem;", "clickListener", "Lcom/fastservices/sams/modules/orderdetails/DeleteClickListener;", "(Ljava/util/ArrayList;Lcom/fastservices/sams/modules/orderdetails/DeleteClickListener;)V", "getClickListener", "()Lcom/fastservices/sams/modules/orderdetails/DeleteClickListener;", "getData", "()Ljava/util/ArrayList;", "setData", "(Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "type", "app_debug"})
public final class OrderDetailAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.fastservices.sams.modules.orderdetails.OrderRowVH> {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.fastservices.sams.data.entities.OrderItem> data;
    @org.jetbrains.annotations.NotNull()
    private final com.fastservices.sams.modules.orderdetails.DeleteClickListener clickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.fastservices.sams.modules.orderdetails.OrderRowVH onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int type) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.modules.orderdetails.OrderRowVH holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.fastservices.sams.data.entities.OrderItem> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.fastservices.sams.data.entities.OrderItem> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fastservices.sams.modules.orderdetails.DeleteClickListener getClickListener() {
        return null;
    }
    
    public OrderDetailAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.fastservices.sams.data.entities.OrderItem> data, @org.jetbrains.annotations.NotNull()
    com.fastservices.sams.modules.orderdetails.DeleteClickListener clickListener) {
        super();
    }
}