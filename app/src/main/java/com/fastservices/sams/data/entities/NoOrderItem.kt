package com.fastservices.sams.data.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class NoOrderItem(
        @PrimaryKey var OutletID: Int,

        var SectionID: String,

        var DocumentDate: String,

        var ReasonID: String,

        var TimeIn: String, // 2019-03-04 15:04:02

        var TimeOut: String, // 2019-03-02

        var Comments: String,

        var latitude:Double,

        var longitude:Double,

        var photoPath1: String,
        var photoPath2: String,
        var photoPath3: String,
        var photoPath4: String,
        var photoPath5: String

) {


}