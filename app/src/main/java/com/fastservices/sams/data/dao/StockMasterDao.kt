package com.fastservices.sams.data.dao

import android.arch.persistence.room.*
import com.fastservices.sams.data.entities.StockPositionMaster

@Dao
interface StockMasterDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(stockMaster: StockPositionMaster): Long


    @Query("SELECT * FROM StockPositionMaster WHERE IS_SYNCED = 0")
    fun getAllNonSync(): List<StockPositionMaster>

    @Query("SELECT * FROM StockPositionMaster")
    fun getAll(): List<StockPositionMaster>

//    @Query("DELETE FROM StockPositionMaster")
//    fun deleteAll()

    @Delete
    fun delete(stockMaster: StockPositionMaster)

}