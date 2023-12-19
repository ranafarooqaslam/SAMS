package com.fastservices.sams.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "SALE_ORDER_PROMOTION")
data class OrderDetailFreeSKU(
        @PrimaryKey(autoGenerate = true) var SALE_ORDER_PROMOTION_ID: Int,
        @SerializedName("DISTRIBUTOR_ID") var DISTRIBUTOR_ID: Int,
        @SerializedName("SALE_ORDER_ID") var SALE_ORDER_ID: Int,
        @SerializedName("SCHEME_ID") var SCHEME_ID: Int,
        @SerializedName("PromotionID") var PROMOTION_ID: Long,
        @SerializedName("BasketID") var BASKET_ID: Long,
        @SerializedName("BasketDetailID") var BASKET_DETAIL_ID: Long,
        @SerializedName("PromotionOfferID") var PROMOTION_OFFER_ID: Long,
        @SerializedName("SKUID") var SKU_ID: Int,
        @SerializedName("Quantity") var QUANTITY: Int,
        @SerializedName("Price") var UNIT_PRICE: Double,
        @SerializedName("Amount") var AMOUNT: Double,
        @SerializedName("GSTRate") var GST_RATE: Double,
        @SerializedName("GSTAmount") var GST_AMOUNT: Double,
        @SerializedName("TSTAmount") var TST_AMOUNT: Double,
        @SerializedName("SED_AMOUNT") var SED_AMOUNT: Double,
        @SerializedName("MasterSKUID") var master_Sku_Id: Int,
        @SerializedName("ExtraTax") var EXTRA_TAX: Double,
        @SerializedName("QuantityTo") var QUANTITY_TO: Int,
        @SerializedName("QuantityAd") var QUANTITY_AD: Int
) {
}