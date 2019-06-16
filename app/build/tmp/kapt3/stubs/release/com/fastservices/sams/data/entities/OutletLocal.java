package com.fastservices.sams.data.entities;

import java.lang.System;

@android.arch.persistence.room.Entity(tableName = "OutletLocal")
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\bJ\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u009d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0019J\b\u0010F\u001a\u0004\u0018\u00010\u0006J\t\u0010G\u001a\u00020\u0004H\u00c6\u0003J\t\u0010H\u001a\u00020\u0004H\u00c6\u0003J\t\u0010I\u001a\u00020\u0006H\u00c6\u0003J\t\u0010J\u001a\u00020\u0011H\u00c6\u0003J\t\u0010K\u001a\u00020\u0011H\u00c6\u0003J\t\u0010L\u001a\u00020\u0006H\u00c6\u0003J\t\u0010M\u001a\u00020\u0006H\u00c6\u0003J\t\u0010N\u001a\u00020\u0006H\u00c6\u0003J\t\u0010O\u001a\u00020\u0006H\u00c6\u0003J\t\u0010P\u001a\u00020\u0006H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0004H\u00c6\u0003J\t\u0010R\u001a\u00020\u0006H\u00c6\u0003J\t\u0010S\u001a\u00020\u0006H\u00c6\u0003J\t\u0010T\u001a\u00020\u0006H\u00c6\u0003J\t\u0010U\u001a\u00020\u0006H\u00c6\u0003J\t\u0010V\u001a\u00020\u0006H\u00c6\u0003J\t\u0010W\u001a\u00020\u0004H\u00c6\u0003J\t\u0010X\u001a\u00020\u0004H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0004H\u00c6\u0003J\u00c7\u0001\u0010Z\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010[\u001a\u00020\\2\b\u0010]\u001a\u0004\u0018\u00010^H\u00d6\u0003J\t\u0010_\u001a\u00020\u0004H\u00d6\u0001J\b\u0010`\u001a\u00020\u0006H\u0016R\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001a\u0010\u000f\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\n\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001a\u0010\u0012\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\'\"\u0004\b+\u0010)R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010!\"\u0004\b-\u0010#R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010!\"\u0004\b1\u0010#R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010!\"\u0004\b3\u0010#R\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010!\"\u0004\b5\u0010#R\u001a\u0010\u0013\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010!\"\u0004\b7\u0010#R\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010!\"\u0004\b9\u0010#R\u001a\u0010\u0015\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010!\"\u0004\b;\u0010#R\u001a\u0010\u0016\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010!\"\u0004\b=\u0010#R\u001a\u0010\u0017\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010!\"\u0004\b?\u0010#R\u001a\u0010\u000b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001b\"\u0004\bA\u0010\u001dR\u001a\u0010\u000e\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u001b\"\u0004\bC\u0010\u001dR\u001a\u0010\r\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u001b\"\u0004\bE\u0010\u001d\u00a8\u0006a"}, d2 = {"Lcom/fastservices/sams/data/entities/OutletLocal;", "Ljava/io/Serializable;", "()V", "OutletID", "", "OutletName", "", "OwnerName", "PhoneNumber", "OutletAddress", "LandMark", "SectionID", "ChannelID", "TownID", "SubChannelID", "Comments", "Latitude", "", "Longtidue", "PhotoPath1", "PhotoPath2", "PhotoPath3", "PhotoPath4", "PhotoPath5", "AreaTypeId", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;DDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getAreaTypeId", "()I", "setAreaTypeId", "(I)V", "getChannelID", "setChannelID", "getComments", "()Ljava/lang/String;", "setComments", "(Ljava/lang/String;)V", "getLandMark", "setLandMark", "getLatitude", "()D", "setLatitude", "(D)V", "getLongtidue", "setLongtidue", "getOutletAddress", "setOutletAddress", "getOutletID", "setOutletID", "getOutletName", "setOutletName", "getOwnerName", "setOwnerName", "getPhoneNumber", "setPhoneNumber", "getPhotoPath1", "setPhotoPath1", "getPhotoPath2", "setPhotoPath2", "getPhotoPath3", "setPhotoPath3", "getPhotoPath4", "setPhotoPath4", "getPhotoPath5", "setPhotoPath5", "getSectionID", "setSectionID", "getSubChannelID", "setSubChannelID", "getTownID", "setTownID", "checkValidity", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"})
public final class OutletLocal implements java.io.Serializable {
    @android.arch.persistence.room.PrimaryKey(autoGenerate = true)
    private int OutletID;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String OutletName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String OwnerName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String PhoneNumber;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String OutletAddress;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String LandMark;
    private int SectionID;
    private int ChannelID;
    private int TownID;
    private int SubChannelID;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String Comments;
    private double Latitude;
    private double Longtidue;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String PhotoPath1;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String PhotoPath2;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String PhotoPath3;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String PhotoPath4;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String PhotoPath5;
    private int AreaTypeId;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String checkValidity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
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
    public final java.lang.String getOutletAddress() {
        return null;
    }
    
    public final void setOutletAddress(@org.jetbrains.annotations.NotNull()
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
    
    public OutletLocal(int OutletID, @org.jetbrains.annotations.NotNull()
    java.lang.String OutletName, @org.jetbrains.annotations.NotNull()
    java.lang.String OwnerName, @org.jetbrains.annotations.NotNull()
    java.lang.String PhoneNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String OutletAddress, @org.jetbrains.annotations.NotNull()
    java.lang.String LandMark, int SectionID, int ChannelID, int TownID, int SubChannelID, @org.jetbrains.annotations.NotNull()
    java.lang.String Comments, double Latitude, double Longtidue, @org.jetbrains.annotations.NotNull()
    java.lang.String PhotoPath1, @org.jetbrains.annotations.NotNull()
    java.lang.String PhotoPath2, @org.jetbrains.annotations.NotNull()
    java.lang.String PhotoPath3, @org.jetbrains.annotations.NotNull()
    java.lang.String PhotoPath4, @org.jetbrains.annotations.NotNull()
    java.lang.String PhotoPath5, int AreaTypeId) {
        super();
    }
    
    public OutletLocal() {
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
    
    public final int component7() {
        return 0;
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    public final double component12() {
        return 0.0;
    }
    
    public final double component13() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    public final int component19() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fastservices.sams.data.entities.OutletLocal copy(int OutletID, @org.jetbrains.annotations.NotNull()
    java.lang.String OutletName, @org.jetbrains.annotations.NotNull()
    java.lang.String OwnerName, @org.jetbrains.annotations.NotNull()
    java.lang.String PhoneNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String OutletAddress, @org.jetbrains.annotations.NotNull()
    java.lang.String LandMark, int SectionID, int ChannelID, int TownID, int SubChannelID, @org.jetbrains.annotations.NotNull()
    java.lang.String Comments, double Latitude, double Longtidue, @org.jetbrains.annotations.NotNull()
    java.lang.String PhotoPath1, @org.jetbrains.annotations.NotNull()
    java.lang.String PhotoPath2, @org.jetbrains.annotations.NotNull()
    java.lang.String PhotoPath3, @org.jetbrains.annotations.NotNull()
    java.lang.String PhotoPath4, @org.jetbrains.annotations.NotNull()
    java.lang.String PhotoPath5, int AreaTypeId) {
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