package com.fastservices.sams.data.entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.Ignore
import android.arch.persistence.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

@Entity(tableName = "Outlet")
data class Outlet(
        @PrimaryKey(autoGenerate = true)
        var _id: Int,
        var outletID : Int,
        var outletName: String,
        var ownerName: String,
        var phoneNumber: String,
        var storeAddress: String,
        var landMark: String,
        var sectionID: Int,
        var channelID: Int,
        var localityID: Int,
        var routeID: Int,
        var townID: Int,
        var subChannelID: Int,
        var promotionClass: Int,
        var closing: Double,
        var creditLimit: Float,
        var creditDays: Int,
        @ColumnInfo(name = "isRegistered")
        @SerializedName("isRegistered")
        var registered: Int,
        var sequenceNo: Int,
        var comments: String,
        var latitude: Double,
        var longtidue: Double,
        var photoPath1: String,
        var photoPath2: String,
        var photoPath3: String,
        var photoPath4: String,
        var photoPath5: String,
        var areaTypeId:Int,
        var lastOrderDate:String,
        var lastOrderAmount:Double,
        @Ignore var label: String,
        @ColumnInfo(name = "isCredit")
        @SerializedName("isCredit")
        var credit:Int,
        var validateRadius:Int,
        var radius:Int

) : Serializable {



    constructor() : this(0,0, "", "", "", "", "", 0,  0, 0,0, 0, 0, 0, 0.0, 0f, 0, 0, 0, "", 0.0, 0.0, "", "", "", "", "",
            0,"",0.0,"",0,0,20)

    override fun toString(): String {
        return outletName
    }
}