package com.fastservices.sams.data.repos

import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.entities.Locality
import com.fastservices.sams.data.entities.Section
import com.fastservices.sams.data.models.Parameters
import com.fastservices.sams.data.models.PostBody
import com.fastservices.sams.data.models.UserInfo

class RepoLocality(val user: UserInfo) {

    private val SP_NAME = "uspGetSaleForceRouteAndroid"
    private val body: PostBody<Parameters> = PostBody(SP_NAME, Parameters(user.UserId, user.DistributionID))

    fun getAllSectionsLocal(): List<Section> {
        return SamsApplication.getDB().sectionDao().getAll()
    }

     private  suspend fun getAllSectionsRemote(): List<Locality> {
        return SamsApplication.getWebService().getLocalities(body).await().dataReturned
//        return SamsApplication.getMockWebService().getSections().await().dataReturned
    }

    suspend  fun syncDownSections() {
        val sections = getAllSectionsRemote()
        SamsApplication.getDB().sectionDao().deleteAll()
        SamsApplication.getDB().sectionDao().insertAllLocality(sections)
    }
}