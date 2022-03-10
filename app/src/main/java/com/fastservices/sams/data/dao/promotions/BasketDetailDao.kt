package com.fastservices.sams.data.dao.promotions

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.fastservices.sams.data.entities.promotions.dtBasketDetail


@Dao
interface BasketDetailDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(list:List<dtBasketDetail>)

    @Query("SELECT * FROM dtBasketDetail WHERE BASKET_ID = :basket_id")
    fun getAll(basket_id: Long): List<dtBasketDetail>

    @Query("DELETE FROM dtBasketDetail")
    fun deleteAll()
}