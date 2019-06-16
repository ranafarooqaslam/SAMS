package com.fastservices.sams.modules.outletwise;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/fastservices/sams/modules/outletwise/OutletWiseVM;", "Lcom/fastservices/sams/modules/base/BaseVM;", "()V", "dataLoaded", "Landroid/arch/lifecycle/MutableLiveData;", "", "getDataLoaded", "()Landroid/arch/lifecycle/MutableLiveData;", "summary", "", "Lcom/fastservices/sams/data/models/OutletWiseSummaryModel;", "getSummary", "()Ljava/util/List;", "setSummary", "(Ljava/util/List;)V", "totalAmount", "Landroid/databinding/ObservableField;", "", "getTotalAmount", "()Landroid/databinding/ObservableField;", "app_release"})
public final class OutletWiseVM extends com.fastservices.sams.modules.base.BaseVM {
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> dataLoaded = null;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableField<java.lang.String> totalAmount = null;
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.fastservices.sams.data.models.OutletWiseSummaryModel> summary;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getDataLoaded() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<java.lang.String> getTotalAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.fastservices.sams.data.models.OutletWiseSummaryModel> getSummary() {
        return null;
    }
    
    public final void setSummary(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fastservices.sams.data.models.OutletWiseSummaryModel> p0) {
    }
    
    public OutletWiseVM() {
        super();
    }
}