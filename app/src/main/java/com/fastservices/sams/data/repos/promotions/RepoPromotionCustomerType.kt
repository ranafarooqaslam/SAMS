package com.fastservices.sams.data.repos.promotions

import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.models.PostBody
import com.fastservices.sams.data.models.UserInfo

class RepoPromotionCustomerType(val user: UserInfo) {

    private val SP_NAME = "uspGetPromotionAndroid"
    private val params = mapOf("DistributorID" to user.DistributionID, "TypeID" to "6", "WorkingDate" to SamsApplication.getDocumentDate())


    suspend  fun syncDown() {
        val promotionCustomerType = getAllRemote()
        SamsApplication.getDB().promotionCustomerDao().deleteAll()
        SamsApplication.getDB().promotionCustomerDao().insertAll(promotionCustomerType)

    }

    fun getAllLocal(promotion_id: Long) = SamsApplication.getDB().promotionCustomerDao().getAll(promotion_id)

    private suspend fun getAllRemote() = SamsApplication.getWebService().getPromotionCustomerType(PostBody(SP_NAME, params)).await().dataReturned


}