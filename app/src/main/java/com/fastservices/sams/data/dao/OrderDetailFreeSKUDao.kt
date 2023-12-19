package com.fastservices.sams.data.dao

import androidx.room.*
import com.fastservices.sams.data.entities.OrderDetailFreeSKU

@Dao
interface OrderDetailFreeSKUDao {



    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(orderDetailFreeSKU: OrderDetailFreeSKU)


    @Query("SELECT * FROM SALE_ORDER_PROMOTION WHERE SALE_ORDER_ID = :orderMasterId")
    fun getAllFreeSKUByMasterId(orderMasterId:Int): List<OrderDetailFreeSKU>

    @Query("SELECT * FROM SALE_ORDER_PROMOTION")
    fun getAll(): List<OrderDetailFreeSKU>

    @Query("DELETE FROM SALE_ORDER_PROMOTION")
    fun deleteAll()

    @Delete
    fun delete(orderDetailsFreeSkU: List<OrderDetailFreeSKU>)

}