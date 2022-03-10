package com.fastservices.sams.data.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.fastservices.sams.modules.stockpositioning.SKUNameID
import com.google.gson.annotations.SerializedName

@Entity(primaryKeys = arrayOf("SKU_ID","STOCK_MASTER_ID") )
data class StockPosition(
        @SerializedName("SKUID") var SKU_ID: String,
        @SerializedName("Quantity")  var Quantity: String,
        @SerializedName("Price")  var Price: Double,
        @SerializedName("Unit_In_Case")  var UnitInCase: Int,
        var SKU_NAME: String,
        var SKU_CODE: String,
        var STOCK_MASTER_ID:Int
) {
    constructor() : this("","",0.0,0,"","",0)
}