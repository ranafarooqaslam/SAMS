package com.fastservices.sams.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ComplaintReason(
        @PrimaryKey val complaintReasonID: Int,
        var complaintReason: String = "",
        var check: Boolean,
        var remarks: String?
) {
}