package com.fastservices.sams.data.dao;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'\u00a8\u0006\t"}, d2 = {"Lcom/fastservices/sams/data/dao/OutletComplaintDao;", "", "deleteAll", "", "getAllComplaintReasons", "", "Lcom/fastservices/sams/data/entities/OutletComplaint;", "insert", "list", "app_debug"})
public abstract interface OutletComplaintDao {
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fastservices.sams.data.entities.OutletComplaint> list);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM OutletComplaint")
    public abstract java.util.List<com.fastservices.sams.data.entities.OutletComplaint> getAllComplaintReasons();
    
    @android.arch.persistence.room.Query(value = "Delete FROM OutletComplaint")
    public abstract void deleteAll();
}