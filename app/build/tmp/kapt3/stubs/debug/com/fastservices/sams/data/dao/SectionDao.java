package com.fastservices.sams.data.dao;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0003H\'J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\'J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\'J\u0016\u0010\u000e\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\'J\u0016\u0010\u0010\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\'\u00a8\u0006\u0012"}, d2 = {"Lcom/fastservices/sams/data/dao/SectionDao;", "", "deleteAll", "", "deleteAllLocality", "getAll", "", "Lcom/fastservices/sams/data/entities/Section;", "getAllLocality", "Lcom/fastservices/sams/data/entities/Locality;", "getLocalityName", "", "id", "", "insertAll", "sections", "insertAllLocality", "list", "app_debug"})
public abstract interface SectionDao {
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fastservices.sams.data.entities.Section> sections);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM SECTIONS")
    public abstract java.util.List<com.fastservices.sams.data.entities.Section> getAll();
    
    @android.arch.persistence.room.Query(value = "DELETE FROM SECTIONS")
    public abstract void deleteAll();
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insertAllLocality(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fastservices.sams.data.entities.Locality> list);
    
    @android.arch.persistence.room.Query(value = "DELETE FROM LOCALITY")
    public abstract void deleteAllLocality();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM LOCALITY")
    public abstract java.util.List<com.fastservices.sams.data.entities.Locality> getAllLocality();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT routeName FROM LOCALITY WHERE routeID = :id LIMIT 1")
    public abstract java.lang.String getLocalityName(int id);
}