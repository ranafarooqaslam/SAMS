package com.fastservices.sams.data.repos.promotions

import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.models.PostBody
import com.fastservices.sams.data.models.UserInfo

class RepoBasketMaster(val user: UserInfo) {

    private val SP_NAME = "uspGetPromotionAndroid"
    private val params = mapOf("DistributorID" to user.DistributionID, "TypeID" to "2", "WorkingDate" to SamsApplication.getDocumentDate())


    suspend fun syncDown() {
        val baskets = getAllRemote()
        SamsApplication.getDB().basketMasterDao().deleteAll()
        SamsApplication.getDB().basketMasterDao().insertAll(baskets)

    }

    fun getAllLocal(basket_id: Long) = SamsApplication.getDB().basketMasterDao().getAll(basket_id)

    private suspend fun getAllRemote() = SamsApplication.getWebService().getBasketMaster(PostBody(SP_NAME, params)).await().dataReturned


}