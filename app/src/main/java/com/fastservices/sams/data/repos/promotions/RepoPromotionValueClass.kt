package com.fastservices.sams.data.repos.promotions

import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.models.PostBody
import com.fastservices.sams.data.models.UserInfo

class RepoPromotionValueClass(val user: UserInfo) {

    private val SP_NAME = "uspGetPromotionAndroid"
    private val params = mapOf("DistributorID" to user.DistributionID, "TypeID" to "5", "WorkingDate" to SamsApplication.getDocumentDate())


    suspend fun syncDown() {
        val promotionValues = getAllRemote()
        SamsApplication.getDB().promotionValueDao().deleteAll()
        SamsApplication.getDB().promotionValueDao().insertAll(promotionValues)

    }

    fun getAllLocal(promotion_id: Long) = SamsApplication.getDB().promotionValueDao().getAll(promotion_id)

    private suspend fun getAllRemote() = SamsApplication.getWebService().getPromotionValue(PostBody(SP_NAME, params)).await().dataReturned


}