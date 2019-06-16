package com.fastservices.sams.data.entities;

import java.lang.System;

@android.arch.persistence.room.Entity(tableName = "CUSTOMER_ORDER_STATUS")
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0007H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0007H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003JY\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010-\u001a\u00020\u0003H\u00d6\u0001J\t\u0010.\u001a\u00020/H\u00d6\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010\u00a8\u00060"}, d2 = {"Lcom/fastservices/sams/data/entities/CustomerOrderStatus;", "", "id", "", "CUSTOMER_ID", "AREA_ID", "DOCUMENT_DATE", "Ljava/util/Date;", "STATUS_ID", "TIME_IN", "TIME_OUT", "IS_SYNCED", "(IIILjava/util/Date;ILjava/util/Date;Ljava/util/Date;I)V", "getAREA_ID", "()I", "setAREA_ID", "(I)V", "getCUSTOMER_ID", "setCUSTOMER_ID", "getDOCUMENT_DATE", "()Ljava/util/Date;", "setDOCUMENT_DATE", "(Ljava/util/Date;)V", "getIS_SYNCED", "setIS_SYNCED", "getSTATUS_ID", "setSTATUS_ID", "getTIME_IN", "setTIME_IN", "getTIME_OUT", "setTIME_OUT", "getId", "setId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"})
public final class CustomerOrderStatus {
    @android.arch.persistence.room.PrimaryKey(autoGenerate = true)
    private int id;
    private int CUSTOMER_ID;
    private int AREA_ID;
    @org.jetbrains.annotations.NotNull()
    private java.util.Date DOCUMENT_DATE;
    private int STATUS_ID;
    @org.jetbrains.annotations.NotNull()
    private java.util.Date TIME_IN;
    @org.jetbrains.annotations.NotNull()
    private java.util.Date TIME_OUT;
    private int IS_SYNCED;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    public final int getCUSTOMER_ID() {
        return 0;
    }
    
    public final void setCUSTOMER_ID(int p0) {
    }
    
    public final int getAREA_ID() {
        return 0;
    }
    
    public final void setAREA_ID(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getDOCUMENT_DATE() {
        return null;
    }
    
    public final void setDOCUMENT_DATE(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    public final int getSTATUS_ID() {
        return 0;
    }
    
    public final void setSTATUS_ID(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getTIME_IN() {
        return null;
    }
    
    public final void setTIME_IN(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getTIME_OUT() {
        return null;
    }
    
    public final void setTIME_OUT(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    public final int getIS_SYNCED() {
        return 0;
    }
    
    public final void setIS_SYNCED(int p0) {
    }
    
    public CustomerOrderStatus(int id, int CUSTOMER_ID, int AREA_ID, @org.jetbrains.annotations.NotNull()
    java.util.Date DOCUMENT_DATE, int STATUS_ID, @org.jetbrains.annotations.NotNull()
    java.util.Date TIME_IN, @org.jetbrains.annotations.NotNull()
    java.util.Date TIME_OUT, int IS_SYNCED) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component4() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component7() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fastservices.sams.data.entities.CustomerOrderStatus copy(int id, int CUSTOMER_ID, int AREA_ID, @org.jetbrains.annotations.NotNull()
    java.util.Date DOCUMENT_DATE, int STATUS_ID, @org.jetbrains.annotations.NotNull()
    java.util.Date TIME_IN, @org.jetbrains.annotations.NotNull()
    java.util.Date TIME_OUT, int IS_SYNCED) {
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