package com.fastservices.sams.data.dao;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\n\u001a\u00020\bH\'J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'\u00a8\u0006\r"}, d2 = {"Lcom/fastservices/sams/data/dao/SKUDao;", "", "deleteAll", "", "getAll", "", "Lcom/fastservices/sams/data/entities/SKU;", "skuId", "", "getAllForCategory", "catId", "insertAll", "sections", "app_release"})
public abstract interface SKUDao {
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fastservices.sams.data.entities.SKU> sections);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM SKU ORDER BY SKU_NAME")
    public abstract java.util.List<com.fastservices.sams.data.entities.SKU> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM SKU WHERE SKU_ID = :skuId")
    public abstract java.util.List<com.fastservices.sams.data.entities.SKU> getAll(int skuId);
    
    @android.arch.persistence.room.Query(value = "DELETE FROM SKU")
    public abstract void deleteAll();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM SKU WHERE CATEGORY_ID = :catId")
    public abstract java.util.List<com.fastservices.sams.data.entities.SKU> getAllForCategory(int catId);
}