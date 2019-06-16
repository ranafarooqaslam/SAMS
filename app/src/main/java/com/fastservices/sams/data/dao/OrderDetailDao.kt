package com.fastservices.sams.data.dao

import android.arch.persistence.room.*
import com.fastservices.sams.data.entities.OrderDetail
import com.fastservices.sams.data.models.SKUWiseSummaryModel

@Dao
interface OrderDetailDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(orderDetail: OrderDetail)


    @Query("SELECT * FROM ORDER_DETAIL WHERE SALE_ORDER_ID = :orderMasterId")
    fun getAllOdersByMasterId(orderMasterId: Int): List<OrderDetail>

    @Query("SELECT * FROM ORDER_DETAIL")
    fun getAll(): List<OrderDetail>

    @Query("DELETE FROM ORDER_DETAIL")
    fun deleteAll()

    @Query("SELECT SUM(QUANTITY_UNIT) FROM ORDER_DETAIL")
    fun totalQuantity(): Long


    @Query("SELECT S.SKU_NAME,SUM(OD.QUANTITY_UNIT) AS QUANTITY_UNIT ,SUM(OD.NET_AMOUNT) AS NET_AMOUNT FROM ORDER_DETAIL OD INNER JOIN SKU S ON S.SKU_ID = OD.SKU_ID GROUP BY OD.SKU_ID")
    fun getSKUwiseSummary():List<SKUWiseSummaryModel>

    @Delete
    fun delete(orderDetails: List<OrderDetail>)

}