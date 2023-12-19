package com.fastservices.sams.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class OutletComplaint(
        @PrimaryKey(autoGenerate = true) val _id: Int,
        var CustomerID:String,
        val ComplaintReasonID: Int,
        var DocumentDate:String,
        var Remarks: String?
) {
//    constructor(r: ComplaintReason,date:String) : this(0, "",r.complaintReasonID, date,r.remarks)
}