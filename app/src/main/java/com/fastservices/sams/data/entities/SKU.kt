package com.fastservices.sams.data.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.Ignore
import android.arch.persistence.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.text.DecimalFormat
import java.text.NumberFormat
import java.util.*

@Entity(tableName = "SKU")
data class SKU(
        @PrimaryKey @SerializedName("skU_ID") var SKU_ID: Int,
        @SerializedName("skU_CODE") var SKU_CODE: String,
        @SerializedName("skU_NAME") var SKU_NAME: String,
        @SerializedName("gsT_ON") var GST_ON: String,
        @SerializedName("tradE_PRICE") var TRADE_PRICE: Double,
        @SerializedName("gsT_RATE") var GST_RATE: Double,
        @SerializedName("unitS_IN_CASE") var UNITS_IN_CASE: Int,
        @SerializedName("branD_ID") var BRAND_ID: Int,
        @SerializedName("weight") var WEIGHT: Double,
        @SerializedName("distributoR_PRICE") var DISTRIBUTOR_PRICE: Double,
        @SerializedName("retaiL_PRICE") var RETAIL_PRICE: Double,
        @SerializedName("extr_Tax") var EXTR_Tax: Float,
        @SerializedName("sequencE_NUMBER") var SEQUENCE_NUMBER: Int,
        @SerializedName("uoM_DESC") var UOM_DESC: String,
        @SerializedName("categorY_ID") var CATEGORY_ID:Int,
        @Ignore var NO_OF_UNITS: Int = 0,
        @Ignore var NO_OF_CARTONS: Int = 0


) : Serializable {


    constructor() : this(0, "", "", "", 0.0, 0.0, 0, 0, 0.0, 0.0, 0.0, 0f, 0, "", 0, 0, 0)

    fun getSubTotal(): CharSequence? {
        val totalUnits = NO_OF_UNITS + NO_OF_CARTONS * UNITS_IN_CASE
        return RoundUp2Decimal((totalUnits * TRADE_PRICE))
    }

    override fun toString(): String {
        return SKU_NAME
    }
}

fun RoundUp2Decimal(d: Double) = "%.2f".format(d)

fun RoundUp4Decimal(d: Double) = "%.4f".format(d).toDouble()

//fun DecimalFormattedAmount(d:Double) = NumberFormat.getNumberInstance(Locale.UK).format(d)

fun DecimalFormattedAmount(d:Double) = DecimalFormat("###,###,###.#####").format(d)