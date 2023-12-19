package com.fastservices.sams.data.dao.promotions

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.fastservices.sams.data.entities.promotions.dtPromotionValueClass

@Dao
interface PromotionValueDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(promotionValues: List<dtPromotionValueClass>)

    @Query("SELECT * FROM dtPromotionValueClass WHERE PROMOTION_ID = :promotion_id")
    fun getAll(promotion_id:Long):List<dtPromotionValueClass>

    @Query("SELECT * FROM dtPromotionValueClass")
    fun getAll():List<dtPromotionValueClass>

    @Query("DELETE FROM dtPromotionValueClass")
    fun deleteAll()
}