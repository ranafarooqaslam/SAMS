package com.fastservices.sams.data.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class StockPositionMaster(
        @PrimaryKey var OUTLET_ID: Int,
        var IS_SYNCED:Int
) {
}