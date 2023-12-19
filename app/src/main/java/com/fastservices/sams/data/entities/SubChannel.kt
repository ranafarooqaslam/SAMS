package com.fastservices.sams.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "SUBCHANNEL")
data class SubChannel(
        @PrimaryKey val id: Int,
        val code: String,
        val name: String,
        val parentID: Int,
        val status: Boolean
) {

    override fun toString(): String {
        return name
    }
}