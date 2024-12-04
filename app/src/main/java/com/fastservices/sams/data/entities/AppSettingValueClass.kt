package com.fastservices.sams.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "AppSetting")
data class AppSettingValueClass(
    @PrimaryKey
    var VOLUMECLASS_ID: Int = 1,
    @SerializedName("isManualDiscount")
    var isManualDiscount: Int = 0
)