package com.fastservices.sams.data.dao.promotions

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.fastservices.sams.data.entities.promotions.dtPromotion

@Dao
interface PromotionDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(list: List<dtPromotion>)

    @Query("SELECT * FROM dtPromotion")
    fun getAll(): List<dtPromotion>

    @Query("DELETE FROM dtPromotion")
    fun deleteAll()
}