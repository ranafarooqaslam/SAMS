package com.fastservices.sams.data.dao.promotions

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.fastservices.sams.data.entities.promotions.dtBasketDetail
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