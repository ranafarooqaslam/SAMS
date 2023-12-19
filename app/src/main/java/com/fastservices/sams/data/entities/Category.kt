package com.fastservices.sams.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.io.Serializable

@Entity(tableName = "CATEGORY")
data class Category(
        @PrimaryKey @SerializedName("skU_HIE_ID") var SKU_HIE_ID: Int,
        @SerializedName("skU_HIE_NAME") var SKU_HIE_NAME: String,
        @SerializedName("parenT_SKU_HIE_ID") var PARENT_SKU_HIE_ID: Int
) : Serializable {

    override fun toString(): String {
        return SKU_HIE_NAME
    }
}