package com.fastservices.sams.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class StockPositionMaster(
        @PrimaryKey var OUTLET_ID: Int,
        var IS_SYNCED:Int
) {
}