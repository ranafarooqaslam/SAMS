package com.fastservices.sams.data.entities;

import java.lang.System;

@android.arch.persistence.room.Entity(primaryKeys = {"SKU_ID", "STOCK_MASTER_ID"})
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\t\u00a2\u0006\u0002\u0010\rJ\t\u0010\"\u001a\u00020\u0004H\u00c6\u0003J\t\u0010#\u001a\u00020\u0004H\u00c6\u0003J\t\u0010$\u001a\u00020\u0007H\u00c6\u0003J\t\u0010%\u001a\u00020\tH\u00c6\u0003J\t\u0010&\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0004H\u00c6\u0003J\t\u0010(\u001a\u00020\tH\u00c6\u0003JO\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\tH\u00c6\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010-\u001a\u00020\tH\u00d6\u0001J\t\u0010.\u001a\u00020\u0004H\u00d6\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001a\u0010\n\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001a\u0010\f\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001f\u00a8\u0006/"}, d2 = {"Lcom/fastservices/sams/data/entities/StockPosition;", "", "()V", "SKU_ID", "", "Quantity", "Price", "", "UnitInCase", "", "SKU_NAME", "SKU_CODE", "STOCK_MASTER_ID", "(Ljava/lang/String;Ljava/lang/String;DILjava/lang/String;Ljava/lang/String;I)V", "getPrice", "()D", "setPrice", "(D)V", "getQuantity", "()Ljava/lang/String;", "setQuantity", "(Ljava/lang/String;)V", "getSKU_CODE", "setSKU_CODE", "getSKU_ID", "setSKU_ID", "getSKU_NAME", "setSKU_NAME", "getSTOCK_MASTER_ID", "()I", "setSTOCK_MASTER_ID", "(I)V", "getUnitInCase", "setUnitInCase", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_release"})
public final class StockPosition {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "SKUID")
    private java.lang.String SKU_ID;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Quantity")
    private java.lang.String Quantity;
    @com.google.gson.annotations.SerializedName(value = "Price")
    private double Price;
    @com.google.gson.annotations.SerializedName(value = "Unit_In_Case")
    private int UnitInCase;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String SKU_NAME;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String SKU_CODE;
    private int STOCK_MASTER_ID;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSKU_ID() {
        return null;
    }
    
    public final void setSKU_ID(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQuantity() {
        return null;
    }
    
    public final void setQuantity(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getPrice() {
        return 0.0;
    }
    
    public final void setPrice(double p0) {
    }
    
    public final int getUnitInCase() {
        return 0;
    }
    
    public final void setUnitInCase(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSKU_NAME() {
        return null;
    }
    
    public final void setSKU_NAME(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSKU_CODE() {
        return null;
    }
    
    public final void setSKU_CODE(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getSTOCK_MASTER_ID() {
        return 0;
    }
    
    public final void setSTOCK_MASTER_ID(int p0) {
    }
    
    public StockPosition(@org.jetbrains.annotations.NotNull()
    java.lang.String SKU_ID, @org.jetbrains.annotations.NotNull()
    java.lang.String Quantity, double Price, int UnitInCase, @org.jetbrains.annotations.NotNull()
    java.lang.String SKU_NAME, @org.jetbrains.annotations.NotNull()
    java.lang.String SKU_CODE, int STOCK_MASTER_ID) {
        super();
    }
    
    public StockPosition() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fastservices.sams.data.entities.StockPosition copy(@org.jetbrains.annotations.NotNull()
    java.lang.String SKU_ID, @org.jetbrains.annotations.NotNull()
    java.lang.String Quantity, double Price, int UnitInCase, @org.jetbrains.annotations.NotNull()
    java.lang.String SKU_NAME, @org.jetbrains.annotations.NotNull()
    java.lang.String SKU_CODE, int STOCK_MASTER_ID) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}