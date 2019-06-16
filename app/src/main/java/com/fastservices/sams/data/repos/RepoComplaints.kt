package com.fastservices.sams.data.repos

import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.entities.ComplaintReason
import com.fastservices.sams.data.models.ParametersDistID
import com.fastservices.sams.data.models.ParentID
import com.fastservices.sams.data.models.PostBody
import com.fastservices.sams.data.models.UserInfo

class RepoComplaints(val user: UserInfo) {

    private val SP_NAME = "uspGetComplaintReasonAndroid"
    private val body: PostBody<ParametersDistID> = PostBody(SP_NAME, ParametersDistID(user.DistributionID))

    suspend fun getAllComplaintsRemote(): List<ComplaintReason> {
        return SamsApplication.getWebService().getComplaintReason(body).await().dataReturned
    }

    suspend fun syncDownComplaints() {
        val complaints = getAllComplaintsRemote()
        SamsApplication.getDB().complaintReasonDao().deleteAll()
        SamsApplication.getDB().complaintReasonDao().insert(complaints)
    }

}