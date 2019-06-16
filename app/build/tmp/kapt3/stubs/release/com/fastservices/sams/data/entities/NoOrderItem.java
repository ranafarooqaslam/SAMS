package com.fastservices.sams.data.entities;

import java.lang.System;

@android.arch.persistence.room.Entity()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b9\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0013J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0005H\u00c6\u0003J\t\u00108\u001a\u00020\u0005H\u00c6\u0003J\t\u00109\u001a\u00020\u0005H\u00c6\u0003J\t\u0010:\u001a\u00020\u0005H\u00c6\u0003J\t\u0010;\u001a\u00020\u0005H\u00c6\u0003J\t\u0010<\u001a\u00020\u0005H\u00c6\u0003J\t\u0010=\u001a\u00020\u0005H\u00c6\u0003J\t\u0010>\u001a\u00020\u0005H\u00c6\u0003J\t\u0010?\u001a\u00020\u0005H\u00c6\u0003J\t\u0010@\u001a\u00020\u0005H\u00c6\u0003J\t\u0010A\u001a\u00020\u0005H\u00c6\u0003J\t\u0010B\u001a\u00020\fH\u00c6\u0003J\t\u0010C\u001a\u00020\fH\u00c6\u0003J\u0095\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010H\u001a\u00020\u0003H\u00d6\u0001J\t\u0010I\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\'\"\u0004\b+\u0010)R\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0015\"\u0004\b-\u0010\u0017R\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0015\"\u0004\b/\u0010\u0017R\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0015\"\u0004\b1\u0010\u0017R\u001a\u0010\u0011\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0015\"\u0004\b3\u0010\u0017R\u001a\u0010\u0012\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0015\"\u0004\b5\u0010\u0017\u00a8\u0006J"}, d2 = {"Lcom/fastservices/sams/data/entities/NoOrderItem;", "", "OutletID", "", "SectionID", "", "DocumentDate", "ReasonID", "TimeIn", "TimeOut", "Comments", "latitude", "", "longitude", "photoPath1", "photoPath2", "photoPath3", "photoPath4", "photoPath5", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getComments", "()Ljava/lang/String;", "setComments", "(Ljava/lang/String;)V", "getDocumentDate", "setDocumentDate", "getOutletID", "()I", "setOutletID", "(I)V", "getReasonID", "setReasonID", "getSectionID", "setSectionID", "getTimeIn", "setTimeIn", "getTimeOut", "setTimeOut", "getLatitude", "()D", "setLatitude", "(D)V", "getLongitude", "setLongitude", "getPhotoPath1", "setPhotoPath1", "getPhotoPath2", "setPhotoPath2", "getPhotoPath3", "setPhotoPath3", "getPhotoPath4", "setPhotoPath4", "getPhotoPath5", "setPhotoPath5", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"})
public final class NoOrderItem {
    @android.arch.persistence.room.PrimaryKey()
    private int OutletID;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String SectionID;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String DocumentDate;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String ReasonID;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String TimeIn;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String TimeOut;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String Comments;
    private double latitude;
    private double longitude;
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
    
    public final int getOutletID() {
        return 0;
    }
    
    public final void setOutletID(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSectionID() {
        return null;
    }
    
    public final void setSectionID(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDocumentDate() {
        return null;
    }
    
    public final void setDocumentDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReasonID() {
        return null;
    }
    
    public final void setReasonID(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeIn() {
        return null;
    }
    
    public final void setTimeIn(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeOut() {
        return null;
    }
    
    public final void setTimeOut(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
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
    
    public final double getLongitude() {
        return 0.0;
    }
    
    public final void setLongitude(double p0) {
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
    
    public NoOrderItem(int OutletID, @org.jetbrains.annotations.NotNull()
    java.lang.String SectionID, @org.jetbrains.annotations.NotNull()
    java.lang.String DocumentDate, @org.jetbrains.annotations.NotNull()
    java.lang.String ReasonID, @org.jetbrains.annotations.NotNull()
    java.lang.String TimeIn, @org.jetbrains.annotations.NotNull()
    java.lang.String TimeOut, @org.jetbrains.annotations.NotNull()
    java.lang.String Comments, double latitude, double longitude, @org.jetbrains.annotations.NotNull()
    java.lang.String photoPath1, @org.jetbrains.annotations.NotNull()
    java.lang.String photoPath2, @org.jetbrains.annotations.NotNull()
    java.lang.String photoPath3, @org.jetbrains.annotations.NotNull()
    java.lang.String photoPath4, @org.jetbrains.annotations.NotNull()
    java.lang.String photoPath5) {
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
    
    public final double component8() {
        return 0.0;
    }
    
    public final double component9() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fastservices.sams.data.entities.NoOrderItem copy(int OutletID, @org.jetbrains.annotations.NotNull()
    java.lang.String SectionID, @org.jetbrains.annotations.NotNull()
    java.lang.String DocumentDate, @org.jetbrains.annotations.NotNull()
    java.lang.String ReasonID, @org.jetbrains.annotations.NotNull()
    java.lang.String TimeIn, @org.jetbrains.annotations.NotNull()
    java.lang.String TimeOut, @org.jetbrains.annotations.NotNull()
    java.lang.String Comments, double latitude, double longitude, @org.jetbrains.annotations.NotNull()
    java.lang.String photoPath1, @org.jetbrains.annotations.NotNull()
    java.lang.String photoPath2, @org.jetbrains.annotations.NotNull()
    java.lang.String photoPath3, @org.jetbrains.annotations.NotNull()
    java.lang.String photoPath4, @org.jetbrains.annotations.NotNull()
    java.lang.String photoPath5) {
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