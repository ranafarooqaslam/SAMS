package com.fastservices.sams.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "DISTRIBUTOR_AREA")
data class DistributorArea(
        @PrimaryKey var AREA_ID: Int,
        var AREA_CODE: String,
        var AREA_NAME: String
) {
}