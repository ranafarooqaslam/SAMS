package com.fastservices.sams.data.dao

import android.arch.persistence.room.*
import com.fastservices.sams.data.entities.StockPosition

@Dao
interface StockPositioningDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(stock: List<StockPosition>)


    @Query("SELECT * FROM StockPosition WHERE STOCK_MASTER_ID = :stock_master_id")
    fun getAll(stock_master_id: Int): List<StockPosition>

    @Query("DELETE FROM StockPosition")
    fun deleteAll()

    @Delete
    fun delete( stock:List<StockPosition>)



}