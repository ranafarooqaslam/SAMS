package com.fastservices.sams.data.dao;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\'J\u0016\u0010\t\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\'J\u0016\u0010\u000b\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\'\u00a8\u0006\f"}, d2 = {"Lcom/fastservices/sams/data/dao/OutletDao;", "", "countAll", "", "deleteAll", "", "getAll", "", "Lcom/fastservices/sams/data/entities/Outlet;", "insert", "outlet", "update", "app_release"})
public abstract interface OutletDao {
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fastservices.sams.data.entities.Outlet> outlet);
    
    @android.arch.persistence.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fastservices.sams.data.entities.Outlet> outlet);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM OUTLET ORDER BY outletName")
    public abstract java.util.List<com.fastservices.sams.data.entities.Outlet> getAll();
    
    @android.arch.persistence.room.Query(value = "DELETE  FROM OUTLET")
    public abstract void deleteAll();
    
    @android.arch.persistence.room.Query(value = "SELECT COUNT(*) FROM OUTLET")
    public abstract int countAll();
}