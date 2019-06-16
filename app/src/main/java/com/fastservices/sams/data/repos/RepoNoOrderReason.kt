package com.fastservices.sams.data.repos

import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.entities.NoOrderReason
import com.fastservices.sams.data.models.PostBody

class RepoNoOrderReason {

    private val SP_NAME = "uspGetUnOrderStatus"

    suspend fun syncDownData() {

        val reasons = getReasonsRemote()
        SamsApplication.getDB().noOrderReasonDao().deleteAll()
        SamsApplication.getDB().noOrderReasonDao().insertAll(reasons)

    }

    suspend private fun getReasonsRemote(): List<NoOrderReason> {
        return SamsApplication.getWebService().getNoOrderReasons(PostBody(SP_NAME, Any())).await().dataReturned
    }

    fun getAll() = SamsApplication.getDB().noOrderReasonDao().getAllReasons()
}