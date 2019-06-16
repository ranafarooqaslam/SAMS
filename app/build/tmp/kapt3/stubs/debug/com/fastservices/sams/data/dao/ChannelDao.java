package com.fastservices.sams.data.dao;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0003H\'J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\'J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\'J\u0016\u0010\u000e\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\'J\u0016\u0010\u0010\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\'\u00a8\u0006\u0011"}, d2 = {"Lcom/fastservices/sams/data/dao/ChannelDao;", "", "deleteAllChannel", "", "deleteAllSubChannel", "getAllChannel", "", "Lcom/fastservices/sams/data/entities/Channel;", "getAllSubChannel", "Lcom/fastservices/sams/data/entities/SubChannel;", "getSubChannelName", "", "id", "", "insertAllChannel", "list", "insertAllSubChannel", "app_debug"})
public abstract interface ChannelDao {
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insertAllChannel(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fastservices.sams.data.entities.Channel> list);
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insertAllSubChannel(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fastservices.sams.data.entities.SubChannel> list);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM CHANNEL")
    public abstract java.util.List<com.fastservices.sams.data.entities.Channel> getAllChannel();
    
    @android.arch.persistence.room.Query(value = "DELETE FROM CHANNEL")
    public abstract void deleteAllChannel();
    
    @android.arch.persistence.room.Query(value = "DELETE FROM SUBCHANNEL")
    public abstract void deleteAllSubChannel();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM SUBCHANNEL")
    public abstract java.util.List<com.fastservices.sams.data.entities.SubChannel> getAllSubChannel();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT name FROM SUBCHANNEL WHERE id = :id LIMIT 1")
    public abstract java.lang.String getSubChannelName(int id);
}