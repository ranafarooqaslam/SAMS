package com.fastservices.sams.data.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.fastservices.sams.data.entities.SKUGroup

@Dao
interface SKUGroupDao {

    @Query("SELECT * FROM SKUGroup WHERE skU_ID = :skuId AND skU_GROUP_ID = :skuGroupId")
    fun getAll(skuId:Int,skuGroupId:Int):List<SKUGroup>

    @Query("SELECT * FROM SKUGroup")
    fun getAll():List<SKUGroup>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(groups: List<SKUGroup>)

    @Query("DELETE FROM SKUGroup")
    fun deleteAll()
}