package com.fastservices.sams.data.dao.promotions

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
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