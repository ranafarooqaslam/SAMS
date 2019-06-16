package com.fastservices.sams.modules.skulist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\'\u001a\u00020(2\u0006\u0010\b\u001a\u00020\tJ\u0012\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010\u0004H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0019\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0013\u001a\n \f*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0016\u001a\n \f*\u0004\u0018\u00010\u00170\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001a\u001a\n \f*\u0004\u0018\u00010\u00170\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\u001c\u001a\n \f*\u0004\u0018\u00010\u00170\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0019\u0010\u001e\u001a\n \f*\u0004\u0018\u00010\u00170\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0019\u0010 \u001a\n \f*\u0004\u0018\u00010\u00170\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0019\u0010\"\u001a\n \f*\u0004\u0018\u00010\u00170\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0019\u0010$\u001a\n \f*\u0004\u0018\u00010\u00170\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0015\u00a8\u0006+"}, d2 = {"Lcom/fastservices/sams/modules/skulist/SkuVH;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "view", "Landroid/view/View;", "listener", "Lcom/fastservices/sams/modules/skulist/ClickListener;", "(Landroid/view/View;Lcom/fastservices/sams/modules/skulist/ClickListener;)V", "item", "Lcom/fastservices/sams/data/entities/SKU;", "ivIcon", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getIvIcon", "()Landroid/widget/ImageView;", "refListener", "Ljava/lang/ref/WeakReference;", "getRefListener", "()Ljava/lang/ref/WeakReference;", "rootLayout", "getRootLayout", "()Landroid/view/View;", "tvItemCode", "Landroid/widget/TextView;", "getTvItemCode", "()Landroid/widget/TextView;", "tvItemName", "getTvItemName", "tvOrderCartona", "getTvOrderCartona", "tvOrderUnits", "getTvOrderUnits", "tvRetailPrice", "getTvRetailPrice", "tvSubtotal", "getTvSubtotal", "tvTradePrice", "getTvTradePrice", "getView", "bind", "", "onClick", "v", "app_release"})
public final class SkuVH extends android.support.v7.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
    private com.fastservices.sams.data.entities.SKU item;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.ref.WeakReference<com.fastservices.sams.modules.skulist.ClickListener> refListener = null;
    private final android.widget.TextView tvItemCode = null;
    private final android.widget.TextView tvItemName = null;
    private final android.widget.TextView tvRetailPrice = null;
    private final android.widget.TextView tvTradePrice = null;
    private final android.view.View rootLayout = null;
    private final android.widget.TextView tvOrderUnits = null;
    private final android.widget.TextView tvOrderCartona = null;
    private final android.widget.TextView tvSubtotal = null;
    private final android.widget.ImageView ivIcon = null;
    @org.jetbrains.annotations.NotNull()
    private final android.view.View view = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.ref.WeakReference<com.fastservices.sams.modules.skulist.ClickListener> getRefListener() {
        return null;
    }
    
    public final android.widget.TextView getTvItemCode() {
        return null;
    }
    
    public final android.widget.TextView getTvItemName() {
        return null;
    }
    
    public final android.widget.TextView getTvRetailPrice() {
        return null;
    }
    
    public final android.widget.TextView getTvTradePrice() {
        return null;
    }
    
    public final android.view.View getRootLayout() {
        return null;
    }
    
    public final android.widget.TextView getTvOrderUnits() {
        return null;
    }
    
    public final android.widget.TextView getTvOrderCartona() {
        return null;
    }
    
    public final android.widget.TextView getTvSubtotal() {
        return null;
    }
    
    public final android.widget.ImageView getIvIcon() {
        return null;
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.data.entities.SKU item) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getView() {
        return null;
    }
    
    public SkuVH(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    com.fastservices.sams.modules.skulist.ClickListener listener) {
        super(null);
    }
}