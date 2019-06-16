package com.fastservices.sams.data.entities;

import java.lang.System;

@android.arch.persistence.room.Entity(tableName = "ORDER_DETAIL")
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\bu\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u00ed\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\u0006\u0010\u001b\u001a\u00020\t\u0012\u0006\u0010\u001c\u001a\u00020\t\u0012\u0006\u0010\u001d\u001a\u00020\t\u0012\u0006\u0010\u001e\u001a\u00020\t\u0012\u0006\u0010\u001f\u001a\u00020\t\u0012\u0006\u0010 \u001a\u00020\t\u00a2\u0006\u0002\u0010!J\t\u0010`\u001a\u00020\u0003H\u00c6\u0003J\t\u0010a\u001a\u00020\tH\u00c6\u0003J\t\u0010b\u001a\u00020\tH\u00c6\u0003J\t\u0010c\u001a\u00020\tH\u00c6\u0003J\t\u0010d\u001a\u00020\tH\u00c6\u0003J\t\u0010e\u001a\u00020\tH\u00c6\u0003J\t\u0010f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010g\u001a\u00020\tH\u00c6\u0003J\t\u0010h\u001a\u00020\tH\u00c6\u0003J\t\u0010i\u001a\u00020\tH\u00c6\u0003J\t\u0010j\u001a\u00020\tH\u00c6\u0003J\t\u0010k\u001a\u00020\u0003H\u00c6\u0003J\t\u0010l\u001a\u00020\tH\u00c6\u0003J\t\u0010m\u001a\u00020\tH\u00c6\u0003J\t\u0010n\u001a\u00020\tH\u00c6\u0003J\t\u0010o\u001a\u00020\tH\u00c6\u0003J\t\u0010p\u001a\u00020\tH\u00c6\u0003J\t\u0010q\u001a\u00020\tH\u00c6\u0003J\t\u0010r\u001a\u00020\tH\u00c6\u0003J\t\u0010s\u001a\u00020\tH\u00c6\u0003J\t\u0010t\u001a\u00020\tH\u00c6\u0003J\t\u0010u\u001a\u00020\tH\u00c6\u0003J\t\u0010v\u001a\u00020\u0003H\u00c6\u0003J\t\u0010w\u001a\u00020\u0003H\u00c6\u0003J\t\u0010x\u001a\u00020\u0003H\u00c6\u0003J\t\u0010y\u001a\u00020\tH\u00c6\u0003J\t\u0010z\u001a\u00020\tH\u00c6\u0003J\t\u0010{\u001a\u00020\tH\u00c6\u0003J\t\u0010|\u001a\u00020\tH\u00c6\u0003J\u00ab\u0002\u0010}\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\tH\u00c6\u0001J\u0014\u0010~\u001a\u00020\u007f2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0003H\u00d6\u0001J\u000b\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u00d6\u0001R\u001e\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001e\u0010\r\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%R\u001e\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010#\"\u0004\b-\u0010%R\u001e\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010#\"\u0004\b/\u0010%R\u001e\u0010\u0014\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010#\"\u0004\b1\u0010%R\u001e\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010#\"\u0004\b3\u0010%R\u001e\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010#\"\u0004\b5\u0010%R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\'\"\u0004\b7\u0010)R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\'\"\u0004\b9\u0010)R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\'\"\u0004\b;\u0010)R\u001e\u0010\u0011\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010#\"\u0004\b=\u0010%R\u001e\u0010\u0017\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010#\"\u0004\b?\u0010%R\u001e\u0010\u001e\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010#\"\u0004\bA\u0010%R\u001e\u0010\u001d\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010#\"\u0004\bC\u0010%R\u001e\u0010\u0018\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010#\"\u0004\bE\u0010%R\u001e\u0010 \u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010#\"\u0004\bG\u0010%R\u001e\u0010\u001f\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010#\"\u0004\bI\u0010%R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\'\"\u0004\bK\u0010)R\u001e\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010#\"\u0004\bM\u0010%R\u001e\u0010\u0015\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010#\"\u0004\bO\u0010%R\u001e\u0010\u001a\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010#\"\u0004\bQ\u0010%R\u001e\u0010\u0019\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010#\"\u0004\bS\u0010%R\u001e\u0010\u0016\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010#\"\u0004\bU\u0010%R\u001e\u0010\u001c\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010#\"\u0004\bW\u0010%R\u001e\u0010\u001b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010#\"\u0004\bY\u0010%R\u001e\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010#\"\u0004\b[\u0010%R\u001e\u0010\u0012\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\'\"\u0004\b]\u0010)R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010#\"\u0004\b_\u0010%\u00a8\u0006\u0084\u0001"}, d2 = {"Lcom/fastservices/sams/data/entities/OrderDetail;", "", "ORDER_DETAIL_ID", "", "DISTRIBUTOR_ID", "SALE_ORDER_ID", "SKU_ID", "QUANTITY_UNIT", "UNIT_PRICE", "", "GST_RATE", "AMOUNT", "STANDARD_DISCOUNT", "EXTRA_DISCOUNT", "GST_AMOUNT", "NET_AMOUNT", "TST_AMOUNT", "SED_AMOUNT", "UNITS_IN_CASE", "EXTRA_TAX", "GST_PRICE", "STANDARD_DISCOUNT_BY_VALUE", "STANDARD_DISCOUNT_PER_VALUE", "SED_AMOUNT_BY_VALUE", "SED_AMOUNT_PER_VALUE", "STANDARD_DISCOUNT_BY_VALUE_TO", "STANDARD_DISCOUNT_BY_VALUE_AD", "STANDARD_DISCOUNT_PER_VALUE_TO", "STANDARD_DISCOUNT_PER_VALUE_AD", "SED_AMOUNT_BY_VALUE_TO", "SED_AMOUNT_BY_VALUE_AD", "SED_AMOUNT_PER_VALUE_TO", "SED_AMOUNT_PER_VALUE_AD", "(IIIIIDDDDDDDDDIDDDDDDDDDDDDDD)V", "getAMOUNT", "()D", "setAMOUNT", "(D)V", "getDISTRIBUTOR_ID", "()I", "setDISTRIBUTOR_ID", "(I)V", "getEXTRA_DISCOUNT", "setEXTRA_DISCOUNT", "getEXTRA_TAX", "setEXTRA_TAX", "getGST_AMOUNT", "setGST_AMOUNT", "getGST_PRICE", "setGST_PRICE", "getGST_RATE", "setGST_RATE", "getNET_AMOUNT", "setNET_AMOUNT", "getORDER_DETAIL_ID", "setORDER_DETAIL_ID", "getQUANTITY_UNIT", "setQUANTITY_UNIT", "getSALE_ORDER_ID", "setSALE_ORDER_ID", "getSED_AMOUNT", "setSED_AMOUNT", "getSED_AMOUNT_BY_VALUE", "setSED_AMOUNT_BY_VALUE", "getSED_AMOUNT_BY_VALUE_AD", "setSED_AMOUNT_BY_VALUE_AD", "getSED_AMOUNT_BY_VALUE_TO", "setSED_AMOUNT_BY_VALUE_TO", "getSED_AMOUNT_PER_VALUE", "setSED_AMOUNT_PER_VALUE", "getSED_AMOUNT_PER_VALUE_AD", "setSED_AMOUNT_PER_VALUE_AD", "getSED_AMOUNT_PER_VALUE_TO", "setSED_AMOUNT_PER_VALUE_TO", "getSKU_ID", "setSKU_ID", "getSTANDARD_DISCOUNT", "setSTANDARD_DISCOUNT", "getSTANDARD_DISCOUNT_BY_VALUE", "setSTANDARD_DISCOUNT_BY_VALUE", "getSTANDARD_DISCOUNT_BY_VALUE_AD", "setSTANDARD_DISCOUNT_BY_VALUE_AD", "getSTANDARD_DISCOUNT_BY_VALUE_TO", "setSTANDARD_DISCOUNT_BY_VALUE_TO", "getSTANDARD_DISCOUNT_PER_VALUE", "setSTANDARD_DISCOUNT_PER_VALUE", "getSTANDARD_DISCOUNT_PER_VALUE_AD", "setSTANDARD_DISCOUNT_PER_VALUE_AD", "getSTANDARD_DISCOUNT_PER_VALUE_TO", "setSTANDARD_DISCOUNT_PER_VALUE_TO", "getTST_AMOUNT", "setTST_AMOUNT", "getUNITS_IN_CASE", "setUNITS_IN_CASE", "getUNIT_PRICE", "setUNIT_PRICE", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class OrderDetail {
    @android.arch.persistence.room.PrimaryKey(autoGenerate = true)
    private int ORDER_DETAIL_ID;
    @com.google.gson.annotations.SerializedName(value = "DISTRIBUTOR_ID")
    private int DISTRIBUTOR_ID;
    @com.google.gson.annotations.SerializedName(value = "SALE_ORDER_ID")
    private int SALE_ORDER_ID;
    @com.google.gson.annotations.SerializedName(value = "SKUID")
    private int SKU_ID;
    @com.google.gson.annotations.SerializedName(value = "Quantity")
    private int QUANTITY_UNIT;
    @com.google.gson.annotations.SerializedName(value = "Price")
    private double UNIT_PRICE;
    @com.google.gson.annotations.SerializedName(value = "GSTRate")
    private double GST_RATE;
    @com.google.gson.annotations.SerializedName(value = "Amount")
    private double AMOUNT;
    @com.google.gson.annotations.SerializedName(value = "StandardDiscount")
    private double STANDARD_DISCOUNT;
    @com.google.gson.annotations.SerializedName(value = "ExtraDiscount")
    private double EXTRA_DISCOUNT;
    @com.google.gson.annotations.SerializedName(value = "GSTAmount")
    private double GST_AMOUNT;
    @com.google.gson.annotations.SerializedName(value = "NetAmount")
    private double NET_AMOUNT;
    @com.google.gson.annotations.SerializedName(value = "TSTAmount")
    private double TST_AMOUNT;
    @com.google.gson.annotations.SerializedName(value = "SedAmount")
    private double SED_AMOUNT;
    @com.google.gson.annotations.SerializedName(value = "Unit_In_Case")
    private int UNITS_IN_CASE;
    @com.google.gson.annotations.SerializedName(value = "ExtraTax")
    private double EXTRA_TAX;
    @com.google.gson.annotations.SerializedName(value = "GSTPrice")
    private double GST_PRICE;
    @com.google.gson.annotations.SerializedName(value = "StandardDiscountByValue")
    private double STANDARD_DISCOUNT_BY_VALUE;
    @com.google.gson.annotations.SerializedName(value = "StandardDiscountPerValue")
    private double STANDARD_DISCOUNT_PER_VALUE;
    @com.google.gson.annotations.SerializedName(value = "SedAmountByValue")
    private double SED_AMOUNT_BY_VALUE;
    @com.google.gson.annotations.SerializedName(value = "SedAmountPerValue")
    private double SED_AMOUNT_PER_VALUE;
    @com.google.gson.annotations.SerializedName(value = "StandardDiscountByValueTo")
    private double STANDARD_DISCOUNT_BY_VALUE_TO;
    @com.google.gson.annotations.SerializedName(value = "StandardDiscountByValueAd")
    private double STANDARD_DISCOUNT_BY_VALUE_AD;
    @com.google.gson.annotations.SerializedName(value = "StandardDiscountPerValueTo")
    private double STANDARD_DISCOUNT_PER_VALUE_TO;
    @com.google.gson.annotations.SerializedName(value = "StandardDiscountPerValueAd")
    private double STANDARD_DISCOUNT_PER_VALUE_AD;
    @com.google.gson.annotations.SerializedName(value = "SedAmountByValueTo")
    private double SED_AMOUNT_BY_VALUE_TO;
    @com.google.gson.annotations.SerializedName(value = "SedAmountByValueAD")
    private double SED_AMOUNT_BY_VALUE_AD;
    @com.google.gson.annotations.SerializedName(value = "SedAmountPerValueTo")
    private double SED_AMOUNT_PER_VALUE_TO;
    @com.google.gson.annotations.SerializedName(value = "SedAmountPerValueAd")
    private double SED_AMOUNT_PER_VALUE_AD;
    
    public final int getORDER_DETAIL_ID() {
        return 0;
    }
    
    public final void setORDER_DETAIL_ID(int p0) {
    }
    
    public final int getDISTRIBUTOR_ID() {
        return 0;
    }
    
    public final void setDISTRIBUTOR_ID(int p0) {
    }
    
    public final int getSALE_ORDER_ID() {
        return 0;
    }
    
    public final void setSALE_ORDER_ID(int p0) {
    }
    
    public final int getSKU_ID() {
        return 0;
    }
    
    public final void setSKU_ID(int p0) {
    }
    
    public final int getQUANTITY_UNIT() {
        return 0;
    }
    
    public final void setQUANTITY_UNIT(int p0) {
    }
    
    public final double getUNIT_PRICE() {
        return 0.0;
    }
    
    public final void setUNIT_PRICE(double p0) {
    }
    
    public final double getGST_RATE() {
        return 0.0;
    }
    
    public final void setGST_RATE(double p0) {
    }
    
    public final double getAMOUNT() {
        return 0.0;
    }
    
    public final void setAMOUNT(double p0) {
    }
    
    public final double getSTANDARD_DISCOUNT() {
        return 0.0;
    }
    
    public final void setSTANDARD_DISCOUNT(double p0) {
    }
    
    public final double getEXTRA_DISCOUNT() {
        return 0.0;
    }
    
    public final void setEXTRA_DISCOUNT(double p0) {
    }
    
    public final double getGST_AMOUNT() {
        return 0.0;
    }
    
    public final void setGST_AMOUNT(double p0) {
    }
    
    public final double getNET_AMOUNT() {
        return 0.0;
    }
    
    public final void setNET_AMOUNT(double p0) {
    }
    
    public final double getTST_AMOUNT() {
        return 0.0;
    }
    
    public final void setTST_AMOUNT(double p0) {
    }
    
    public final double getSED_AMOUNT() {
        return 0.0;
    }
    
    public final void setSED_AMOUNT(double p0) {
    }
    
    public final int getUNITS_IN_CASE() {
        return 0;
    }
    
    public final void setUNITS_IN_CASE(int p0) {
    }
    
    public final double getEXTRA_TAX() {
        return 0.0;
    }
    
    public final void setEXTRA_TAX(double p0) {
    }
    
    public final double getGST_PRICE() {
        return 0.0;
    }
    
    public final void setGST_PRICE(double p0) {
    }
    
    public final double getSTANDARD_DISCOUNT_BY_VALUE() {
        return 0.0;
    }
    
    public final void setSTANDARD_DISCOUNT_BY_VALUE(double p0) {
    }
    
    public final double getSTANDARD_DISCOUNT_PER_VALUE() {
        return 0.0;
    }
    
    public final void setSTANDARD_DISCOUNT_PER_VALUE(double p0) {
    }
    
    public final double getSED_AMOUNT_BY_VALUE() {
        return 0.0;
    }
    
    public final void setSED_AMOUNT_BY_VALUE(double p0) {
    }
    
    public final double getSED_AMOUNT_PER_VALUE() {
        return 0.0;
    }
    
    public final void setSED_AMOUNT_PER_VALUE(double p0) {
    }
    
    public final double getSTANDARD_DISCOUNT_BY_VALUE_TO() {
        return 0.0;
    }
    
    public final void setSTANDARD_DISCOUNT_BY_VALUE_TO(double p0) {
    }
    
    public final double getSTANDARD_DISCOUNT_BY_VALUE_AD() {
        return 0.0;
    }
    
    public final void setSTANDARD_DISCOUNT_BY_VALUE_AD(double p0) {
    }
    
    public final double getSTANDARD_DISCOUNT_PER_VALUE_TO() {
        return 0.0;
    }
    
    public final void setSTANDARD_DISCOUNT_PER_VALUE_TO(double p0) {
    }
    
    public final double getSTANDARD_DISCOUNT_PER_VALUE_AD() {
        return 0.0;
    }
    
    public final void setSTANDARD_DISCOUNT_PER_VALUE_AD(double p0) {
    }
    
    public final double getSED_AMOUNT_BY_VALUE_TO() {
        return 0.0;
    }
    
    public final void setSED_AMOUNT_BY_VALUE_TO(double p0) {
    }
    
    public final double getSED_AMOUNT_BY_VALUE_AD() {
        return 0.0;
    }
    
    public final void setSED_AMOUNT_BY_VALUE_AD(double p0) {
    }
    
    public final double getSED_AMOUNT_PER_VALUE_TO() {
        return 0.0;
    }
    
    public final void setSED_AMOUNT_PER_VALUE_TO(double p0) {
    }
    
    public final double getSED_AMOUNT_PER_VALUE_AD() {
        return 0.0;
    }
    
    public final void setSED_AMOUNT_PER_VALUE_AD(double p0) {
    }
    
    public OrderDetail(int ORDER_DETAIL_ID, int DISTRIBUTOR_ID, int SALE_ORDER_ID, int SKU_ID, int QUANTITY_UNIT, double UNIT_PRICE, double GST_RATE, double AMOUNT, double STANDARD_DISCOUNT, double EXTRA_DISCOUNT, double GST_AMOUNT, double NET_AMOUNT, double TST_AMOUNT, double SED_AMOUNT, int UNITS_IN_CASE, double EXTRA_TAX, double GST_PRICE, double STANDARD_DISCOUNT_BY_VALUE, double STANDARD_DISCOUNT_PER_VALUE, double SED_AMOUNT_BY_VALUE, double SED_AMOUNT_PER_VALUE, double STANDARD_DISCOUNT_BY_VALUE_TO, double STANDARD_DISCOUNT_BY_VALUE_AD, double STANDARD_DISCOUNT_PER_VALUE_TO, double STANDARD_DISCOUNT_PER_VALUE_AD, double SED_AMOUNT_BY_VALUE_TO, double SED_AMOUNT_BY_VALUE_AD, double SED_AMOUNT_PER_VALUE_TO, double SED_AMOUNT_PER_VALUE_AD) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    public final double component7() {
        return 0.0;
    }
    
    public final double component8() {
        return 0.0;
    }
    
    public final double component9() {
        return 0.0;
    }
    
    public final double component10() {
        return 0.0;
    }
    
    public final double component11() {
        return 0.0;
    }
    
    public final double component12() {
        return 0.0;
    }
    
    public final double component13() {
        return 0.0;
    }
    
    public final double component14() {
        return 0.0;
    }
    
    public final int component15() {
        return 0;
    }
    
    public final double component16() {
        return 0.0;
    }
    
    public final double component17() {
        return 0.0;
    }
    
    public final double component18() {
        return 0.0;
    }
    
    public final double component19() {
        return 0.0;
    }
    
    public final double component20() {
        return 0.0;
    }
    
    public final double component21() {
        return 0.0;
    }
    
    public final double component22() {
        return 0.0;
    }
    
    public final double component23() {
        return 0.0;
    }
    
    public final double component24() {
        return 0.0;
    }
    
    public final double component25() {
        return 0.0;
    }
    
    public final double component26() {
        return 0.0;
    }
    
    public final double component27() {
        return 0.0;
    }
    
    public final double component28() {
        return 0.0;
    }
    
    public final double component29() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fastservices.sams.data.entities.OrderDetail copy(int ORDER_DETAIL_ID, int DISTRIBUTOR_ID, int SALE_ORDER_ID, int SKU_ID, int QUANTITY_UNIT, double UNIT_PRICE, double GST_RATE, double AMOUNT, double STANDARD_DISCOUNT, double EXTRA_DISCOUNT, double GST_AMOUNT, double NET_AMOUNT, double TST_AMOUNT, double SED_AMOUNT, int UNITS_IN_CASE, double EXTRA_TAX, double GST_PRICE, double STANDARD_DISCOUNT_BY_VALUE, double STANDARD_DISCOUNT_PER_VALUE, double SED_AMOUNT_BY_VALUE, double SED_AMOUNT_PER_VALUE, double STANDARD_DISCOUNT_BY_VALUE_TO, double STANDARD_DISCOUNT_BY_VALUE_AD, double STANDARD_DISCOUNT_PER_VALUE_TO, double STANDARD_DISCOUNT_PER_VALUE_AD, double SED_AMOUNT_BY_VALUE_TO, double SED_AMOUNT_BY_VALUE_AD, double SED_AMOUNT_PER_VALUE_TO, double SED_AMOUNT_PER_VALUE_AD) {
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