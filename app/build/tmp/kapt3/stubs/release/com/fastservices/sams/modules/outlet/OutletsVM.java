package com.fastservices.sams.modules.outlet;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010.\u001a\u00020/H\u0002J\u000e\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\rJ\u000e\u00102\u001a\u00020/2\u0006\u00103\u001a\u00020\u0004J\u0006\u00104\u001a\u00020/J\b\u00105\u001a\u00020/H\u0002J\u0006\u00106\u001a\u00020/R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR.\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\r\u0018\u0001`\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\"\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\"\u0010*\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001a\"\u0004\b-\u0010\u001c\u00a8\u00067"}, d2 = {"Lcom/fastservices/sams/modules/outlet/OutletsVM;", "Lcom/fastservices/sams/modules/base/BaseVM;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "allOutlets", "Ljava/util/ArrayList;", "Lcom/fastservices/sams/data/entities/Outlet;", "getAllOutlets", "()Ljava/util/ArrayList;", "noOrdersList", "", "Lkotlin/collections/ArrayList;", "getNoOrdersList", "setNoOrdersList", "(Ljava/util/ArrayList;)V", "notifyAdapter", "Landroid/arch/lifecycle/MutableLiveData;", "", "getNotifyAdapter", "()Landroid/arch/lifecycle/MutableLiveData;", "ordersList", "", "getOrdersList", "()Ljava/util/List;", "setOrdersList", "(Ljava/util/List;)V", "outletList", "Landroid/databinding/ObservableArrayList;", "getOutletList", "()Landroid/databinding/ObservableArrayList;", "searchQuery", "Landroid/databinding/ObservableField;", "getSearchQuery", "()Landroid/databinding/ObservableField;", "sectionAreaId", "getSectionAreaId", "()I", "setSectionAreaId", "(I)V", "sections", "Lcom/fastservices/sams/data/entities/Section;", "getSections", "setSections", "addCartonsInformation", "", "applyAreaFilter", "areaId", "applyFilter", "input", "loadOrdersList", "loadOutlets", "loadSections", "app_release"})
public final class OutletsVM extends com.fastservices.sams.modules.base.BaseVM {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "OutletsVM";
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableArrayList<com.fastservices.sams.data.entities.Outlet> outletList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.fastservices.sams.data.entities.Outlet> allOutlets = null;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.Integer> ordersList;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<java.lang.Integer> noOrdersList;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableField<java.lang.String> searchQuery = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> notifyAdapter = null;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.fastservices.sams.data.entities.Section> sections;
    private int sectionAreaId;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableArrayList<com.fastservices.sams.data.entities.Outlet> getOutletList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.fastservices.sams.data.entities.Outlet> getAllOutlets() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> getOrdersList() {
        return null;
    }
    
    public final void setOrdersList(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.Integer> getNoOrdersList() {
        return null;
    }
    
    public final void setNoOrdersList(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<java.lang.String> getSearchQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getNotifyAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.fastservices.sams.data.entities.Section> getSections() {
        return null;
    }
    
    public final void setSections(@org.jetbrains.annotations.Nullable()
    java.util.List<com.fastservices.sams.data.entities.Section> p0) {
    }
    
    public final int getSectionAreaId() {
        return 0;
    }
    
    public final void setSectionAreaId(int p0) {
    }
    
    private final void loadOutlets() {
    }
    
    public final void applyFilter(@org.jetbrains.annotations.NotNull()
    java.lang.String input) {
    }
    
    public final void applyAreaFilter(int areaId) {
    }
    
    public final void loadSections() {
    }
    
    public final void loadOrdersList() {
    }
    
    private final void addCartonsInformation() {
    }
    
    public OutletsVM() {
        super();
    }
}