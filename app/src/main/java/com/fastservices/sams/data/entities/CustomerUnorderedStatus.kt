package com.fastservices.sams.data.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "CUSTOMER_UNORDERED_STATUS")
data class CustomerUnorderedStatus(
        @PrimaryKey(autoGenerate = true) var id: Int,
        var CUSTOMER_UNORDERED_STATUS_ID: Int?,
        var STATUS: String?
) {
}