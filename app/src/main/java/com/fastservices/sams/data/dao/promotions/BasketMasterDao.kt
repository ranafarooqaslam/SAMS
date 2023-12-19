package com.fastservices.sams.data.dao.promotions

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

import com.fastservices.sams.data.entities.promotions.dtBasketMaster

@Dao
interface BasketMasterDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(list:List<dtBasketMaster>)


    @Query("SELECT * FROM dtBasketMaster WHERE PROMOTION_ID = :promotion_id")
    fun getAll(promotion_id: Long): List<dtBasketMaster>

    @Query("DELETE FROM dtBasketMaster")
    fun deleteAll()
}