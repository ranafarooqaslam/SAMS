package com.fastservices.sams.modules.outletnoorder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010>\u001a\u00020?J\u0010\u0010@\u001a\u00020?2\b\u0010A\u001a\u0004\u0018\u00010\u0004J\u0006\u0010B\u001a\u00020?R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001a\u0010 \u001a\u00020!X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R \u0010&\u001a\b\u0012\u0004\u0012\u00020(0\'X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0011\u0010-\u001a\u00020.\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u001a\u00101\u001a\u000202X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00107\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0006\"\u0004\b9\u0010\bR\u0017\u0010:\u001a\b\u0012\u0004\u0012\u0002020;\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010=\u00a8\u0006C"}, d2 = {"Lcom/fastservices/sams/modules/outletnoorder/OutletNoOrderVM;", "Lcom/fastservices/sams/modules/base/BaseVM;", "()V", "comments", "", "getComments", "()Ljava/lang/String;", "setComments", "(Ljava/lang/String;)V", "dataInserted", "Landroid/arch/lifecycle/MutableLiveData;", "", "getDataInserted", "()Landroid/arch/lifecycle/MutableLiveData;", "dataLoaded", "getDataLoaded", "files", "", "getFiles", "()[Ljava/lang/String;", "setFiles", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "latitude", "", "getLatitude", "()D", "setLatitude", "(D)V", "longtidue", "getLongtidue", "setLongtidue", "outlet", "Lcom/fastservices/sams/data/entities/Outlet;", "getOutlet", "()Lcom/fastservices/sams/data/entities/Outlet;", "setOutlet", "(Lcom/fastservices/sams/data/entities/Outlet;)V", "reasons", "", "Lcom/fastservices/sams/data/entities/NoOrderReason;", "getReasons", "()Ljava/util/List;", "setReasons", "(Ljava/util/List;)V", "sdf", "Ljava/text/SimpleDateFormat;", "getSdf", "()Ljava/text/SimpleDateFormat;", "selectedReasonId", "", "getSelectedReasonId", "()I", "setSelectedReasonId", "(I)V", "timeIn", "getTimeIn", "setTimeIn", "toggleDetailLayout", "Landroid/databinding/ObservableField;", "getToggleDetailLayout", "()Landroid/databinding/ObservableField;", "collapseClicked", "", "imageTaken", "fileUri", "submitNoOrder", "app_debug"})
public final class OutletNoOrderVM extends com.fastservices.sams.modules.base.BaseVM {
    @org.jetbrains.annotations.NotNull()
    private final java.text.SimpleDateFormat sdf = null;
    @org.jetbrains.annotations.NotNull()
    public com.fastservices.sams.data.entities.Outlet outlet;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableField<java.lang.Integer> toggleDetailLayout = null;
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.fastservices.sams.data.entities.NoOrderReason> reasons;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> dataLoaded = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> dataInserted = null;
    private int selectedReasonId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String comments;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String timeIn;
    private double latitude;
    private double longtidue;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String[] files;
    
    @org.jetbrains.annotations.NotNull()
    public final java.text.SimpleDateFormat getSdf() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fastservices.sams.data.entities.Outlet getOutlet() {
        return null;
    }
    
    public final void setOutlet(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.data.entities.Outlet p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<java.lang.Integer> getToggleDetailLayout() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.fastservices.sams.data.entities.NoOrderReason> getReasons() {
        return null;
    }
    
    public final void setReasons(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fastservices.sams.data.entities.NoOrderReason> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getDataLoaded() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getDataInserted() {
        return null;
    }
    
    public final int getSelectedReasonId() {
        return 0;
    }
    
    public final void setSelectedReasonId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getComments() {
        return null;
    }
    
    public final void setComments(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeIn() {
        return null;
    }
    
    public final void setTimeIn(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getLatitude() {
        return 0.0;
    }
    
    public final void setLatitude(double p0) {
    }
    
    public final double getLongtidue() {
        return 0.0;
    }
    
    public final void setLongtidue(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getFiles() {
        return null;
    }
    
    public final void setFiles(@org.jetbrains.annotations.NotNull()
    java.lang.String[] p0) {
    }
    
    public final void collapseClicked() {
    }
    
    public final void submitNoOrder() {
    }
    
    public final void imageTaken(@org.jetbrains.annotations.Nullable()
    java.lang.String fileUri) {
    }
    
    public OutletNoOrderVM() {
        super();
    }
}