package com.fastservices.sams.data.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "MENU")
data class Menu(
        @PrimaryKey val androidMenuID: Int,
        val menuName: String,
        var isActive: Boolean
) {
}