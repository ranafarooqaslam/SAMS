package com.fastservices.sams.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.fastservices.sams.data.entities.OrderMaster
import com.fastservices.sams.data.models.OutletWiseSummaryModel
import com.fastservices.sams.modules.outletwise.OutletWiseSummary

@Dao
interface OrderMasterDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(orderMaster: OrderMaster): Long


    @Query("SELECT * FROM ORDER_MASTER WHERE IS_SYNCED = 0")
    fun getAllNonSync(): List<OrderMaster>

    @Query("SELECT * FROM ORDER_MASTER")
    fun getAll(): List<OrderMaster>

    @Query("DELETE FROM ORDER_MASTER")
    fun deleteAll()

    @Update
    fun update(orderMaster: OrderMaster)

    @Query("SELECT COUNT(*) FROM ORDER_MASTER")
    fun outletsHaveOrder() : Int

    @Query("SELECT SUM(TOTAL_NET_AMOUNT) FROM ORDER_MASTER")
    fun totalNetAmount(): Double

    @Delete
    fun delete(it: OrderMaster)


    @Query("SELECT OM.SOLD_TO AS OUTLET_CODE, O.outletName AS OUTLET_NAME, OM.TOTAL_NET_AMOUNT AS NET_AMOUNT, OM.TIME_IN AS ORDER_DATE FROM ORDER_MASTER OM INNER JOIN OUTLET O ON OM.SOLD_TO = O.outletID")
    fun getOutletwiseSummary(): List<OutletWiseSummaryModel>

}