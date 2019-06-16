package com.fastservices.sams.modules.stockpositioning;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014\u00a8\u0006\u001b"}, d2 = {"Lcom/fastservices/sams/modules/stockpositioning/StockPositioningVM;", "Lcom/fastservices/sams/modules/base/BaseVM;", "()V", "selectedOutlet", "Lcom/fastservices/sams/data/entities/Outlet;", "getSelectedOutlet", "()Lcom/fastservices/sams/data/entities/Outlet;", "setSelectedOutlet", "(Lcom/fastservices/sams/data/entities/Outlet;)V", "sku", "Ljava/util/ArrayList;", "Lcom/fastservices/sams/data/entities/StockPosition;", "getSku", "()Ljava/util/ArrayList;", "skusLoaded", "Landroid/arch/lifecycle/MutableLiveData;", "", "getSkusLoaded", "()Landroid/arch/lifecycle/MutableLiveData;", "setSkusLoaded", "(Landroid/arch/lifecycle/MutableLiveData;)V", "stockAdded", "getStockAdded", "setStockAdded", "addStockPositioning", "", "outletSelected", "app_release"})
public final class StockPositioningVM extends com.fastservices.sams.modules.base.BaseVM {
    @org.jetbrains.annotations.Nullable()
    private com.fastservices.sams.data.entities.Outlet selectedOutlet;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.fastservices.sams.data.entities.StockPosition> sku = null;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<java.lang.Boolean> skusLoaded;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<java.lang.Boolean> stockAdded;
    
    @org.jetbrains.annotations.Nullable()
    public final com.fastservices.sams.data.entities.Outlet getSelectedOutlet() {
        return null;
    }
    
    public final void setSelectedOutlet(@org.jetbrains.annotations.Nullable()
    com.fastservices.sams.data.entities.Outlet p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.fastservices.sams.data.entities.StockPosition> getSku() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getSkusLoaded() {
        return null;
    }
    
    public final void setSkusLoaded(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getStockAdded() {
        return null;
    }
    
    public final void setStockAdded(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    public final void outletSelected() {
    }
    
    public final void addStockPositioning() {
    }
    
    public StockPositioningVM() {
        super();
    }
}