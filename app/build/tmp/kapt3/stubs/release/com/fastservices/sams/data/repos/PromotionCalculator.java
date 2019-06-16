package com.fastservices.sams.data.repos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\bA\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ(\u0010q\u001a\u00020\u00122\u0016\u0010r\u001a\u0012\u0012\u0004\u0012\u00020t0sj\b\u0012\u0004\u0012\u00020t`u2\u0006\u0010v\u001a\u00020\u0012H\u0002J%\u0010w\u001a\u0016\u0012\u0004\u0012\u00020t\u0018\u00010sj\n\u0012\u0004\u0012\u00020t\u0018\u0001`uH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010xJ \u0010y\u001a\u00020z2\u0016\u0010{\u001a\u0012\u0012\u0004\u0012\u00020t0sj\b\u0012\u0004\u0012\u00020t`uH\u0002J3\u0010|\u001a\u00020z2\u0006\u0010}\u001a\u00020~2\u0006\u0010\u007f\u001a\u00020W2\u001b\u0010\u0080\u0001\u001a\u0016\u0012\u0004\u0012\u00020t\u0018\u00010sj\n\u0012\u0004\u0012\u00020t\u0018\u0001`uJL\u0010\u0081\u0001\u001a\u00020~2\u0007\u0010\u0082\u0001\u001a\u00020W2\u0007\u0010\u0083\u0001\u001a\u00020W2\u0007\u0010\u0084\u0001\u001a\u00020W2\u0007\u0010\u0085\u0001\u001a\u00020\u00152\u0007\u0010\u0086\u0001\u001a\u00020\u00152\r\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020W0s2\u0007\u0010\u0088\u0001\u001a\u00020\u0012R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001a\u0010 \u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R\u001a\u0010#\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R\u001a\u0010&\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0017\"\u0004\b(\u0010\u0019R\u001a\u0010)\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010\u0019R\u001a\u0010,\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0017\"\u0004\b.\u0010\u0019R\u001a\u0010/\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0017\"\u0004\b1\u0010\u0019R\u001a\u00102\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0017\"\u0004\b4\u0010\u0019R\u001a\u00105\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0017\"\u0004\b7\u0010\u0019R\u001a\u00108\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0017\"\u0004\b:\u0010\u0019R\u001a\u0010;\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0017\"\u0004\b=\u0010\u0019R\u001a\u0010>\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0017\"\u0004\b@\u0010\u0019R\u001a\u0010A\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0017\"\u0004\bC\u0010\u0019R\u001a\u0010D\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u0017\"\u0004\bF\u0010\u0019R\u001a\u0010G\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u0017\"\u0004\bI\u0010\u0019R\u001a\u0010J\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u0017\"\u0004\bL\u0010\u0019R\u001a\u0010M\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u0017\"\u0004\bO\u0010\u0019R\u001a\u0010P\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u0017\"\u0004\bR\u0010\u0019R\u001a\u0010S\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\u0017\"\u0004\bU\u0010\u0019R\u001a\u0010V\u001a\u00020WX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u001a\u0010\\\u001a\u00020WX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010Y\"\u0004\b^\u0010[R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u001a\u0010e\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bf\u0010\u0017\"\u0004\bg\u0010\u0019R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u001a\u0010l\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010n\"\u0004\bo\u0010p\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0089\u0001"}, d2 = {"Lcom/fastservices/sams/data/repos/PromotionCalculator;", "", "login", "Lcom/fastservices/sams/data/models/UserInfo;", "liveDate", "Landroid/arch/lifecycle/MutableLiveData;", "Lcom/fastservices/sams/data/models/SummaryUIModel;", "myShoping", "", "Lcom/fastservices/sams/data/entities/OrderItem;", "Customer", "Lcom/fastservices/sams/data/entities/Outlet;", "(Lcom/fastservices/sams/data/models/UserInfo;Landroid/arch/lifecycle/MutableLiveData;Ljava/util/List;Lcom/fastservices/sams/data/entities/Outlet;)V", "getCustomer", "()Lcom/fastservices/sams/data/entities/Outlet;", "setCustomer", "(Lcom/fastservices/sams/data/entities/Outlet;)V", "DistributorTypeID", "", "IsDistributorRegister", "ObjFreeExtra_Tax", "", "getObjFreeExtra_Tax", "()D", "setObjFreeExtra_Tax", "(D)V", "ObjFreeGSTAmount", "getObjFreeGSTAmount", "setObjFreeGSTAmount", "ObjFreeTST", "getObjFreeTST", "setObjFreeTST", "ObjGrossSales", "getObjGrossSales", "setObjGrossSales", "ObjStandardDiscount", "getObjStandardDiscount", "setObjStandardDiscount", "ObjStandardDiscount_By_VALUE", "getObjStandardDiscount_By_VALUE", "setObjStandardDiscount_By_VALUE", "ObjStandardDiscount_By_VALUE_AD", "getObjStandardDiscount_By_VALUE_AD", "setObjStandardDiscount_By_VALUE_AD", "ObjStandardDiscount_By_VALUE_TO", "getObjStandardDiscount_By_VALUE_TO", "setObjStandardDiscount_By_VALUE_TO", "ObjStandardDiscount_PER_VALUE", "getObjStandardDiscount_PER_VALUE", "setObjStandardDiscount_PER_VALUE", "ObjStandardDiscount_PER_VALUE_AD", "getObjStandardDiscount_PER_VALUE_AD", "setObjStandardDiscount_PER_VALUE_AD", "ObjStandardDiscount_PER_VALUE_TO", "getObjStandardDiscount_PER_VALUE_TO", "setObjStandardDiscount_PER_VALUE_TO", "ObjTotalExtra_Tax", "getObjTotalExtra_Tax", "setObjTotalExtra_Tax", "ObjTotalGST", "getObjTotalGST", "setObjTotalGST", "ObjTotalSED", "getObjTotalSED", "setObjTotalSED", "ObjTotalSED_BY_VALUE", "getObjTotalSED_BY_VALUE", "setObjTotalSED_BY_VALUE", "ObjTotalSED_BY_VALUE_AD", "getObjTotalSED_BY_VALUE_AD", "setObjTotalSED_BY_VALUE_AD", "ObjTotalSED_BY_VALUE_TO", "getObjTotalSED_BY_VALUE_TO", "setObjTotalSED_BY_VALUE_TO", "ObjTotalSED_PER_VALUE", "getObjTotalSED_PER_VALUE", "setObjTotalSED_PER_VALUE", "ObjTotalSED_PER_VALUE_AD", "getObjTotalSED_PER_VALUE_AD", "setObjTotalSED_PER_VALUE_AD", "ObjTotalSED_PER_VALUE_TO", "getObjTotalSED_PER_VALUE_TO", "setObjTotalSED_PER_VALUE_TO", "ObjTotalTST", "getObjTotalTST", "setObjTotalTST", "OrderID", "", "getOrderID", "()Ljava/lang/String;", "setOrderID", "(Ljava/lang/String;)V", "Remakrs", "getRemakrs", "setRemakrs", "getLiveDate", "()Landroid/arch/lifecycle/MutableLiveData;", "setLiveDate", "(Landroid/arch/lifecycle/MutableLiveData;)V", "getLogin", "()Lcom/fastservices/sams/data/models/UserInfo;", "mGSTPrice", "getMGSTPrice", "setMGSTPrice", "getMyShoping", "()Ljava/util/List;", "setMyShoping", "(Ljava/util/List;)V", "summaryUIModel", "getSummaryUIModel", "()Lcom/fastservices/sams/data/models/SummaryUIModel;", "setSummaryUIModel", "(Lcom/fastservices/sams/data/models/SummaryUIModel;)V", "FreeSKUExist", "dt", "Ljava/util/ArrayList;", "Lcom/fastservices/sams/data/entities/promotions/dtFreeSKUDetail;", "Lkotlin/collections/ArrayList;", "Sku_id", "GetPromotion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LoadFreeSKU", "", "dtFree", "saveOrderDetail", "orderMasterRowId", "", "distributionID", "freeSkus", "saveOrderMaster", "remarks", "timeIn", "timeOut", "latitude", "longitude", "images", "paymentType", "app_release"})
public final class PromotionCalculator {
    @org.jetbrains.annotations.NotNull()
    public com.fastservices.sams.data.models.SummaryUIModel summaryUIModel;
    private int DistributorTypeID;
    private int IsDistributorRegister;
    private double ObjStandardDiscount;
    private double ObjTotalSED_BY_VALUE_AD;
    private double ObjTotalSED_PER_VALUE_AD;
    private double ObjTotalSED_BY_VALUE_TO;
    private double ObjTotalSED_PER_VALUE_TO;
    private double ObjTotalSED;
    private double ObjStandardDiscount_By_VALUE;
    private double ObjStandardDiscount_PER_VALUE;
    private double ObjTotalSED_BY_VALUE;
    private double ObjTotalSED_PER_VALUE;
    private double ObjStandardDiscount_By_VALUE_TO;
    private double ObjStandardDiscount_By_VALUE_AD;
    private double ObjStandardDiscount_PER_VALUE_TO;
    private double ObjStandardDiscount_PER_VALUE_AD;
    private double mGSTPrice;
    private double ObjGrossSales;
    private double ObjTotalGST;
    private double ObjTotalTST;
    private double ObjTotalExtra_Tax;
    private double ObjFreeGSTAmount;
    private double ObjFreeTST;
    private double ObjFreeExtra_Tax;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String OrderID;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String Remakrs;
    @org.jetbrains.annotations.NotNull()
    private final com.fastservices.sams.data.models.UserInfo login = null;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<com.fastservices.sams.data.models.SummaryUIModel> liveDate;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends com.fastservices.sams.data.entities.OrderItem> myShoping;
    @org.jetbrains.annotations.NotNull()
    private com.fastservices.sams.data.entities.Outlet Customer;
    
    @org.jetbrains.annotations.NotNull()
    public final com.fastservices.sams.data.models.SummaryUIModel getSummaryUIModel() {
        return null;
    }
    
    public final void setSummaryUIModel(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.data.models.SummaryUIModel p0) {
    }
    
    public final double getObjStandardDiscount() {
        return 0.0;
    }
    
    public final void setObjStandardDiscount(double p0) {
    }
    
    public final double getObjTotalSED_BY_VALUE_AD() {
        return 0.0;
    }
    
    public final void setObjTotalSED_BY_VALUE_AD(double p0) {
    }
    
    public final double getObjTotalSED_PER_VALUE_AD() {
        return 0.0;
    }
    
    public final void setObjTotalSED_PER_VALUE_AD(double p0) {
    }
    
    public final double getObjTotalSED_BY_VALUE_TO() {
        return 0.0;
    }
    
    public final void setObjTotalSED_BY_VALUE_TO(double p0) {
    }
    
    public final double getObjTotalSED_PER_VALUE_TO() {
        return 0.0;
    }
    
    public final void setObjTotalSED_PER_VALUE_TO(double p0) {
    }
    
    public final double getObjTotalSED() {
        return 0.0;
    }
    
    public final void setObjTotalSED(double p0) {
    }
    
    public final double getObjStandardDiscount_By_VALUE() {
        return 0.0;
    }
    
    public final void setObjStandardDiscount_By_VALUE(double p0) {
    }
    
    public final double getObjStandardDiscount_PER_VALUE() {
        return 0.0;
    }
    
    public final void setObjStandardDiscount_PER_VALUE(double p0) {
    }
    
    public final double getObjTotalSED_BY_VALUE() {
        return 0.0;
    }
    
    public final void setObjTotalSED_BY_VALUE(double p0) {
    }
    
    public final double getObjTotalSED_PER_VALUE() {
        return 0.0;
    }
    
    public final void setObjTotalSED_PER_VALUE(double p0) {
    }
    
    public final double getObjStandardDiscount_By_VALUE_TO() {
        return 0.0;
    }
    
    public final void setObjStandardDiscount_By_VALUE_TO(double p0) {
    }
    
    public final double getObjStandardDiscount_By_VALUE_AD() {
        return 0.0;
    }
    
    public final void setObjStandardDiscount_By_VALUE_AD(double p0) {
    }
    
    public final double getObjStandardDiscount_PER_VALUE_TO() {
        return 0.0;
    }
    
    public final void setObjStandardDiscount_PER_VALUE_TO(double p0) {
    }
    
    public final double getObjStandardDiscount_PER_VALUE_AD() {
        return 0.0;
    }
    
    public final void setObjStandardDiscount_PER_VALUE_AD(double p0) {
    }
    
    public final double getMGSTPrice() {
        return 0.0;
    }
    
    public final void setMGSTPrice(double p0) {
    }
    
    public final double getObjGrossSales() {
        return 0.0;
    }
    
    public final void setObjGrossSales(double p0) {
    }
    
    public final double getObjTotalGST() {
        return 0.0;
    }
    
    public final void setObjTotalGST(double p0) {
    }
    
    public final double getObjTotalTST() {
        return 0.0;
    }
    
    public final void setObjTotalTST(double p0) {
    }
    
    public final double getObjTotalExtra_Tax() {
        return 0.0;
    }
    
    public final void setObjTotalExtra_Tax(double p0) {
    }
    
    public final double getObjFreeGSTAmount() {
        return 0.0;
    }
    
    public final void setObjFreeGSTAmount(double p0) {
    }
    
    public final double getObjFreeTST() {
        return 0.0;
    }
    
    public final void setObjFreeTST(double p0) {
    }
    
    public final double getObjFreeExtra_Tax() {
        return 0.0;
    }
    
    public final void setObjFreeExtra_Tax(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrderID() {
        return null;
    }
    
    public final void setOrderID(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRemakrs() {
        return null;
    }
    
    public final void setRemakrs(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object GetPromotion(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.ArrayList<com.fastservices.sams.data.entities.promotions.dtFreeSKUDetail>> p0) {
        return null;
    }
    
    private final void LoadFreeSKU(java.util.ArrayList<com.fastservices.sams.data.entities.promotions.dtFreeSKUDetail> dtFree) {
    }
    
    private final int FreeSKUExist(java.util.ArrayList<com.fastservices.sams.data.entities.promotions.dtFreeSKUDetail> dt, int Sku_id) {
        return 0;
    }
    
    public final long saveOrderMaster(@org.jetbrains.annotations.NotNull()
    java.lang.String remarks, @org.jetbrains.annotations.NotNull()
    java.lang.String timeIn, @org.jetbrains.annotations.NotNull()
    java.lang.String timeOut, double latitude, double longitude, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> images, int paymentType) {
        return 0L;
    }
    
    public final void saveOrderDetail(long orderMasterRowId, @org.jetbrains.annotations.NotNull()
    java.lang.String distributionID, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.fastservices.sams.data.entities.promotions.dtFreeSKUDetail> freeSkus) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fastservices.sams.data.models.UserInfo getLogin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<com.fastservices.sams.data.models.SummaryUIModel> getLiveDate() {
        return null;
    }
    
    public final void setLiveDate(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<com.fastservices.sams.data.models.SummaryUIModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.fastservices.sams.data.entities.OrderItem> getMyShoping() {
        return null;
    }
    
    public final void setMyShoping(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.fastservices.sams.data.entities.OrderItem> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fastservices.sams.data.entities.Outlet getCustomer() {
        return null;
    }
    
    public final void setCustomer(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.data.entities.Outlet p0) {
    }
    
    public PromotionCalculator(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.data.models.UserInfo login, @org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<com.fastservices.sams.data.models.SummaryUIModel> liveDate, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.fastservices.sams.data.entities.OrderItem> myShoping, @org.jetbrains.annotations.NotNull()
    com.fastservices.sams.data.entities.Outlet Customer) {
        super();
    }
}