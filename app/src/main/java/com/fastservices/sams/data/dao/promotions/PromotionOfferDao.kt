package com.fastservices.sams.data.dao.promotions

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
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