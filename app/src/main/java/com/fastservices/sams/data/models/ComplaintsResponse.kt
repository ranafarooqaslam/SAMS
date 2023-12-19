package com.fastservices.sams.data.models

import com.fastservices.sams.data.entities.ComplaintReason

data class ComplaintsResponse(
        val reason: List<ComplaintReason>
) {
}