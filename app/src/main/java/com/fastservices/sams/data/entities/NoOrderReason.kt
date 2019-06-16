package com.fastservices.sams.data.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class NoOrderReason(
        @PrimaryKey val unOrderReasonID: Int,
        val unOrderReason: String
) {
}