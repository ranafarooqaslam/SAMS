package com.fastservices.sams.data.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "BRAND")
data class Brand(
        @PrimaryKey var SKU_HIE_ID: Int,
        var PARENT_SKU_HIE_ID: Int,
        var SKU_HIE_NAME: String
) {
}