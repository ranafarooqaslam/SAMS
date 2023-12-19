package com.fastservices.sams.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Locality")
data class Locality(
        @PrimaryKey val routeID: Int,
        val routeCode: String?,
        val routeName: String?,
        val sectionID: Int
) {

    override fun toString(): String {
        return routeName ?: ""
    }
}
