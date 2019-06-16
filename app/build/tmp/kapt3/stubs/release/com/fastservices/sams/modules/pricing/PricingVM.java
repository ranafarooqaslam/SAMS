package com.fastservices.sams.modules.pricing;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/fastservices/sams/modules/pricing/PricingVM;", "Lcom/fastservices/sams/modules/base/BaseVM;", "()V", "category", "", "Lcom/fastservices/sams/data/entities/Category;", "getCategory", "()Ljava/util/List;", "setCategory", "(Ljava/util/List;)V", "categoryLoaded", "Landroid/arch/lifecycle/MutableLiveData;", "", "getCategoryLoaded", "()Landroid/arch/lifecycle/MutableLiveData;", "sku", "Lcom/fastservices/sams/data/entities/SKU;", "getSku", "setSku", "skuLoaded", "getSkuLoaded", "loadSKUs", "", "cat_id", "", "app_release"})
public final class PricingVM extends com.fastservices.sams.modules.base.BaseVM {
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> skuLoaded = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> categoryLoaded = null;
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.fastservices.sams.data.entities.SKU> sku;
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.fastservices.sams.data.entities.Category> category;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getSkuLoaded() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getCategoryLoaded() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.fastservices.sams.data.entities.SKU> getSku() {
        return null;
    }
    
    public final void setSku(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fastservices.sams.data.entities.SKU> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.fastservices.sams.data.entities.Category> getCategory() {
        return null;
    }
    
    public final void setCategory(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fastservices.sams.data.entities.Category> p0) {
    }
    
    public final void loadSKUs(int cat_id) {
    }
    
    public PricingVM() {
        super();
    }
}