package com.fastservices.sams.data.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class Replacement(
        @PrimaryKey(autoGenerate = true) var _id: Int,
        var outletId : String,
        var ReplacementTypeID:String,
        var SKUID: String,
        var Price: String,
        var InvoiceNo: String,
        var InvoiceDate: String,
        var Description: String,
        var StockImage1: String,
        var StockImage2: String,
        var StockImage3: String,
        var StockImage4: String,
        var StockImage5: String,
        var InvoiceImage1: String,
        var InvoiceImage2: String,
        var InvoiceImage3: String,
        var InvoiceImage4: String,
        var InvoiceImage5: String

) {
}