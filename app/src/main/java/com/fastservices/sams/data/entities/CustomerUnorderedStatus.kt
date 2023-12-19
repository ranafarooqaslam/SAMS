package com.fastservices.sams.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "CUSTOMER_UNORDERED_STATUS")
data class CustomerUnorderedStatus(
        @PrimaryKey(autoGenerate = true) var id: Int,
        var CUSTOMER_UNORDERED_STATUS_ID: Int?,
        var STATUS: String?
) {
}