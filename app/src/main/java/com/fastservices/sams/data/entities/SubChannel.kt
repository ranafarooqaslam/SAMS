package com.fastservices.sams.data.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

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