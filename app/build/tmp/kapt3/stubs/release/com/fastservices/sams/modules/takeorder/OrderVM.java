package com.fastservices.sams.modules.takeorder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u001e\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020\u00052\u0006\u0010m\u001a\u00020\u001a2\u0006\u0010n\u001a\u00020\u001aJ\u000e\u0010o\u001a\u00020k2\u0006\u0010p\u001a\u00020)J\u000e\u0010q\u001a\u00020k2\u0006\u0010r\u001a\u00020)J\b\u0010s\u001a\u00020kH\u0002J\u0006\u0010t\u001a\u00020kJ\u0006\u0010u\u001a\u00020\nJ\f\u0010v\u001a\b\u0012\u0004\u0012\u0002070\u0010J\u0014\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010x\u001a\u00020\u001aJ\u0010\u0010y\u001a\u00020k2\b\u0010z\u001a\u0004\u0018\u00010)J\u0006\u0010{\u001a\u00020kJ\u0006\u0010|\u001a\u00020kJ\u0006\u0010}\u001a\u00020kJ\u0006\u0010~\u001a\u00020kJ\u0006\u0010\u007f\u001a\u00020kJ\u0010\u0010\u0080\u0001\u001a\u00020k2\u0007\u0010\u0081\u0001\u001a\u00020)J\u0010\u0010\u0082\u0001\u001a\u00020\u001a2\u0007\u0010\u0083\u0001\u001a\u000207J\u0007\u0010\u0084\u0001\u001a\u00020kJ\u0007\u0010\u0085\u0001\u001a\u00020kJ!\u0010\u0086\u0001\u001a\u00020k2\u0006\u0010l\u001a\u00020\u00052\u0007\u0010\u0087\u0001\u001a\u00020\u001a2\u0007\u0010\u0088\u0001\u001a\u00020\u001aR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R&\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00040\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010&R\u0016\u0010\'\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0018R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020)0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0012R\u001a\u0010-\u001a\u00020.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u00020.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00100\"\u0004\b5\u00102R\u0017\u00106\u001a\b\u0012\u0004\u0012\u0002070\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010\u0012R \u00109\u001a\b\u0012\u0004\u0012\u00020\n0\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0018\"\u0004\b;\u0010&R\u001c\u0010<\u001a\u0004\u0018\u00010=X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001a\u0010B\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0010\u0010G\u001a\u0004\u0018\u00010HX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010I\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0011\u0010N\u001a\u00020O\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u001a\u0010R\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010K\"\u0004\bT\u0010MR\u0017\u0010U\u001a\b\u0012\u0004\u0012\u00020)0\t\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010\fR\u0017\u0010W\u001a\b\u0012\u0004\u0012\u00020\n0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u0010\u0018R*\u0010Y\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0010j\b\u0012\u0004\u0012\u00020\u0005`ZX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u0012\"\u0004\b\\\u0010\u0014R\u0017\u0010]\u001a\b\u0012\u0004\u0012\u00020\n0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b^\u0010\u0018R\u0017\u0010_\u001a\b\u0012\u0004\u0012\u00020`0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u0010\u0018R\u0011\u0010b\u001a\u00020)\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u0010KR\u0017\u0010d\u001a\b\u0012\u0004\u0012\u00020\u001a0\t\u00a2\u0006\b\n\u0000\u001a\u0004\be\u0010\fR\u0017\u0010f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\bg\u0010\u0018R\u0017\u0010h\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\bi\u0010\u0018\u00a8\u0006\u0089\u0001"}, d2 = {"Lcom/fastservices/sams/modules/takeorder/OrderVM;", "Lcom/fastservices/sams/modules/base/BaseVM;", "()V", "SKUs", "", "Lcom/fastservices/sams/data/entities/SKU;", "allCategories", "Lcom/fastservices/sams/data/entities/Category;", "ascending", "Landroid/databinding/ObservableField;", "", "getAscending", "()Landroid/databinding/ObservableField;", "setAscending", "(Landroid/databinding/ObservableField;)V", "categories", "Ljava/util/ArrayList;", "getCategories", "()Ljava/util/ArrayList;", "setCategories", "(Ljava/util/ArrayList;)V", "categoriesLoaded", "Landroid/arch/lifecycle/MutableLiveData;", "getCategoriesLoaded", "()Landroid/arch/lifecycle/MutableLiveData;", "categoryId", "", "getCategoryId", "()Ljava/lang/Integer;", "setCategoryId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "dataListUpdated", "getDataListUpdated", "freeSKusLoaded", "Lcom/fastservices/sams/data/entities/promotions/dtFreeSKUDetail;", "getFreeSKusLoaded", "setFreeSKusLoaded", "(Landroid/arch/lifecycle/MutableLiveData;)V", "freeSkus", "grossAmountObservable", "", "getGrossAmountObservable", "images", "getImages", "latitude", "", "getLatitude", "()D", "setLatitude", "(D)V", "longtidue", "getLongtidue", "setLongtidue", "orderList", "Lcom/fastservices/sams/data/entities/OrderItem;", "getOrderList", "orderSavedLiveData", "getOrderSavedLiveData", "setOrderSavedLiveData", "outlet", "Lcom/fastservices/sams/data/entities/Outlet;", "getOutlet", "()Lcom/fastservices/sams/data/entities/Outlet;", "setOutlet", "(Lcom/fastservices/sams/data/entities/Outlet;)V", "paymentType", "getPaymentType", "()I", "setPaymentType", "(I)V", "promotionHelper", "Lcom/fastservices/sams/data/repos/PromotionCalculator;", "remarks", "getRemarks", "()Ljava/lang/String;", "setRemarks", "(Ljava/lang/String;)V", "sdf", "Ljava/text/SimpleDateFormat;", "getSdf", "()Ljava/text/SimpleDateFormat;", "searchQuery", "getSearchQuery", "setSearchQuery", "searchQuerySKU", "getSearchQuerySKU", "showEmptyView", "getShowEmptyView", "skuAdapterDataList", "Lkotlin/collections/ArrayList;", "getSkuAdapterDataList", "setSkuAdapterDataList", "summaryClicked", "getSummaryClicked", "summaryModelLiveData", "Lcom/fastservices/sams/data/models/SummaryUIModel;", "getSummaryModelLiveData", "timeIn", "getTimeIn", "toggleDetailLayout", "getToggleDetailLayout", "totalCartonssObservable", "getTotalCartonssObservable", "totalUnitsObservable", "getTotalUnitsObservable", "addOrderItem", "", "sku", "unit", "carton", "applyFilter", "q", "applySKUFilter", "input", "calculateGrossAmount", "collapseClicked", "containsAnyOrder", "getOrders", "getSkuList", "category_id", "imageTaken", "fileUri", "loadSKUs", "orderSummaryClicked", "paymentTypeCash", "paymentTypeCredit", "performCalculations", "removeFileUri", "uri", "removeOrderItem", "item", "saveOrderNow", "sorting", "updateSKU", "units", "cartons", "app_release"})
public final class OrderVM extends com.fastservices.sams.modules.base.BaseVM {
    @org.jetbrains.annotations.NotNull()
    private final java.text.SimpleDateFormat sdf = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String timeIn = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<com.fastservices.sams.data.models.SummaryUIModel> summaryModelLiveData = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer categoryId;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> dataListUpdated = null;
    @org.jetbrains.annotations.Nullable()
    private com.fastservices.sams.data.entities.Outlet outlet;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableField<java.lang.Integer> toggleDetailLayout = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.fastservices.sams.data.entities.Category> categories;
    private java.util.List<com.fastservices.sams.data.entities.Category> allCategories;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> categoriesLoaded = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> showEmptyView = null;
    private java.util.List<com.fastservices.sams.data.entities.SKU> SKUs;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.fastservices.sams.data.entities.OrderItem> orderList = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> summaryClicked = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.String> grossAmountObservable = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.Integer> totalUnitsObservable = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.Integer> totalCartonssObservable = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String searchQuery;
    @org.jetbrains.annotations.NotNull()
    private android.databinding.ObservableField<java.lang.Boolean> ascending;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<java.lang.String> images = null;
    private double latitude;
    private double longtidue;
    private int paymentType;
    private com.fastservices.sams.data.repos.PromotionCalculator promotionHelper;
    private java.util.ArrayList<com.fastservices.sams.data.entities.promotions.dtFreeSKUDetail> freeSkus;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<java.util.List<com.fastservices.sams.data.entities.promotions.dtFreeSKUDetail>> freeSKusLoaded;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String remarks;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<java.lang.Boolean> orderSavedLiveData;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.fastservices.sams.data.entities.SKU> skuAdapterDataList;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableField<java.lang.String> searchQuerySKU = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.text.SimpleDateFormat getSdf() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeIn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<com.fastservices.sams.data.models.SummaryUIModel> getSummaryModelLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCategoryId() {
        return null;
    }
    
    public final void setCategoryId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getDataListUpdated() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.fastservices.sams.data.entities.Outlet getOutlet() {
        return null;
    }
    
    public final void setOutlet(@org.jetbrains.annotations.Nullable()
    com.fastservices.sams.data.entities.Outlet p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<java.lang.Integer> getToggleDetailLayout() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.fastservices.sams.data.entities.Category> getCategories() {
        return null;
    }
    
    public final void setCategories(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.fastservices.sams.data.entities.Category> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getCategoriesLoaded() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getShowEmptyView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.fastservices.sams.data.entities.OrderItem> getOrderList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getSummaryClicked() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.String> getGrossAmountObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Integer> getTotalUnitsObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Integer> getTotalCartonssObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSearchQuery() {
        return null;
    }
    
    public final void setSearchQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<java.lang.Boolean> getAscending() {
        return null;
    }
    
    public final void setAscending(@org.jetbrains.annotations.NotNull()
    android.databinding.ObservableField<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getImages() {
        return null;
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
    
    public final int getPaymentType() {
        return 0;
    }
    
    public final void setPaymentType(int p0) {
    }
    
    public final boolean containsAnyOrder() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.fastservices.sams.data.entities.OrderItem> getOrders() {
        return null;
    }
    
    public final void orderSummaryClicked() {
    }
    
    public final void collapseClicked() {
    }
    
    public final void applyFilter(@org.jetbrains.annotations.NotNull()
    java.lang.String q) {
    }
    
    public final void sorting() {
    }
    
    public final void imageTaken(@org.jetbrains.annotations.Nullable()
    java.lang.String fileUri) {
    }
    
    public final void addOrderItem(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.data.entities.SKU sku, int unit, int carton) {
    }
    
    public final int removeOrderItem(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.data.entities.OrderItem item) {
        return 0;
    }
    
    private final void calculateGrossAmount() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.fastservices.sams.data.entities.SKU> getSkuList(int category_id) {
        return null;
    }
    
    public final void updateSKU(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.data.entities.SKU sku, int units, int cartons) {
    }
    
    public final void paymentTypeCredit() {
    }
    
    public final void paymentTypeCash() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.util.List<com.fastservices.sams.data.entities.promotions.dtFreeSKUDetail>> getFreeSKusLoaded() {
        return null;
    }
    
    public final void setFreeSKusLoaded(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<java.util.List<com.fastservices.sams.data.entities.promotions.dtFreeSKUDetail>> p0) {
    }
    
    public final void performCalculations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRemarks() {
        return null;
    }
    
    public final void setRemarks(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getOrderSavedLiveData() {
        return null;
    }
    
    public final void setOrderSavedLiveData(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    public final void saveOrderNow() {
    }
    
    public final void removeFileUri(@org.jetbrains.annotations.NotNull()
    java.lang.String uri) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.fastservices.sams.data.entities.SKU> getSkuAdapterDataList() {
        return null;
    }
    
    public final void setSkuAdapterDataList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.fastservices.sams.data.entities.SKU> p0) {
    }
    
    public final void loadSKUs() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<java.lang.String> getSearchQuerySKU() {
        return null;
    }
    
    public final void applySKUFilter(@org.jetbrains.annotations.NotNull()
    java.lang.String input) {
    }
    
    public OrderVM() {
        super();
    }
}