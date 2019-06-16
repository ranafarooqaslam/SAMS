package com.fastservices.sams.data.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "ORDER_DETAIL")
data class OrderDetail(
        @PrimaryKey(autoGenerate = true) var ORDER_DETAIL_ID: Int,
        @SerializedName("DISTRIBUTOR_ID") var DISTRIBUTOR_ID: Int,
        @SerializedName("SALE_ORDER_ID") var SALE_ORDER_ID: Int,
        @SerializedName("SKUID") var SKU_ID: Int,
        @SerializedName("Quantity") var QUANTITY_UNIT: Int,
        @SerializedName("Price") var UNIT_PRICE: Double,
        @SerializedName("GSTRate") var GST_RATE: Double,
        @SerializedName("Amount") var AMOUNT: Double,
        @SerializedName("StandardDiscount") var STANDARD_DISCOUNT: Double,
        @SerializedName("ExtraDiscount") var EXTRA_DISCOUNT: Double,
        @SerializedName("GSTAmount") var GST_AMOUNT: Double,
        @SerializedName("NetAmount") var NET_AMOUNT: Double,
        @SerializedName("TSTAmount") var TST_AMOUNT: Double,
        @SerializedName("SedAmount") var SED_AMOUNT: Double,
        @SerializedName("Unit_In_Case") var UNITS_IN_CASE: Int,
        @SerializedName("ExtraTax") var EXTRA_TAX: Double,
        @SerializedName("GSTPrice") var GST_PRICE: Double,
        @SerializedName("StandardDiscountByValue") var STANDARD_DISCOUNT_BY_VALUE: Double,
        @SerializedName("StandardDiscountPerValue") var STANDARD_DISCOUNT_PER_VALUE: Double,
        @SerializedName("SedAmountByValue") var SED_AMOUNT_BY_VALUE: Double,
        @SerializedName("SedAmountPerValue") var SED_AMOUNT_PER_VALUE: Double,
        @SerializedName("StandardDiscountByValueTo") var STANDARD_DISCOUNT_BY_VALUE_TO: Double,
        @SerializedName("StandardDiscountByValueAd") var STANDARD_DISCOUNT_BY_VALUE_AD: Double,
        @SerializedName("StandardDiscountPerValueTo") var STANDARD_DISCOUNT_PER_VALUE_TO: Double,
        @SerializedName("StandardDiscountPerValueAd") var STANDARD_DISCOUNT_PER_VALUE_AD: Double,
        @SerializedName("SedAmountByValueTo") var SED_AMOUNT_BY_VALUE_TO: Double,
        @SerializedName("SedAmountByValueAD") var SED_AMOUNT_BY_VALUE_AD: Double,
        @SerializedName("SedAmountPerValueTo") var SED_AMOUNT_PER_VALUE_TO: Double,
        @SerializedName("SedAmountPerValueAd") var SED_AMOUNT_PER_VALUE_AD: Double
) {
}