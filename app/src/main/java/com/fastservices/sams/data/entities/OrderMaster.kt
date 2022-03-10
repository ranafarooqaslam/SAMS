package com.fastservices.sams.data.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.util.*

@Entity(tableName = "ORDER_MASTER")
data class OrderMaster(
        @PrimaryKey(autoGenerate = true) var SALE_ORDER_ID: Int,
        var DISTRIBUTOR_ID: Int,
        var PRINCIPAL_ID: Int,
        var SOLD_TO: Int,
        var TOWN_ID: Int,
        var AREA_ID: Int,
        var DOCUMENT_DATE: String,
        var TOTAL_AMOUNT: Double,
        var EXTRA_DISCOUNT_AMOUNT: Double,
        var STANDARD_DISCOUNT_AMOUNT: Double,
        var GST_AMOUNT: Double,
        var TOTAL_NET_AMOUNT: Double,
        var SCHEME_AMOUNT: Double,
        var TST_AMOUNT: Double,
        var SED_AMOUNT: Double,
        var REMARKS: String,
        var EXTRA_TAX: Double,
        var STANDARD_DISCOUNT_BY_VALUE: Double,
        var STANDARD_DISCOUNT_PER_VALUE: Double,
        var SED_AMOUNT_BY_VALUE: Double,
        var SED_AMOUNT_PER_VALUE: Double,
        var STANDARD_DISCOUNT_BY_VALUE_TO: Double,
        var STANDARD_DISCOUNT_BY_VALUE_AD: Double,
        var STANDARD_DISCOUNT_PER_VALUE_TO: Double,
        var STANDARD_DISCOUNT_PER_VALUE_AD: Double,
        var SED_AMOUNT_BY_VALUE_TO: Double,
        var SED_AMOUNT_BY_VALUE_AD: Double,
        var SED_AMOUNT_PER_VALUE_TO: Double,
        var SED_AMOUNT_PER_VALUE_AD: Double,
        var TIME_IN: String,
        var TIME_OUT: String,
        var OUTLET_ID:Int,
        var LATITUDE : Double,
        var LONGITUDE: Double,
        var PHOTO_PATH1:String,
        var PHOTO_PATH2:String,
        var PHOTO_PATH3:String,
        var PHOTO_PATH4:String,
        var PHOTO_PATH5:String,
        var ORDER_PAYMENT_TYPE:Int,
        var IS_SYNCED: Int

) {
}