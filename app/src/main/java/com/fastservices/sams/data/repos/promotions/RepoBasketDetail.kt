package com.fastservices.sams.data.repos.promotions

import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.models.PostBody
import com.fastservices.sams.data.models.UserInfo

class RepoBasketDetail(val user: UserInfo) {

    private val SP_NAME = "uspGetPromotionAndroid"
    private val params = mapOf("DistributorID" to user.DistributionID, "TypeID" to "3", "WorkingDate" to SamsApplication.getDocumentDate())


    suspend  fun syncDown() {
        val basketDetails = getAllRemote()
        SamsApplication.getDB().basketDetailDao().deleteAll()
        SamsApplication.getDB().basketDetailDao().insertAll(basketDetails)

    }

    fun getAllLocal(basket_id: Long) = SamsApplication.getDB().basketDetailDao().getAll(basket_id)

    private suspend fun getAllRemote() = SamsApplication.getWebService().getBasketDetails(PostBody(SP_NAME, params)).await().dataReturned


}