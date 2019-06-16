package com.fastservices.sams.data.dao;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\b\u0010\u0007\u001a\u00020\u0003H\'J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\n\u001a\u00020\u000bH\'J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005H\'J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0006H\'J\b\u0010\u0010\u001a\u00020\u0011H\'\u00a8\u0006\u0012"}, d2 = {"Lcom/fastservices/sams/data/dao/OrderDetailDao;", "", "delete", "", "orderDetails", "", "Lcom/fastservices/sams/data/entities/OrderDetail;", "deleteAll", "getAll", "getAllOdersByMasterId", "orderMasterId", "", "getSKUwiseSummary", "Lcom/fastservices/sams/data/models/SKUWiseSummaryModel;", "insert", "orderDetail", "totalQuantity", "", "app_release"})
public abstract interface OrderDetailDao {
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.fastservices.sams.data.entities.OrderDetail orderDetail);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM ORDER_DETAIL WHERE SALE_ORDER_ID = :orderMasterId")
    public abstract java.util.List<com.fastservices.sams.data.entities.OrderDetail> getAllOdersByMasterId(int orderMasterId);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM ORDER_DETAIL")
    public abstract java.util.List<com.fastservices.sams.data.entities.OrderDetail> getAll();
    
    @android.arch.persistence.room.Query(value = "DELETE FROM ORDER_DETAIL")
    public abstract void deleteAll();
    
    @android.arch.persistence.room.Query(value = "SELECT SUM(QUANTITY_UNIT) FROM ORDER_DETAIL")
    public abstract long totalQuantity();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT S.SKU_NAME,SUM(OD.QUANTITY_UNIT) AS QUANTITY_UNIT ,SUM(OD.NET_AMOUNT) AS NET_AMOUNT FROM ORDER_DETAIL OD INNER JOIN SKU S ON S.SKU_ID = OD.SKU_ID GROUP BY OD.SKU_ID")
    public abstract java.util.List<com.fastservices.sams.data.models.SKUWiseSummaryModel> getSKUwiseSummary();
    
    @android.arch.persistence.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fastservices.sams.data.entities.OrderDetail> orderDetails);
}