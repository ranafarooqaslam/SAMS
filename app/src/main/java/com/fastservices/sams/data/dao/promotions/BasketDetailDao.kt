package com.fastservices.sams.data.dao.promotions

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
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