package com.fastservices.sams.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ReplacementReason(
        @PrimaryKey val replacementReasonID: Int,
        var replacementReason: String = ""
) {

    override fun toString(): String {
        return replacementReason
    }
}