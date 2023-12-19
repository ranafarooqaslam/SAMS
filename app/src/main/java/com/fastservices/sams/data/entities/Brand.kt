package com.fastservices.sams.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "BRAND")
data class Brand(
        @PrimaryKey var SKU_HIE_ID: Int,
        var PARENT_SKU_HIE_ID: Int,
        var SKU_HIE_NAME: String
) {
}