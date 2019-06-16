package com.fastservices.sams.data.dao;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\'J\b\u0010\b\u001a\u00020\u0005H\'J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\'J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0016\u0010\r\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/fastservices/sams/data/dao/NoOrderDao;", "", "countAll", "", "delete", "", "item", "Lcom/fastservices/sams/data/entities/NoOrderItem;", "deleteAll", "getAll", "", "getAllOutletIDs", "insert", "insertAll", "list", "app_debug"})
public abstract interface NoOrderDao {
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fastservices.sams.data.entities.NoOrderItem> list);
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.data.entities.NoOrderItem item);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM NoOrderItem")
    public abstract java.util.List<com.fastservices.sams.data.entities.NoOrderItem> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT OutletID FROM NoOrderItem")
    public abstract java.util.List<java.lang.Integer> getAllOutletIDs();
    
    @android.arch.persistence.room.Query(value = "DELETE FROM NoOrderItem")
    public abstract void deleteAll();
    
    @android.arch.persistence.room.Query(value = "SELECT COUNT(*) FROM NoOrderItem")
    public abstract int countAll();
    
    @android.arch.persistence.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.data.entities.NoOrderItem item);
}