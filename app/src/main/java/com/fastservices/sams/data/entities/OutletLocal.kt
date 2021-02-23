package com.fastservices.sams.data.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "OutletLocal")
data class OutletLocal(
        @PrimaryKey(autoGenerate = true)
        var OutletID: Int,
        var OutletName: String,
        var OwnerName: String,
        var PhoneNumber: String,
        var OutletAddress: String,
        var LandMark: String,
        var SectionID: Int,
        var LocalityID: Int,
        var ChannelID: Int,
        var TownID: Int,
        var SubChannelID: Int,
        var Comments: String,
        var Latitude: Double,
        var Longtidue: Double,
        var PhotoPath1: String,
        var PhotoPath2: String,
        var PhotoPath3: String,
        var PhotoPath4: String,
        var PhotoPath5: String,
        var AreaTypeId: Int
) : Serializable {
    fun checkValidity(): String? {
        val output = when {
            OutletName.isEmpty() -> "Input store name"
            OutletAddress.isEmpty() -> "Input store Address"
            SectionID == 0 -> "Set Section"
            LocalityID == 0 -> "Set Locality"
            ChannelID == 0 -> "Set Channel"
            SubChannelID == 0 -> "Set Sub channel"
            Latitude == 0.0 || Longtidue == 0.0 -> "Set location via Take GPS button"
            PhoneNumber.isEmpty() -> "Input phone number"
            AreaTypeId == -1 ->"Select Area type"
            else -> null
        }

        return output
    }

    constructor() : this(0, "", "", "", "", "", 0, 0,0, 0, 0, "", 0.0, 0.0, "", "", "", "", "",
            -1)

    override fun toString(): String {
        return OutletName
    }
}