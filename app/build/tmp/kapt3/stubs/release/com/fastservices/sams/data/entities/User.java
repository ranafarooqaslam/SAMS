package com.fastservices.sams.data.entities;

import java.lang.System;

@android.arch.persistence.room.Entity(tableName = "USER")
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\bH\u00c6\u0003J\t\u0010&\u001a\u00020\bH\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\bH\u00c6\u0003J[\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010-\u001a\u00020\u0003H\u00d6\u0001J\t\u0010.\u001a\u00020\bH\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010\u00a8\u0006/"}, d2 = {"Lcom/fastservices/sams/data/entities/User;", "", "USER_ID", "", "COMPANY_ID", "DISTRIBUTOR_ID", "ROLE_ID", "LOGIN_ID", "", "PASSWORD", "IS_ACTIVE", "LASTUPDATE_DATE", "(IIIILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getCOMPANY_ID", "()I", "setCOMPANY_ID", "(I)V", "getDISTRIBUTOR_ID", "setDISTRIBUTOR_ID", "getIS_ACTIVE", "setIS_ACTIVE", "getLASTUPDATE_DATE", "()Ljava/lang/String;", "setLASTUPDATE_DATE", "(Ljava/lang/String;)V", "getLOGIN_ID", "setLOGIN_ID", "getPASSWORD", "setPASSWORD", "getROLE_ID", "setROLE_ID", "getUSER_ID", "setUSER_ID", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_release"})
public final class User {
    @android.arch.persistence.room.PrimaryKey()
    private int USER_ID;
    private int COMPANY_ID;
    private int DISTRIBUTOR_ID;
    private int ROLE_ID;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String LOGIN_ID;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String PASSWORD;
    private int IS_ACTIVE;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String LASTUPDATE_DATE;
    
    public final int getUSER_ID() {
        return 0;
    }
    
    public final void setUSER_ID(int p0) {
    }
    
    public final int getCOMPANY_ID() {
        return 0;
    }
    
    public final void setCOMPANY_ID(int p0) {
    }
    
    public final int getDISTRIBUTOR_ID() {
        return 0;
    }
    
    public final void setDISTRIBUTOR_ID(int p0) {
    }
    
    public final int getROLE_ID() {
        return 0;
    }
    
    public final void setROLE_ID(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLOGIN_ID() {
        return null;
    }
    
    public final void setLOGIN_ID(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPASSWORD() {
        return null;
    }
    
    public final void setPASSWORD(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getIS_ACTIVE() {
        return 0;
    }
    
    public final void setIS_ACTIVE(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLASTUPDATE_DATE() {
        return null;
    }
    
    public final void setLASTUPDATE_DATE(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public User(int USER_ID, int COMPANY_ID, int DISTRIBUTOR_ID, int ROLE_ID, @org.jetbrains.annotations.NotNull()
    java.lang.String LOGIN_ID, @org.jetbrains.annotations.NotNull()
    java.lang.String PASSWORD, int IS_ACTIVE, @org.jetbrains.annotations.Nullable()
    java.lang.String LASTUPDATE_DATE) {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fastservices.sams.data.entities.User copy(int USER_ID, int COMPANY_ID, int DISTRIBUTOR_ID, int ROLE_ID, @org.jetbrains.annotations.NotNull()
    java.lang.String LOGIN_ID, @org.jetbrains.annotations.NotNull()
    java.lang.String PASSWORD, int IS_ACTIVE, @org.jetbrains.annotations.Nullable()
    java.lang.String LASTUPDATE_DATE) {
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