package com.fastservices.sams.data.dao;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\b\u0010\u0007\u001a\u00020\u0003H\'J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\nH\'J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'\u00a8\u0006\f"}, d2 = {"Lcom/fastservices/sams/data/dao/StockPositioningDao;", "", "delete", "", "stock", "", "Lcom/fastservices/sams/data/entities/StockPosition;", "deleteAll", "getAll", "stock_master_id", "", "insertAll", "app_release"})
public abstract interface StockPositioningDao {
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fastservices.sams.data.entities.StockPosition> stock);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM StockPosition WHERE STOCK_MASTER_ID = :stock_master_id")
    public abstract java.util.List<com.fastservices.sams.data.entities.StockPosition> getAll(int stock_master_id);
    
    @android.arch.persistence.room.Query(value = "DELETE FROM StockPosition")
    public abstract void deleteAll();
    
    @android.arch.persistence.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fastservices.sams.data.entities.StockPosition> stock);
}