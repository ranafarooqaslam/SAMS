package com.fastservices.sams.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class Merchandise(
        @PrimaryKey @SerializedName("OutletID") var OutletID: Int,
        @SerializedName("DocumentDate")var DocumentDate: String?,
        @SerializedName("Remarks") var Remarks: String?,
        @SerializedName("BFMarchanImg1") var Image1Path1: String?,
        @SerializedName("BFMarchanImg2") var Image1Path2: String?,
        @SerializedName("BFMarchanImg3") var Image1Path3: String?,
        @SerializedName("BFMarchanImg4") var Image1Path4: String?,
        @SerializedName("BFMarchanImg5") var Image1Path5: String?,
        @SerializedName("AFMarchanImg1") var Image2Path1: String?,
        @SerializedName("AFMarchanImg2") var Image2Path2: String?,
        @SerializedName("AFMarchanImg3") var Image2Path3: String?,
        @SerializedName("AFMarchanImg4") var Image2Path4: String?,
        @SerializedName("AFMarchanImg5") var Image2Path5: String?
) {

    constructor() : this( 0, "", "", null, null, null, null, null, null, null, null, null, null)

}