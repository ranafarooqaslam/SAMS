package com.fastservices.sams.data.dao.promotions

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
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