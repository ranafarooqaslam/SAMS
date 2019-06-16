package com.fastservices.sams.data.dao.promotions

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.fastservices.sams.data.entities.promotions.dtPromotionCustomerType

@Dao
interface PromotionCustomerDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(list: List<dtPromotionCustomerType>)

    @Query("SELECT * FROM dtPromotionCustomerType WHERE PROMOTION_ID = :promotion_id")
    fun getAll(promotion_id: Long): List<dtPromotionCustomerType>

    @Query("DELETE FROM dtPromotionCustomerType")
    fun deleteAll()
}