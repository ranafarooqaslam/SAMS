package com.fastservices.sams.data.dao

import android.arch.persistence.room.*
import com.fastservices.sams.data.entities.NoOrderItem

@Dao
interface NoOrderDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(list: List<NoOrderItem>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(item: NoOrderItem)

    @Query("SELECT * FROM NoOrderItem")
    fun getAll(): List<NoOrderItem>

    @Query("SELECT OutletID FROM NoOrderItem")
    fun getAllOutletIDs(): List<Int>

    @Query("DELETE FROM NoOrderItem")
    fun deleteAll()

    @Query("SELECT COUNT(*) FROM NoOrderItem")
    fun countAll(): Int

    @Delete
    fun delete(item: NoOrderItem)
}