package com.fastservices.sams.data.repos.promotions

import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.models.PostBody
import com.fastservices.sams.data.models.UserInfo

class RepoPromotionOffer(val user: UserInfo) {

    private val SP_NAME = "uspGetPromotionAndroid"
    private val params = mapOf("DistributorID" to user.DistributionID, "TypeID" to "4", "WorkingDate" to SamsApplication.getDocumentDate())


    suspend fun syncDown() {
        val promotionoffers = getAllRemote()
        SamsApplication.getDB().promotionOfferDao().deleteAll()
        SamsApplication.getDB().promotionOfferDao().insertAll(promotionoffers)

    }

    fun getAllLocal(backet_detail_id:Long) = SamsApplication.getDB().promotionOfferDao().getAll(backet_detail_id)

    private suspend fun getAllRemote() = SamsApplication.getWebService().getPromotionOffers(PostBody(SP_NAME, params)).await().dataReturned


}