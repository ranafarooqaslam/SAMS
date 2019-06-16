package com.fastservices.sams.data.dao;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\'J\b\u0010\u000f\u001a\u00020\u0010H\'J\b\u0010\u0011\u001a\u00020\u0012H\'J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0005H\'\u00a8\u0006\u0014"}, d2 = {"Lcom/fastservices/sams/data/dao/OrderMasterDao;", "", "delete", "", "it", "Lcom/fastservices/sams/data/entities/OrderMaster;", "deleteAll", "getAll", "", "getAllNonSync", "getOutletwiseSummary", "Lcom/fastservices/sams/data/models/OutletWiseSummaryModel;", "insert", "", "orderMaster", "outletsHaveOrder", "", "totalNetAmount", "", "update", "app_release"})
public abstract interface OrderMasterDao {
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract long insert(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.data.entities.OrderMaster orderMaster);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM ORDER_MASTER WHERE IS_SYNCED = 0")
    public abstract java.util.List<com.fastservices.sams.data.entities.OrderMaster> getAllNonSync();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM ORDER_MASTER")
    public abstract java.util.List<com.fastservices.sams.data.entities.OrderMaster> getAll();
    
    @android.arch.persistence.room.Query(value = "DELETE FROM ORDER_MASTER")
    public abstract void deleteAll();
    
    @android.arch.persistence.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.data.entities.OrderMaster orderMaster);
    
    @android.arch.persistence.room.Query(value = "SELECT COUNT(*) FROM ORDER_MASTER")
    public abstract int outletsHaveOrder();
    
    @android.arch.persistence.room.Query(value = "SELECT SUM(TOTAL_NET_AMOUNT) FROM ORDER_MASTER")
    public abstract double totalNetAmount();
    
    @android.arch.persistence.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.data.entities.OrderMaster it);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT OM.SOLD_TO AS OUTLET_CODE, O.outletName AS OUTLET_NAME, OM.TOTAL_NET_AMOUNT AS NET_AMOUNT FROM ORDER_MASTER OM INNER JOIN OUTLET O ON OM.SOLD_TO = O.outletID")
    public abstract java.util.List<com.fastservices.sams.data.models.OutletWiseSummaryModel> getOutletwiseSummary();
}