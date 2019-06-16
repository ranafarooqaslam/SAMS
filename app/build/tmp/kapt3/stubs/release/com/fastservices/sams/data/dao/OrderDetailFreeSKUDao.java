package com.fastservices.sams.data.dao;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\b\u0010\u0007\u001a\u00020\u0003H\'J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\n\u001a\u00020\u000bH\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0006H\'\u00a8\u0006\u000e"}, d2 = {"Lcom/fastservices/sams/data/dao/OrderDetailFreeSKUDao;", "", "delete", "", "orderDetailsFreeSkU", "", "Lcom/fastservices/sams/data/entities/OrderDetailFreeSKU;", "deleteAll", "getAll", "getAllFreeSKUByMasterId", "orderMasterId", "", "insert", "orderDetailFreeSKU", "app_release"})
public abstract interface OrderDetailFreeSKUDao {
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.data.entities.OrderDetailFreeSKU orderDetailFreeSKU);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM SALE_ORDER_PROMOTION WHERE SALE_ORDER_ID = :orderMasterId")
    public abstract java.util.List<com.fastservices.sams.data.entities.OrderDetailFreeSKU> getAllFreeSKUByMasterId(int orderMasterId);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM SALE_ORDER_PROMOTION")
    public abstract java.util.List<com.fastservices.sams.data.entities.OrderDetailFreeSKU> getAll();
    
    @android.arch.persistence.room.Query(value = "DELETE FROM SALE_ORDER_PROMOTION")
    public abstract void deleteAll();
    
    @android.arch.persistence.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fastservices.sams.data.entities.OrderDetailFreeSKU> orderDetailsFreeSkU);
}