package com.fastservices.sams.data.models

import com.google.gson.annotations.SerializedName

data class UserInfo(
        val access_token: String,
        val token_type: String,
        val expires_in: Long,
        var UserId: String,
        var DistributionID: String,
        val UserName: String,
        val DistributorTypeID:String,
        val DistributorName:String,
        val OTPicturesManadatory:String,
        @SerializedName("IsDistributorRegister")
        val DistributorRegister:Int
) {
}