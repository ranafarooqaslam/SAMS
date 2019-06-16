package com.fastservices.sams.data.entities;

import java.lang.System;

@android.arch.persistence.room.Entity(tableName = "Outlet")
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\bx\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u00fd\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0013\u0012\u0006\u0010\u001b\u001a\u00020\u0013\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u0007\u0012\u0006\u0010 \u001a\u00020\u0007\u0012\u0006\u0010!\u001a\u00020\u0004\u0012\u0006\u0010\"\u001a\u00020\u0007\u0012\u0006\u0010#\u001a\u00020\u0013\u0012\u0006\u0010$\u001a\u00020\u0007\u0012\u0006\u0010%\u001a\u00020\u0004\u00a2\u0006\u0002\u0010&J\t\u0010m\u001a\u00020\u0004H\u00c6\u0003J\t\u0010n\u001a\u00020\u0004H\u00c6\u0003J\t\u0010o\u001a\u00020\u0004H\u00c6\u0003J\t\u0010p\u001a\u00020\u0004H\u00c6\u0003J\t\u0010q\u001a\u00020\u0004H\u00c6\u0003J\t\u0010r\u001a\u00020\u0013H\u00c6\u0003J\t\u0010s\u001a\u00020\u0015H\u00c6\u0003J\t\u0010t\u001a\u00020\u0004H\u00c6\u0003J\t\u0010u\u001a\u00020\u0004H\u00c6\u0003J\t\u0010v\u001a\u00020\u0004H\u00c6\u0003J\t\u0010w\u001a\u00020\u0007H\u00c6\u0003J\t\u0010x\u001a\u00020\u0004H\u00c6\u0003J\t\u0010y\u001a\u00020\u0013H\u00c6\u0003J\t\u0010z\u001a\u00020\u0013H\u00c6\u0003J\t\u0010{\u001a\u00020\u0007H\u00c6\u0003J\t\u0010|\u001a\u00020\u0007H\u00c6\u0003J\t\u0010}\u001a\u00020\u0007H\u00c6\u0003J\t\u0010~\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u007f\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0004H\u00c6\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0013H\u00c6\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0004H\u00c6\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0004H\u00c6\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0004H\u00c6\u0003J\u00c0\u0002\u0010\u008c\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00132\b\b\u0002\u0010\u001b\u001a\u00020\u00132\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\u00132\b\b\u0002\u0010$\u001a\u00020\u00072\b\b\u0002\u0010%\u001a\u00020\u0004H\u00c6\u0001J\u0017\u0010\u008d\u0001\u001a\u00030\u008e\u00012\n\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u0090\u0001H\u00d6\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u0092\u0001\u001a\u00020\u0007H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010(\"\u0004\b,\u0010*R\u001a\u0010\r\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u0010\u0019\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001e\u0010%\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010(\"\u0004\b8\u0010*R\u001a\u0010\u0016\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010(\"\u0004\b:\u0010*R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001e\u0010$\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u00104\"\u0004\b@\u00106R\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u00104\"\u0004\bB\u00106R\u001a\u0010#\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u00100\"\u0004\bD\u00102R\u001a\u0010\"\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u00104\"\u0004\bF\u00106R\u001a\u0010\u001a\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u00100\"\u0004\bH\u00102R\u001a\u0010\u001b\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u00100\"\u0004\bJ\u00102R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010(\"\u0004\bL\u0010*R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u00104\"\u0004\bN\u00106R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u00104\"\u0004\bP\u00106R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u00104\"\u0004\bR\u00106R\u001a\u0010\u001c\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u00104\"\u0004\bT\u00106R\u001a\u0010\u001d\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u00104\"\u0004\bV\u00106R\u001a\u0010\u001e\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u00104\"\u0004\bX\u00106R\u001a\u0010\u001f\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u00104\"\u0004\bZ\u00106R\u001a\u0010 \u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u00104\"\u0004\b\\\u00106R\u001a\u0010\u0011\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010(\"\u0004\b^\u0010*R\u001e\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010(\"\u0004\b`\u0010*R\u001a\u0010\u000e\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010(\"\u0004\bb\u0010*R\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u0010(\"\u0004\bd\u0010*R\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010(\"\u0004\bf\u0010*R\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u00104\"\u0004\bh\u00106R\u001a\u0010\u0010\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bi\u0010(\"\u0004\bj\u0010*R\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bk\u0010(\"\u0004\bl\u0010*\u00a8\u0006\u0093\u0001"}, d2 = {"Lcom/fastservices/sams/data/entities/Outlet;", "Ljava/io/Serializable;", "()V", "_id", "", "outletID", "outletName", "", "ownerName", "phoneNumber", "storeAddress", "landMark", "sectionID", "channelID", "routeID", "townID", "subChannelID", "promotionClass", "closing", "", "creditLimit", "", "creditDays", "registered", "sequenceNo", "comments", "latitude", "longtidue", "photoPath1", "photoPath2", "photoPath3", "photoPath4", "photoPath5", "areaTypeId", "lastOrderDate", "lastOrderAmount", "label", "credit", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIDFIIILjava/lang/String;DDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;DLjava/lang/String;I)V", "get_id", "()I", "set_id", "(I)V", "getAreaTypeId", "setAreaTypeId", "getChannelID", "setChannelID", "getClosing", "()D", "setClosing", "(D)V", "getComments", "()Ljava/lang/String;", "setComments", "(Ljava/lang/String;)V", "getCredit", "setCredit", "getCreditDays", "setCreditDays", "getCreditLimit", "()F", "setCreditLimit", "(F)V", "getLabel", "setLabel", "getLandMark", "setLandMark", "getLastOrderAmount", "setLastOrderAmount", "getLastOrderDate", "setLastOrderDate", "getLatitude", "setLatitude", "getLongtidue", "setLongtidue", "getOutletID", "setOutletID", "getOutletName", "setOutletName", "getOwnerName", "setOwnerName", "getPhoneNumber", "setPhoneNumber", "getPhotoPath1", "setPhotoPath1", "getPhotoPath2", "setPhotoPath2", "getPhotoPath3", "setPhotoPath3", "getPhotoPath4", "setPhotoPath4", "getPhotoPath5", "setPhotoPath5", "getPromotionClass", "setPromotionClass", "getRegistered", "setRegistered", "getRouteID", "setRouteID", "getSectionID", "setSectionID", "getSequenceNo", "setSequenceNo", "getStoreAddress", "setStoreAddress", "getSubChannelID", "setSubChannelID", "getTownID", "setTownID", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
public final class Outlet implements java.io.Serializable {
    @android.arch.persistence.room.PrimaryKey(autoGenerate = true)
    private int _id;
    private int outletID;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String outletName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String ownerName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String phoneNumber;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String storeAddress;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String landMark;
    private int sectionID;
    private int channelID;
    private int routeID;
    private int townID;
    private int subChannelID;
    private int promotionClass;
    private double closing;
    private float creditLimit;
    private int creditDays;
    @android.arch.persistence.room.ColumnInfo(name = "isRegistered")
    @com.google.gson.annotations.SerializedName(value = "isRegistered")
    private int registered;
    private int sequenceNo;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String comments;
    private double latitude;
    private double longtidue;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String photoPath1;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String photoPath2;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String photoPath3;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String photoPath4;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String photoPath5;
    private int areaTypeId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String lastOrderDate;
    private double lastOrderAmount;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Ignore()
    private java.lang.String label;
    @android.arch.persistence.room.ColumnInfo(name = "isCredit")
    @com.google.gson.annotations.SerializedName(value = "isCredit")
    private int credit;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public final int get_id() {
        return 0;
    }
    
    public final void set_id(int p0) {
    }
    
    public final int getOutletID() {
        return 0;
    }
    
    public final void setOutletID(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOutletName() {
        return null;
    }
    
    public final void setOutletName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOwnerName() {
        return null;
    }
    
    public final void setOwnerName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhoneNumber() {
        return null;
    }
    
    public final void setPhoneNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStoreAddress() {
        return null;
    }
    
    public final void setStoreAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLandMark() {
        return null;
    }
    
    public final void setLandMark(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getSectionID() {
        return 0;
    }
    
    public final void setSectionID(int p0) {
    }
    
    public final int getChannelID() {
        return 0;
    }
    
    public final void setChannelID(int p0) {
    }
    
    public final int getRouteID() {
        return 0;
    }
    
    public final void setRouteID(int p0) {
    }
    
    public final int getTownID() {
        return 0;
    }
    
    public final void setTownID(int p0) {
    }
    
    public final int getSubChannelID() {
        return 0;
    }
    
    public final void setSubChannelID(int p0) {
    }
    
    public final int getPromotionClass() {
        return 0;
    }
    
    public final void setPromotionClass(int p0) {
    }
    
    public final double getClosing() {
        return 0.0;
    }
    
    public final void setClosing(double p0) {
    }
    
    public final float getCreditLimit() {
        return 0.0F;
    }
    
    public final void setCreditLimit(float p0) {
    }
    
    public final int getCreditDays() {
        return 0;
    }
    
    public final void setCreditDays(int p0) {
    }
    
    public final int getRegistered() {
        return 0;
    }
    
    public final void setRegistered(int p0) {
    }
    
    public final int getSequenceNo() {
        return 0;
    }
    
    public final void setSequenceNo(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getComments() {
        return null;
    }
    
    public final void setComments(@org.jetbrains.annotations.NotNull()
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
    public final java.lang.String getPhotoPath1() {
        return null;
    }
    
    public final void setPhotoPath1(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhotoPath2() {
        return null;
    }
    
    public final void setPhotoPath2(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhotoPath3() {
        return null;
    }
    
    public final void setPhotoPath3(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhotoPath4() {
        return null;
    }
    
    public final void setPhotoPath4(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhotoPath5() {
        return null;
    }
    
    public final void setPhotoPath5(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getAreaTypeId() {
        return 0;
    }
    
    public final void setAreaTypeId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastOrderDate() {
        return null;
    }
    
    public final void setLastOrderDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getLastOrderAmount() {
        return 0.0;
    }
    
    public final void setLastOrderAmount(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLabel() {
        return null;
    }
    
    public final void setLabel(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getCredit() {
        return 0;
    }
    
    public final void setCredit(int p0) {
    }
    
    public Outlet(int _id, int outletID, @org.jetbrains.annotations.NotNull()
    java.lang.String outletName, @org.jetbrains.annotations.NotNull()
    java.lang.String ownerName, @org.jetbrains.annotations.NotNull()
    java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String storeAddress, @org.jetbrains.annotations.NotNull()
    java.lang.String landMark, int sectionID, int channelID, int routeID, int townID, int subChannelID, int promotionClass, double closing, float creditLimit, int creditDays, int registered, int sequenceNo, @org.jetbrains.annotations.NotNull()
    java.lang.String comments, double latitude, double longtidue, @org.jetbrains.annotations.NotNull()
    java.lang.String photoPath1, @org.jetbrains.annotations.NotNull()
    java.lang.String photoPath2, @org.jetbrains.annotations.NotNull()
    java.lang.String photoPath3, @org.jetbrains.annotations.NotNull()
    java.lang.String photoPath4, @org.jetbrains.annotations.NotNull()
    java.lang.String photoPath5, int areaTypeId, @org.jetbrains.annotations.NotNull()
    java.lang.String lastOrderDate, double lastOrderAmount, @org.jetbrains.annotations.NotNull()
    java.lang.String label, int credit) {
        super();
    }
    
    public Outlet() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int component12() {
        return 0;
    }
    
    public final int component13() {
        return 0;
    }
    
    public final double component14() {
        return 0.0;
    }
    
    public final float component15() {
        return 0.0F;
    }
    
    public final int component16() {
        return 0;
    }
    
    public final int component17() {
        return 0;
    }
    
    public final int component18() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component19() {
        return null;
    }
    
    public final double component20() {
        return 0.0;
    }
    
    public final double component21() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component26() {
        return null;
    }
    
    public final int component27() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component28() {
        return null;
    }
    
    public final double component29() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component30() {
        return null;
    }
    
    public final int component31() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fastservices.sams.data.entities.Outlet copy(int _id, int outletID, @org.jetbrains.annotations.NotNull()
    java.lang.String outletName, @org.jetbrains.annotations.NotNull()
    java.lang.String ownerName, @org.jetbrains.annotations.NotNull()
    java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String storeAddress, @org.jetbrains.annotations.NotNull()
    java.lang.String landMark, int sectionID, int channelID, int routeID, int townID, int subChannelID, int promotionClass, double closing, float creditLimit, int creditDays, int registered, int sequenceNo, @org.jetbrains.annotations.NotNull()
    java.lang.String comments, double latitude, double longtidue, @org.jetbrains.annotations.NotNull()
    java.lang.String photoPath1, @org.jetbrains.annotations.NotNull()
    java.lang.String photoPath2, @org.jetbrains.annotations.NotNull()
    java.lang.String photoPath3, @org.jetbrains.annotations.NotNull()
    java.lang.String photoPath4, @org.jetbrains.annotations.NotNull()
    java.lang.String photoPath5, int areaTypeId, @org.jetbrains.annotations.NotNull()
    java.lang.String lastOrderDate, double lastOrderAmount, @org.jetbrains.annotations.NotNull()
    java.lang.String label, int credit) {
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