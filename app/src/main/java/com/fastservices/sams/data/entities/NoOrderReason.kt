package com.fastservices.sams.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class NoOrderReason(
        @PrimaryKey val unOrderReasonID: Int,
        val unOrderReason: String
) {
}