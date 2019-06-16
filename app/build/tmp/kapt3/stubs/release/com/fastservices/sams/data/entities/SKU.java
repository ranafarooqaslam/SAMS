package com.fastservices.sams.data.entities;

import java.lang.System;

@android.arch.persistence.room.Entity(tableName = "SKU")
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\bC\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0018J\t\u0010C\u001a\u00020\u0004H\u00c6\u0003J\t\u0010D\u001a\u00020\nH\u00c6\u0003J\t\u0010E\u001a\u00020\nH\u00c6\u0003J\t\u0010F\u001a\u00020\u0012H\u00c6\u0003J\t\u0010G\u001a\u00020\u0004H\u00c6\u0003J\t\u0010H\u001a\u00020\u0006H\u00c6\u0003J\t\u0010I\u001a\u00020\u0004H\u00c6\u0003J\t\u0010J\u001a\u00020\u0004H\u00c6\u0003J\t\u0010K\u001a\u00020\u0004H\u00c6\u0003J\t\u0010L\u001a\u00020\u0006H\u00c6\u0003J\t\u0010M\u001a\u00020\u0006H\u00c6\u0003J\t\u0010N\u001a\u00020\u0006H\u00c6\u0003J\t\u0010O\u001a\u00020\nH\u00c6\u0003J\t\u0010P\u001a\u00020\nH\u00c6\u0003J\t\u0010Q\u001a\u00020\u0004H\u00c6\u0003J\t\u0010R\u001a\u00020\u0004H\u00c6\u0003J\t\u0010S\u001a\u00020\u0004H\u00c6\u0003J\u00b3\u0001\u0010T\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010U\u001a\u00020V2\b\u0010W\u001a\u0004\u0018\u00010XH\u00d6\u0003J\b\u0010Y\u001a\u0004\u0018\u00010ZJ\t\u0010[\u001a\u00020\u0004H\u00d6\u0001J\b\u0010\\\u001a\u00020\u0006H\u0016R\u001e\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001e\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010 \"\u0004\b,\u0010\"R\u001e\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR\u001e\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001a\"\u0004\b0\u0010\u001cR\u001e\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010 \"\u0004\b2\u0010\"R\u001e\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001a\"\u0004\b4\u0010\u001cR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010(\"\u0004\b6\u0010*R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001a\"\u0004\b8\u0010\u001cR\u001e\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010(\"\u0004\b:\u0010*R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010 \"\u0004\b<\u0010\"R\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001a\"\u0004\b>\u0010\u001cR\u001e\u0010\u0014\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010(\"\u0004\b@\u0010*R\u001e\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001a\"\u0004\bB\u0010\u001c\u00a8\u0006]"}, d2 = {"Lcom/fastservices/sams/data/entities/SKU;", "Ljava/io/Serializable;", "()V", "SKU_ID", "", "SKU_CODE", "", "SKU_NAME", "GST_ON", "TRADE_PRICE", "", "GST_RATE", "UNITS_IN_CASE", "BRAND_ID", "WEIGHT", "DISTRIBUTOR_PRICE", "RETAIL_PRICE", "EXTR_Tax", "", "SEQUENCE_NUMBER", "UOM_DESC", "CATEGORY_ID", "NO_OF_UNITS", "NO_OF_CARTONS", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DDIIIDDFILjava/lang/String;III)V", "getBRAND_ID", "()I", "setBRAND_ID", "(I)V", "getCATEGORY_ID", "setCATEGORY_ID", "getDISTRIBUTOR_PRICE", "()D", "setDISTRIBUTOR_PRICE", "(D)V", "getEXTR_Tax", "()F", "setEXTR_Tax", "(F)V", "getGST_ON", "()Ljava/lang/String;", "setGST_ON", "(Ljava/lang/String;)V", "getGST_RATE", "setGST_RATE", "getNO_OF_CARTONS", "setNO_OF_CARTONS", "getNO_OF_UNITS", "setNO_OF_UNITS", "getRETAIL_PRICE", "setRETAIL_PRICE", "getSEQUENCE_NUMBER", "setSEQUENCE_NUMBER", "getSKU_CODE", "setSKU_CODE", "getSKU_ID", "setSKU_ID", "getSKU_NAME", "setSKU_NAME", "getTRADE_PRICE", "setTRADE_PRICE", "getUNITS_IN_CASE", "setUNITS_IN_CASE", "getUOM_DESC", "setUOM_DESC", "getWEIGHT", "setWEIGHT", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "getSubTotal", "", "hashCode", "toString", "app_release"})
public final class SKU implements java.io.Serializable {
    @android.arch.persistence.room.PrimaryKey()
    @com.google.gson.annotations.SerializedName(value = "skU_ID")
    private int SKU_ID;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "skU_CODE")
    private java.lang.String SKU_CODE;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "skU_NAME")
    private java.lang.String SKU_NAME;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "gsT_ON")
    private java.lang.String GST_ON;
    @com.google.gson.annotations.SerializedName(value = "tradE_PRICE")
    private double TRADE_PRICE;
    @com.google.gson.annotations.SerializedName(value = "gsT_RATE")
    private double GST_RATE;
    @com.google.gson.annotations.SerializedName(value = "unitS_IN_CASE")
    private int UNITS_IN_CASE;
    @com.google.gson.annotations.SerializedName(value = "branD_ID")
    private int BRAND_ID;
    @com.google.gson.annotations.SerializedName(value = "weight")
    private int WEIGHT;
    @com.google.gson.annotations.SerializedName(value = "distributoR_PRICE")
    private double DISTRIBUTOR_PRICE;
    @com.google.gson.annotations.SerializedName(value = "retaiL_PRICE")
    private double RETAIL_PRICE;
    @com.google.gson.annotations.SerializedName(value = "extr_Tax")
    private float EXTR_Tax;
    @com.google.gson.annotations.SerializedName(value = "sequencE_NUMBER")
    private int SEQUENCE_NUMBER;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "uoM_DESC")
    private java.lang.String UOM_DESC;
    @com.google.gson.annotations.SerializedName(value = "categorY_ID")
    private int CATEGORY_ID;
    @android.arch.persistence.room.Ignore()
    private int NO_OF_UNITS;
    @android.arch.persistence.room.Ignore()
    private int NO_OF_CARTONS;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.CharSequence getSubTotal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public final int getSKU_ID() {
        return 0;
    }
    
    public final void setSKU_ID(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSKU_CODE() {
        return null;
    }
    
    public final void setSKU_CODE(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSKU_NAME() {
        return null;
    }
    
    public final void setSKU_NAME(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGST_ON() {
        return null;
    }
    
    public final void setGST_ON(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getTRADE_PRICE() {
        return 0.0;
    }
    
    public final void setTRADE_PRICE(double p0) {
    }
    
    public final double getGST_RATE() {
        return 0.0;
    }
    
    public final void setGST_RATE(double p0) {
    }
    
    public final int getUNITS_IN_CASE() {
        return 0;
    }
    
    public final void setUNITS_IN_CASE(int p0) {
    }
    
    public final int getBRAND_ID() {
        return 0;
    }
    
    public final void setBRAND_ID(int p0) {
    }
    
    public final int getWEIGHT() {
        return 0;
    }
    
    public final void setWEIGHT(int p0) {
    }
    
    public final double getDISTRIBUTOR_PRICE() {
        return 0.0;
    }
    
    public final void setDISTRIBUTOR_PRICE(double p0) {
    }
    
    public final double getRETAIL_PRICE() {
        return 0.0;
    }
    
    public final void setRETAIL_PRICE(double p0) {
    }
    
    public final float getEXTR_Tax() {
        return 0.0F;
    }
    
    public final void setEXTR_Tax(float p0) {
    }
    
    public final int getSEQUENCE_NUMBER() {
        return 0;
    }
    
    public final void setSEQUENCE_NUMBER(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUOM_DESC() {
        return null;
    }
    
    public final void setUOM_DESC(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getCATEGORY_ID() {
        return 0;
    }
    
    public final void setCATEGORY_ID(int p0) {
    }
    
    public final int getNO_OF_UNITS() {
        return 0;
    }
    
    public final void setNO_OF_UNITS(int p0) {
    }
    
    public final int getNO_OF_CARTONS() {
        return 0;
    }
    
    public final void setNO_OF_CARTONS(int p0) {
    }
    
    public SKU(int SKU_ID, @org.jetbrains.annotations.NotNull()
    java.lang.String SKU_CODE, @org.jetbrains.annotations.NotNull()
    java.lang.String SKU_NAME, @org.jetbrains.annotations.NotNull()
    java.lang.String GST_ON, double TRADE_PRICE, double GST_RATE, int UNITS_IN_CASE, int BRAND_ID, int WEIGHT, double DISTRIBUTOR_PRICE, double RETAIL_PRICE, float EXTR_Tax, int SEQUENCE_NUMBER, @org.jetbrains.annotations.NotNull()
    java.lang.String UOM_DESC, int CATEGORY_ID, int NO_OF_UNITS, int NO_OF_CARTONS) {
        super();
    }
    
    public SKU() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    public final double component5() {
        return 0.0;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int component9() {
        return 0;
    }
    
    public final double component10() {
        return 0.0;
    }
    
    public final double component11() {
        return 0.0;
    }
    
    public final float component12() {
        return 0.0F;
    }
    
    public final int component13() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    public final int component15() {
        return 0;
    }
    
    public final int component16() {
        return 0;
    }
    
    public final int component17() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fastservices.sams.data.entities.SKU copy(int SKU_ID, @org.jetbrains.annotations.NotNull()
    java.lang.String SKU_CODE, @org.jetbrains.annotations.NotNull()
    java.lang.String SKU_NAME, @org.jetbrains.annotations.NotNull()
    java.lang.String GST_ON, double TRADE_PRICE, double GST_RATE, int UNITS_IN_CASE, int BRAND_ID, int WEIGHT, double DISTRIBUTOR_PRICE, double RETAIL_PRICE, float EXTR_Tax, int SEQUENCE_NUMBER, @org.jetbrains.annotations.NotNull()
    java.lang.String UOM_DESC, int CATEGORY_ID, int NO_OF_UNITS, int NO_OF_CARTONS) {
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