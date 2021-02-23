package com.fastservices.sams.data.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

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
