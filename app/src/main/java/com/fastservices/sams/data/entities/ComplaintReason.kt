package com.fastservices.sams.data.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class ComplaintReason(
        @PrimaryKey val complaintReasonID: Int,
        var complaintReason: String = "",
        var check: Boolean,
        var remarks: String?
) {
}