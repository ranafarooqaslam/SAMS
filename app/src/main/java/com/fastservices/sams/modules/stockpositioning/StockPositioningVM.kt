package com.fastservices.sams.modules.stockpositioning

import android.arch.lifecycle.MutableLiveData
import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.entities.Merchandise
import com.fastservices.sams.data.entities.Outlet
import com.fastservices.sams.data.entities.StockPosition
import com.fastservices.sams.data.entities.StockPositionMaster
import com.fastservices.sams.modules.base.BaseVM
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.lang.Exception

class StockPositioningVM : BaseVM() {

    var selectedOutlet: Outlet? = null



    val sku = arrayListOf<StockPosition>()

    var skusLoaded = MutableLiveData<Boolean>()
    var stockAdded = MutableLiveData<Boolean>()

    init {

    }

    fun outletSelected() {

        GlobalScope.launch {
            sku.clear()
            val skuList = SamsApplication.getDB().SKUDao().getAll()
            skuList.forEach {
                sku.add(StockPosition( it.SKU_ID.toString(), "",it.TRADE_PRICE,it.UNITS_IN_CASE, it.SKU_NAME,it.SKU_CODE,0))
            }

            val stockPositions = SamsApplication.getDB().stockPostioningDao().getAll(selectedOutlet?.outletID!!)
            for (i in 0 until stockPositions.size){
                sku.find { it.SKU_ID ==  stockPositions[i].SKU_ID}?.Quantity = stockPositions[i].Quantity
            }

            skusLoaded.postValue(true)
        }
    }

    fun addStockPositioning() {
        if (selectedOutlet != null) {
            showLoader.postValue(true)
            GlobalScope.launch {
                val master = StockPositionMaster(selectedOutlet!!.outletID,0)
                SamsApplication.getDB().stockPositioningMasterDao().insert(master)
                sku.forEach {
                    it.STOCK_MASTER_ID = selectedOutlet!!.outletID
                }

                SamsApplication.getDB().stockPostioningDao().insertAll(sku.filter { it.Quantity.isNotEmpty() })
                showLoader.postValue(false)
                stockAdded.postValue(true)


            }

        }
    }

}


data class SKUNameID(
        var SKU_NAME: String,
        var SKU_CODE: String,
        var SKU_ID: Int
) {
    override fun toString(): String {
        return SKU_NAME
    }
}