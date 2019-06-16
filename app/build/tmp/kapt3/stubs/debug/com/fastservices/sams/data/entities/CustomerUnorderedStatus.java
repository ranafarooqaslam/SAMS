package com.fastservices.sams.data.entities;

import java.lang.System;

@android.arch.persistence.room.Entity(tableName = "CUSTOMER_UNORDERED_STATUS")
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J0\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0006H\u00d6\u0001R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001f"}, d2 = {"Lcom/fastservices/sams/data/entities/CustomerUnorderedStatus;", "", "id", "", "CUSTOMER_UNORDERED_STATUS_ID", "STATUS", "", "(ILjava/lang/Integer;Ljava/lang/String;)V", "getCUSTOMER_UNORDERED_STATUS_ID", "()Ljava/lang/Integer;", "setCUSTOMER_UNORDERED_STATUS_ID", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getSTATUS", "()Ljava/lang/String;", "setSTATUS", "(Ljava/lang/String;)V", "getId", "()I", "setId", "(I)V", "component1", "component2", "component3", "copy", "(ILjava/lang/Integer;Ljava/lang/String;)Lcom/fastservices/sams/data/entities/CustomerUnorderedStatus;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class CustomerUnorderedStatus {
    @android.arch.persistence.room.PrimaryKey(autoGenerate = true)
    private int id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer CUSTOMER_UNORDERED_STATUS_ID;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String STATUS;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCUSTOMER_UNORDERED_STATUS_ID() {
        return null;
    }
    
    public final void setCUSTOMER_UNORDERED_STATUS_ID(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSTATUS() {
        return null;
    }
    
    public final void setSTATUS(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public CustomerUnorderedStatus(int id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer CUSTOMER_UNORDERED_STATUS_ID, @org.jetbrains.annotations.Nullable()
    java.lang.String STATUS) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fastservices.sams.data.entities.CustomerUnorderedStatus copy(int id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer CUSTOMER_UNORDERED_STATUS_ID, @org.jetbrains.annotations.Nullable()
    java.lang.String STATUS) {
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