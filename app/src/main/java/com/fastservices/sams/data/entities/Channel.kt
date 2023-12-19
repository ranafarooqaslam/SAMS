package com.fastservices.sams.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "CHANNEL")
data class Channel(
        @PrimaryKey val id: Int,
        val code: String,
        val name: String,
        val status: Boolean
) {

    override fun toString(): String {
        return name
    }
}