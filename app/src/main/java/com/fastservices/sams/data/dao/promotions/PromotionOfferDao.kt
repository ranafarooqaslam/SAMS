package com.fastservices.sams.data.dao.promotions

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.fastservices.sams.data.entities.promotions.dtPromotionOffer

@Dao
interface PromotionOfferDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(promotionoffers: List<dtPromotionOffer>)

    @Query("SELECT * FROM dtPromotionOffer WHERE BASKET_DETAIL_ID = :backet_detail_id")
    fun getAll(backet_detail_id:Long): List<dtPromotionOffer>

    @Query("DELETE FROM dtPromotionOffer")
    fun deleteAll()
}