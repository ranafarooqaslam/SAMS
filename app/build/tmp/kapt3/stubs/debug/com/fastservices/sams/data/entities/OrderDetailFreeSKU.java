package com.fastservices.sams.data.entities;

import java.lang.System;

@android.arch.persistence.room.Entity(tableName = "SALE_ORDER_PROMOTION")
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\bN\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u00a5\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0019J\t\u0010H\u001a\u00020\u0003H\u00c6\u0003J\t\u0010I\u001a\u00020\u0003H\u00c6\u0003J\t\u0010J\u001a\u00020\u000fH\u00c6\u0003J\t\u0010K\u001a\u00020\u000fH\u00c6\u0003J\t\u0010L\u001a\u00020\u000fH\u00c6\u0003J\t\u0010M\u001a\u00020\u000fH\u00c6\u0003J\t\u0010N\u001a\u00020\u000fH\u00c6\u0003J\t\u0010O\u001a\u00020\u000fH\u00c6\u0003J\t\u0010P\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Q\u001a\u00020\u000fH\u00c6\u0003J\t\u0010R\u001a\u00020\u0003H\u00c6\u0003J\t\u0010S\u001a\u00020\u0003H\u00c6\u0003J\t\u0010T\u001a\u00020\u0003H\u00c6\u0003J\t\u0010U\u001a\u00020\u0003H\u00c6\u0003J\t\u0010V\u001a\u00020\u0003H\u00c6\u0003J\t\u0010W\u001a\u00020\bH\u00c6\u0003J\t\u0010X\u001a\u00020\bH\u00c6\u0003J\t\u0010Y\u001a\u00020\bH\u00c6\u0003J\t\u0010Z\u001a\u00020\bH\u00c6\u0003J\t\u0010[\u001a\u00020\u0003H\u00c6\u0003J\u00d1\u0001\u0010\\\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010]\u001a\u00020^2\b\u0010_\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010`\u001a\u00020\u0003H\u00d6\u0001J\t\u0010a\u001a\u00020bH\u00d6\u0001R\u001e\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001e\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR\u001e\u0010\u0012\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001b\"\u0004\b+\u0010\u001dR\u001e\u0010\u0011\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010\u001dR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001f\"\u0004\b/\u0010!R\u001e\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001f\"\u0004\b1\u0010!R\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010%\"\u0004\b3\u0010\'R\u001e\u0010\u0018\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010%\"\u0004\b5\u0010\'R\u001e\u0010\u0017\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010%\"\u0004\b7\u0010\'R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010%\"\u0004\b9\u0010\'R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010%\"\u0004\b;\u0010\'R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010%\"\u0004\b=\u0010\'R\u001e\u0010\u0014\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001b\"\u0004\b?\u0010\u001dR\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010%\"\u0004\bA\u0010\'R\u001e\u0010\u0013\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u001b\"\u0004\bC\u0010\u001dR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u001b\"\u0004\bE\u0010\u001dR\u001e\u0010\u0015\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010%\"\u0004\bG\u0010\'\u00a8\u0006c"}, d2 = {"Lcom/fastservices/sams/data/entities/OrderDetailFreeSKU;", "", "SALE_ORDER_PROMOTION_ID", "", "DISTRIBUTOR_ID", "SALE_ORDER_ID", "SCHEME_ID", "PROMOTION_ID", "", "BASKET_ID", "BASKET_DETAIL_ID", "PROMOTION_OFFER_ID", "SKU_ID", "QUANTITY", "UNIT_PRICE", "", "AMOUNT", "GST_RATE", "GST_AMOUNT", "TST_AMOUNT", "SED_AMOUNT", "master_Sku_Id", "EXTRA_TAX", "QUANTITY_TO", "QUANTITY_AD", "(IIIIJJJJIIDDDDDDIDII)V", "getAMOUNT", "()D", "setAMOUNT", "(D)V", "getBASKET_DETAIL_ID", "()J", "setBASKET_DETAIL_ID", "(J)V", "getBASKET_ID", "setBASKET_ID", "getDISTRIBUTOR_ID", "()I", "setDISTRIBUTOR_ID", "(I)V", "getEXTRA_TAX", "setEXTRA_TAX", "getGST_AMOUNT", "setGST_AMOUNT", "getGST_RATE", "setGST_RATE", "getPROMOTION_ID", "setPROMOTION_ID", "getPROMOTION_OFFER_ID", "setPROMOTION_OFFER_ID", "getQUANTITY", "setQUANTITY", "getQUANTITY_AD", "setQUANTITY_AD", "getQUANTITY_TO", "setQUANTITY_TO", "getSALE_ORDER_ID", "setSALE_ORDER_ID", "getSALE_ORDER_PROMOTION_ID", "setSALE_ORDER_PROMOTION_ID", "getSCHEME_ID", "setSCHEME_ID", "getSED_AMOUNT", "setSED_AMOUNT", "getSKU_ID", "setSKU_ID", "getTST_AMOUNT", "setTST_AMOUNT", "getUNIT_PRICE", "setUNIT_PRICE", "getMaster_Sku_Id", "setMaster_Sku_Id", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class OrderDetailFreeSKU {
    @android.arch.persistence.room.PrimaryKey(autoGenerate = true)
    private int SALE_ORDER_PROMOTION_ID;
    @com.google.gson.annotations.SerializedName(value = "DISTRIBUTOR_ID")
    private int DISTRIBUTOR_ID;
    @com.google.gson.annotations.SerializedName(value = "SALE_ORDER_ID")
    private int SALE_ORDER_ID;
    @com.google.gson.annotations.SerializedName(value = "SCHEME_ID")
    private int SCHEME_ID;
    @com.google.gson.annotations.SerializedName(value = "PromotionID")
    private long PROMOTION_ID;
    @com.google.gson.annotations.SerializedName(value = "BasketID")
    private long BASKET_ID;
    @com.google.gson.annotations.SerializedName(value = "BasketDetailID")
    private long BASKET_DETAIL_ID;
    @com.google.gson.annotations.SerializedName(value = "PromotionOfferID")
    private long PROMOTION_OFFER_ID;
    @com.google.gson.annotations.SerializedName(value = "SKUID")
    private int SKU_ID;
    @com.google.gson.annotations.SerializedName(value = "Quantity")
    private int QUANTITY;
    @com.google.gson.annotations.SerializedName(value = "Price")
    private double UNIT_PRICE;
    @com.google.gson.annotations.SerializedName(value = "Amount")
    private double AMOUNT;
    @com.google.gson.annotations.SerializedName(value = "GSTRate")
    private double GST_RATE;
    @com.google.gson.annotations.SerializedName(value = "GSTAmount")
    private double GST_AMOUNT;
    @com.google.gson.annotations.SerializedName(value = "TSTAmount")
    private double TST_AMOUNT;
    @com.google.gson.annotations.SerializedName(value = "SED_AMOUNT")
    private double SED_AMOUNT;
    @com.google.gson.annotations.SerializedName(value = "MasterSKUID")
    private int master_Sku_Id;
    @com.google.gson.annotations.SerializedName(value = "ExtraTax")
    private double EXTRA_TAX;
    @com.google.gson.annotations.SerializedName(value = "QuantityTo")
    private int QUANTITY_TO;
    @com.google.gson.annotations.SerializedName(value = "QuantityAd")
    private int QUANTITY_AD;
    
    public final int getSALE_ORDER_PROMOTION_ID() {
        return 0;
    }
    
    public final void setSALE_ORDER_PROMOTION_ID(int p0) {
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
    
    public final int getSCHEME_ID() {
        return 0;
    }
    
    public final void setSCHEME_ID(int p0) {
    }
    
    public final long getPROMOTION_ID() {
        return 0L;
    }
    
    public final void setPROMOTION_ID(long p0) {
    }
    
    public final long getBASKET_ID() {
        return 0L;
    }
    
    public final void setBASKET_ID(long p0) {
    }
    
    public final long getBASKET_DETAIL_ID() {
        return 0L;
    }
    
    public final void setBASKET_DETAIL_ID(long p0) {
    }
    
    public final long getPROMOTION_OFFER_ID() {
        return 0L;
    }
    
    public final void setPROMOTION_OFFER_ID(long p0) {
    }
    
    public final int getSKU_ID() {
        return 0;
    }
    
    public final void setSKU_ID(int p0) {
    }
    
    public final int getQUANTITY() {
        return 0;
    }
    
    public final void setQUANTITY(int p0) {
    }
    
    public final double getUNIT_PRICE() {
        return 0.0;
    }
    
    public final void setUNIT_PRICE(double p0) {
    }
    
    public final double getAMOUNT() {
        return 0.0;
    }
    
    public final void setAMOUNT(double p0) {
    }
    
    public final double getGST_RATE() {
        return 0.0;
    }
    
    public final void setGST_RATE(double p0) {
    }
    
    public final double getGST_AMOUNT() {
        return 0.0;
    }
    
    public final void setGST_AMOUNT(double p0) {
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
    
    public final int getMaster_Sku_Id() {
        return 0;
    }
    
    public final void setMaster_Sku_Id(int p0) {
    }
    
    public final double getEXTRA_TAX() {
        return 0.0;
    }
    
    public final void setEXTRA_TAX(double p0) {
    }
    
    public final int getQUANTITY_TO() {
        return 0;
    }
    
    public final void setQUANTITY_TO(int p0) {
    }
    
    public final int getQUANTITY_AD() {
        return 0;
    }
    
    public final void setQUANTITY_AD(int p0) {
    }
    
    public OrderDetailFreeSKU(int SALE_ORDER_PROMOTION_ID, int DISTRIBUTOR_ID, int SALE_ORDER_ID, int SCHEME_ID, long PROMOTION_ID, long BASKET_ID, long BASKET_DETAIL_ID, long PROMOTION_OFFER_ID, int SKU_ID, int QUANTITY, double UNIT_PRICE, double AMOUNT, double GST_RATE, double GST_AMOUNT, double TST_AMOUNT, double SED_AMOUNT, int master_Sku_Id, double EXTRA_TAX, int QUANTITY_TO, int QUANTITY_AD) {
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
    
    public final long component5() {
        return 0L;
    }
    
    public final long component6() {
        return 0L;
    }
    
    public final long component7() {
        return 0L;
    }
    
    public final long component8() {
        return 0L;
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int component10() {
        return 0;
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
    
    public final double component15() {
        return 0.0;
    }
    
    public final double component16() {
        return 0.0;
    }
    
    public final int component17() {
        return 0;
    }
    
    public final double component18() {
        return 0.0;
    }
    
    public final int component19() {
        return 0;
    }
    
    public final int component20() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fastservices.sams.data.entities.OrderDetailFreeSKU copy(int SALE_ORDER_PROMOTION_ID, int DISTRIBUTOR_ID, int SALE_ORDER_ID, int SCHEME_ID, long PROMOTION_ID, long BASKET_ID, long BASKET_DETAIL_ID, long PROMOTION_OFFER_ID, int SKU_ID, int QUANTITY, double UNIT_PRICE, double AMOUNT, double GST_RATE, double GST_AMOUNT, double TST_AMOUNT, double SED_AMOUNT, int master_Sku_Id, double EXTRA_TAX, int QUANTITY_TO, int QUANTITY_AD) {
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