package com.fastservices.sams.modules.replacement;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010H\u001a\u00020IJ\u0010\u0010J\u001a\u00020I2\b\u0010K\u001a\u0004\u0018\u00010\u0006J\u0006\u0010L\u001a\u00020IJ\u0006\u0010M\u001a\u00020IJ\u0006\u0010N\u001a\u00020IJ\u000e\u0010O\u001a\u00020I2\u0006\u0010P\u001a\u00020\u0006J\u0006\u0010Q\u001a\u00020IJ\u0010\u0010R\u001a\u00020I2\b\u0010K\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\b\"\u0004\b\u0017\u0010\nR\u001a\u0010\u0018\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\nR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001c\u0010+\u001a\u0004\u0018\u00010,X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u00106\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00103\"\u0004\b8\u00105R\u001a\u00109\u001a\u00020:X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010$R\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010\u000fR\u0014\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010E\u001a\b\u0012\u0004\u0012\u00020\u00060\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u001e\"\u0004\bG\u0010 \u00a8\u0006S"}, d2 = {"Lcom/fastservices/sams/modules/replacement/ReplacementVM;", "Lcom/fastservices/sams/modules/base/BaseVM;", "()V", "ReplacementTypeID", "", "batchNumber", "", "getBatchNumber", "()Ljava/lang/String;", "setBatchNumber", "(Ljava/lang/String;)V", "dataSubmitted", "Landroid/arch/lifecycle/MutableLiveData;", "", "getDataSubmitted", "()Landroid/arch/lifecycle/MutableLiveData;", "description", "getDescription", "setDescription", "invoiceImages", "Ljava/util/ArrayList;", "invoiceNumber", "getInvoiceNumber", "setInvoiceNumber", "purchaseDate", "getPurchaseDate", "setPurchaseDate", "quantity", "Landroid/databinding/ObservableField;", "getQuantity", "()Landroid/databinding/ObservableField;", "setQuantity", "(Landroid/databinding/ObservableField;)V", "replacementReasons", "Lcom/fastservices/sams/data/entities/ReplacementReason;", "getReplacementReasons", "()Ljava/util/ArrayList;", "selectedDate", "Ljava/util/Date;", "getSelectedDate", "()Ljava/util/Date;", "setSelectedDate", "(Ljava/util/Date;)V", "selectedOutlet", "Lcom/fastservices/sams/data/entities/Outlet;", "getSelectedOutlet", "()Lcom/fastservices/sams/data/entities/Outlet;", "setSelectedOutlet", "(Lcom/fastservices/sams/data/entities/Outlet;)V", "selectedReasonId", "getSelectedReasonId", "()I", "setSelectedReasonId", "(I)V", "selectedSkuID", "getSelectedSkuID", "setSelectedSkuID", "selectedSkuPrice", "", "getSelectedSkuPrice", "()D", "setSelectedSkuPrice", "(D)V", "sku", "Lcom/fastservices/sams/data/entities/SKU;", "getSku", "skusLoaded", "getSkusLoaded", "stockImages", "totalPrice", "getTotalPrice", "setTotalPrice", "damageRadioSelected", "", "invoiceImageTaken", "fileUri", "onClickSubmit", "onQuantityTextChanged", "outletSelected", "removeFileUri", "uri", "replacementRadioSelected", "stockImageTaken", "app_debug"})
public final class ReplacementVM extends com.fastservices.sams.modules.base.BaseVM {
    @org.jetbrains.annotations.Nullable()
    private com.fastservices.sams.data.entities.Outlet selectedOutlet;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> skusLoaded = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> dataSubmitted = null;
    private int ReplacementTypeID;
    private int selectedSkuID;
    private double selectedSkuPrice;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String description;
    @org.jetbrains.annotations.NotNull()
    private android.databinding.ObservableField<java.lang.String> totalPrice;
    @org.jetbrains.annotations.NotNull()
    private android.databinding.ObservableField<java.lang.String> quantity;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String invoiceNumber;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String batchNumber;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String purchaseDate;
    @org.jetbrains.annotations.Nullable()
    private java.util.Date selectedDate;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.fastservices.sams.data.entities.SKU> sku = null;
    private int selectedReasonId;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.fastservices.sams.data.entities.ReplacementReason> replacementReasons = null;
    private final java.util.ArrayList<java.lang.String> stockImages = null;
    private final java.util.ArrayList<java.lang.String> invoiceImages = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.fastservices.sams.data.entities.Outlet getSelectedOutlet() {
        return null;
    }
    
    public final void setSelectedOutlet(@org.jetbrains.annotations.Nullable()
    com.fastservices.sams.data.entities.Outlet p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getSkusLoaded() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getDataSubmitted() {
        return null;
    }
    
    public final int getSelectedSkuID() {
        return 0;
    }
    
    public final void setSelectedSkuID(int p0) {
    }
    
    public final double getSelectedSkuPrice() {
        return 0.0;
    }
    
    public final void setSelectedSkuPrice(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<java.lang.String> getTotalPrice() {
        return null;
    }
    
    public final void setTotalPrice(@org.jetbrains.annotations.NotNull()
    android.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableField<java.lang.String> getQuantity() {
        return null;
    }
    
    public final void setQuantity(@org.jetbrains.annotations.NotNull()
    android.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getInvoiceNumber() {
        return null;
    }
    
    public final void setInvoiceNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBatchNumber() {
        return null;
    }
    
    public final void setBatchNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPurchaseDate() {
        return null;
    }
    
    public final void setPurchaseDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getSelectedDate() {
        return null;
    }
    
    public final void setSelectedDate(@org.jetbrains.annotations.Nullable()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.fastservices.sams.data.entities.SKU> getSku() {
        return null;
    }
    
    public final int getSelectedReasonId() {
        return 0;
    }
    
    public final void setSelectedReasonId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.fastservices.sams.data.entities.ReplacementReason> getReplacementReasons() {
        return null;
    }
    
    public final void outletSelected() {
    }
    
    public final void onQuantityTextChanged() {
    }
    
    public final void replacementRadioSelected() {
    }
    
    public final void damageRadioSelected() {
    }
    
    public final void onClickSubmit() {
    }
    
    public final void stockImageTaken(@org.jetbrains.annotations.Nullable()
    java.lang.String fileUri) {
    }
    
    public final void invoiceImageTaken(@org.jetbrains.annotations.Nullable()
    java.lang.String fileUri) {
    }
    
    public final void removeFileUri(@org.jetbrains.annotations.NotNull()
    java.lang.String uri) {
    }
    
    public ReplacementVM() {
        super();
    }
}