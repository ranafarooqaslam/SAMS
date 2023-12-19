package com.fastservices.sams.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "CUSTOMER_ORDER_STATUS")
data class CustomerOrderStatus(
        @PrimaryKey(autoGenerate = true) var id: Int,
        var CUSTOMER_ID: Int,
        var AREA_ID: Int,
        var DOCUMENT_DATE: Date,
        var STATUS_ID: Int,
        var TIME_IN: Date,
        var TIME_OUT: Date,
        var IS_SYNCED: Int

) {
}