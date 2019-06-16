package com.fastservices.sams.modules.dashboard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0018\u001a\u00020\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0019"}, d2 = {"Lcom/fastservices/sams/modules/dashboard/DashboardVM;", "Lcom/fastservices/sams/modules/base/BaseVM;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "dayEnded", "Landroid/arch/lifecycle/MutableLiveData;", "", "getDayEnded", "()Landroid/arch/lifecycle/MutableLiveData;", "dayStarted", "getDayStarted", "menuItems", "", "Lcom/fastservices/sams/data/entities/Menu;", "getMenuItems", "()Ljava/util/List;", "setMenuItems", "(Ljava/util/List;)V", "checkDayStarted", "", "endMyDay", "startMyDay", "app_debug"})
public final class DashboardVM extends com.fastservices.sams.modules.base.BaseVM {
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> dayStarted = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> dayEnded = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "DashboardVM";
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.fastservices.sams.data.entities.Menu> menuItems;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getDayStarted() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getDayEnded() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.fastservices.sams.data.entities.Menu> getMenuItems() {
        return null;
    }
    
    public final void setMenuItems(@org.jetbrains.annotations.Nullable()
    java.util.List<com.fastservices.sams.data.entities.Menu> p0) {
    }
    
    public final void startMyDay() {
    }
    
    public final void checkDayStarted() {
    }
    
    public final void endMyDay() {
    }
    
    public DashboardVM() {
        super();
    }
}