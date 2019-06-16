package com.fastservices.sams.data.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class SKUGroup(

       var skU_GROUP_ID: Int,
       @PrimaryKey  var skU_GROUP_DETAIL_ID: Int,
        var skU_ID: Int
) {
    constructor():this(0,0,0)

}