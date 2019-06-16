package com.fastservices.sams.modules.stockpositioning;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J*\u0010\u0019\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0016J\u000e\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u0007J*\u0010!\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0011\u001a\n \u000e*\u0004\u0018\u00010\u00120\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006#"}, d2 = {"Lcom/fastservices/sams/modules/stockpositioning/StockVH;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Landroid/text/TextWatcher;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "dataItem", "Lcom/fastservices/sams/data/entities/StockPosition;", "getDataItem", "()Lcom/fastservices/sams/data/entities/StockPosition;", "setDataItem", "(Lcom/fastservices/sams/data/entities/StockPosition;)V", "name", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getName", "()Landroid/widget/TextView;", "quantity", "Landroid/widget/EditText;", "getQuantity", "()Landroid/widget/EditText;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "bind", "item", "onTextChanged", "before", "app_debug"})
public final class StockVH extends android.support.v7.widget.RecyclerView.ViewHolder implements android.text.TextWatcher {
    private final android.widget.TextView name = null;
    private final android.widget.EditText quantity = null;
    @org.jetbrains.annotations.Nullable()
    private com.fastservices.sams.data.entities.StockPosition dataItem;
    
    public final android.widget.TextView getName() {
        return null;
    }
    
    public final android.widget.EditText getQuantity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.fastservices.sams.data.entities.StockPosition getDataItem() {
        return null;
    }
    
    public final void setDataItem(@org.jetbrains.annotations.Nullable()
    com.fastservices.sams.data.entities.StockPosition p0) {
    }
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.data.entities.StockPosition item) {
    }
    
    @java.lang.Override()
    public void afterTextChanged(@org.jetbrains.annotations.Nullable()
    android.text.Editable s) {
    }
    
    @java.lang.Override()
    public void beforeTextChanged(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence s, int start, int count, int after) {
    }
    
    @java.lang.Override()
    public void onTextChanged(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence s, int start, int before, int count) {
    }
    
    public StockVH(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        super(null);
    }
}