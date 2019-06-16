package com.fastservices.sams.modules.orderdetails;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\tJ\u0012\u0010(\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010\u0004H\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0013\u001a\n \u0010*\u0004\u0018\u00010\u00140\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0017\u001a\n \u0010*\u0004\u0018\u00010\u00140\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0019\u001a\n \u0010*\u0004\u0018\u00010\u00140\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0019\u0010\u001b\u001a\n \u0010*\u0004\u0018\u00010\u00140\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0019\u0010\u001d\u001a\n \u0010*\u0004\u0018\u00010\u00140\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0019\u0010\u001f\u001a\n \u0010*\u0004\u0018\u00010\u00140\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\"\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$\u00a8\u0006*"}, d2 = {"Lcom/fastservices/sams/modules/orderdetails/OrderRowVH;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "view", "Landroid/view/View;", "clicklistner", "Lcom/fastservices/sams/modules/orderdetails/DeleteClickListener;", "(Landroid/view/View;Lcom/fastservices/sams/modules/orderdetails/DeleteClickListener;)V", "item", "Lcom/fastservices/sams/data/entities/OrderItem;", "getItem", "()Lcom/fastservices/sams/data/entities/OrderItem;", "setItem", "(Lcom/fastservices/sams/data/entities/OrderItem;)V", "ivDelete", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getIvDelete", "()Landroid/widget/ImageView;", "lblItemName", "Landroid/widget/TextView;", "getLblItemName", "()Landroid/widget/TextView;", "lblNumberCarton", "getLblNumberCarton", "lblNumberOfPieces", "getLblNumberOfPieces", "lblTotalPrice", "getLblTotalPrice", "lblUnitPriceCarton", "getLblUnitPriceCarton", "lblUnitPricesOfPieces", "getLblUnitPricesOfPieces", "ref", "Ljava/lang/ref/WeakReference;", "getRef", "()Ljava/lang/ref/WeakReference;", "bind", "", "orderItem", "onClick", "v", "app_debug"})
public final class OrderRowVH extends android.support.v7.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.ref.WeakReference<com.fastservices.sams.modules.orderdetails.DeleteClickListener> ref = null;
    @org.jetbrains.annotations.NotNull()
    public com.fastservices.sams.data.entities.OrderItem item;
    private final android.widget.TextView lblItemName = null;
    private final android.widget.TextView lblNumberOfPieces = null;
    private final android.widget.TextView lblUnitPricesOfPieces = null;
    private final android.widget.TextView lblNumberCarton = null;
    private final android.widget.TextView lblUnitPriceCarton = null;
    private final android.widget.TextView lblTotalPrice = null;
    private final android.widget.ImageView ivDelete = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.ref.WeakReference<com.fastservices.sams.modules.orderdetails.DeleteClickListener> getRef() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fastservices.sams.data.entities.OrderItem getItem() {
        return null;
    }
    
    public final void setItem(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.data.entities.OrderItem p0) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    public final android.widget.TextView getLblItemName() {
        return null;
    }
    
    public final android.widget.TextView getLblNumberOfPieces() {
        return null;
    }
    
    public final android.widget.TextView getLblUnitPricesOfPieces() {
        return null;
    }
    
    public final android.widget.TextView getLblNumberCarton() {
        return null;
    }
    
    public final android.widget.TextView getLblUnitPriceCarton() {
        return null;
    }
    
    public final android.widget.TextView getLblTotalPrice() {
        return null;
    }
    
    public final android.widget.ImageView getIvDelete() {
        return null;
    }
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.data.entities.OrderItem orderItem) {
    }
    
    public OrderRowVH(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    com.fastservices.sams.modules.orderdetails.DeleteClickListener clicklistner) {
        super(null);
    }
}