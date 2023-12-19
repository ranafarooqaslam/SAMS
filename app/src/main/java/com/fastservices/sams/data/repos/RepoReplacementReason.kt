package com.fastservices.sams.data.repos

import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.entities.ComplaintReason
import com.fastservices.sams.data.entities.ReplacementReason
import com.fastservices.sams.data.models.ParametersDistID
import com.fastservices.sams.data.models.ParentID
import com.fastservices.sams.data.models.PostBody
import com.fastservices.sams.data.models.UserInfo

class RepoReplacementReason(val user: UserInfo) {

    private val SP_NAME = "uspGetReplacementReasonAndroid"
    private val body: PostBody<ParametersDistID> = PostBody(SP_NAME, ParametersDistID(user.DistributionID))

    suspend  fun getAllReasonsRemote(): List<ReplacementReason> {
        return SamsApplication.getWebService().getReplacementReason(body).await().dataReturned
    }

    suspend  fun syncDown() {
        val reasons = getAllReasonsRemote()
        SamsApplication.getDB().replacementReasonDao().deleteAll()
        SamsApplication.getDB().replacementReasonDao().insert(reasons)
    }

}