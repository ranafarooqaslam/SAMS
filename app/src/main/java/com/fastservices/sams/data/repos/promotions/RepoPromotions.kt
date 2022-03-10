package com.fastservices.sams.data.repos.promotions

import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.models.PostBody
import com.fastservices.sams.data.models.UserInfo

class RepoPromotions(val user: UserInfo) {

    private val SP_NAME = "uspGetPromotionAndroid"
    private val params = mapOf("DistributorID" to user.DistributionID, "TypeID" to "1", "WorkingDate" to SamsApplication.getDocumentDate())


    suspend  fun syncDown() {
        val promotions = getAllRemote()
        SamsApplication.getDB().promotionDao().deleteAll()
        SamsApplication.getDB().promotionDao().insertAll(promotions)

    }

    fun getAllLocal() = SamsApplication.getDB().promotionDao().getAll()

    private suspend  fun getAllRemote() = SamsApplication.getWebService().getPromotions(PostBody(SP_NAME, params)).await().dataReturned


}