package com.fastservices.sams.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "MENU")
data class Menu(
        @PrimaryKey val androidMenuID: Int,
        val menuName: String,
        var isActive: Boolean
) {
}