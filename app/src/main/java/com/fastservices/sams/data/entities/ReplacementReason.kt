package com.fastservices.sams.data.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class ReplacementReason(
        @PrimaryKey val replacementReasonID: Int,
        var replacementReason: String = ""
) {

    override fun toString(): String {
        return replacementReason
    }
}