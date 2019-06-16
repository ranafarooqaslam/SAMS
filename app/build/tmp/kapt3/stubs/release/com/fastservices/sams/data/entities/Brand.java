package com.fastservices.sams.data.entities;

import java.lang.System;

@android.arch.persistence.room.Entity(tableName = "BRAND")
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0006H\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001b"}, d2 = {"Lcom/fastservices/sams/data/entities/Brand;", "", "SKU_HIE_ID", "", "PARENT_SKU_HIE_ID", "SKU_HIE_NAME", "", "(IILjava/lang/String;)V", "getPARENT_SKU_HIE_ID", "()I", "setPARENT_SKU_HIE_ID", "(I)V", "getSKU_HIE_ID", "setSKU_HIE_ID", "getSKU_HIE_NAME", "()Ljava/lang/String;", "setSKU_HIE_NAME", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_release"})
public final class Brand {
    @android.arch.persistence.room.PrimaryKey()
    private int SKU_HIE_ID;
    private int PARENT_SKU_HIE_ID;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String SKU_HIE_NAME;
    
    public final int getSKU_HIE_ID() {
        return 0;
    }
    
    public final void setSKU_HIE_ID(int p0) {
    }
    
    public final int getPARENT_SKU_HIE_ID() {
        return 0;
    }
    
    public final void setPARENT_SKU_HIE_ID(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSKU_HIE_NAME() {
        return null;
    }
    
    public final void setSKU_HIE_NAME(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public Brand(int SKU_HIE_ID, int PARENT_SKU_HIE_ID, @org.jetbrains.annotations.NotNull()
    java.lang.String SKU_HIE_NAME) {
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
    public final com.fastservices.sams.data.entities.Brand copy(int SKU_HIE_ID, int PARENT_SKU_HIE_ID, @org.jetbrains.annotations.NotNull()
    java.lang.String SKU_HIE_NAME) {
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