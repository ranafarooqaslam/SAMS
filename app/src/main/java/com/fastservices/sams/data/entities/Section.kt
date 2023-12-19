package com.fastservices.sams.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "SECTIONS")
data class Section(
        @PrimaryKey val sectionID: Int,
        val sectionCode: String?,
        val sectionName: String?
) {

    override fun toString(): String {
        return sectionName ?: ""
    }
}