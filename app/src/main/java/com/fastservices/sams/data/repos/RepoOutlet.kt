package com.fastservices.sams.data.repos

import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.entities.Outlet
import com.fastservices.sams.data.models.Parameters
import com.fastservices.sams.data.models.PostBody
import com.fastservices.sams.data.models.UserInfo

class RepoOutlet(val user: UserInfo) {

    private val SP_NAME = "uspGetSaleForceCustomerAndroid"
    private val body: PostBody<Parameters> = PostBody(SP_NAME, Parameters(user.UserId, user.DistributionID))

    fun getAllOutletsLocal(): List<Outlet> {
        return SamsApplication.getDB().outletDao().getAll()
    }

    suspend fun getOutletsRemote(): List<Outlet> {
        return SamsApplication.getWebService().getOutlets(body).await().dataReturned
    }

    suspend fun syncDownOutlets() {
        val outlets = getOutletsRemote()
        SamsApplication.getDB().outletDao().deleteAll()
        SamsApplication.getDB().outletDao().insert(outlets)
    }

    fun countAll():Int{
        return SamsApplication.getDB().outletDao().countAll()


    }
}