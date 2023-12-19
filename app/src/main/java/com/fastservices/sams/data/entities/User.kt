package com.fastservices.sams.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "USER")
data class User(
        @PrimaryKey var USER_ID: Int,
        var COMPANY_ID: Int,
        var DISTRIBUTOR_ID: Int,
        var ROLE_ID: Int,
        var LOGIN_ID: String,
        var PASSWORD: String,
        var IS_ACTIVE: Int,
        var LASTUPDATE_DATE: String?
) {
}