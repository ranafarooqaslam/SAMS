package com.fastservices.sams.data.repos

import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.entities.SKU
import com.fastservices.sams.data.models.PostBody
import com.fastservices.sams.data.models.UserInfo

class RepoSKU(val user: UserInfo) {

    private val SP_NAME = "uspGetSKUAndroid"
    private val params = mapOf(
            "DistributorID" to user.DistributionID,
            "UserID" to user.UserId,
            "WorkingDate" to "2018-10-03"
    )

    suspend fun syncDownSKUs() {
        val skus = SamsApplication.getWebService().getSKUs(PostBody(SP_NAME, params)).await().dataReturned
        SamsApplication.getDB().SKUDao().deleteAll()
        SamsApplication.getDB().SKUDao().insertAll(skus)
    }

    fun getAllSKUs(): List<SKU> {
        return SamsApplication.getDB().SKUDao().getAll()
    }

    fun getAllSKUForCategory(categoryId:Int): List<SKU> {
        return SamsApplication.getDB().SKUDao().getAllForCategory(categoryId)
    }
}