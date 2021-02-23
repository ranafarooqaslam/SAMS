package com.fastservices.sams.data.repos

import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.entities.Locality
import com.fastservices.sams.data.entities.Section
import com.fastservices.sams.data.models.Parameters
import com.fastservices.sams.data.models.PostBody
import com.fastservices.sams.data.models.UserInfo

class RepoSection(val user: UserInfo) {

    private val SP_NAME = "uspGetSaleForceAreaAndroid"
    private val SP_NAME_1 = "uspGetSaleForceRouteAndroid"
    private val body: PostBody<Parameters> = PostBody(SP_NAME, Parameters(user.UserId, user.DistributionID))
    private val bodyLocality: PostBody<Parameters> = PostBody(SP_NAME_1, Parameters(user.UserId, user.DistributionID))

    fun getAllSectionsLocal(): List<Section> {
        return SamsApplication.getDB().sectionDao().getAll()
    }

    suspend private fun getAllSectionsRemote(): List<Section> {
        return SamsApplication.getWebService().getSections(body).await().dataReturned
//        return SamsApplication.getMockWebService().getSections().await().dataReturned
    }

    suspend private fun getAllLocalitiesRemote(): List<Locality> {
        return SamsApplication.getWebService().getLocalities(bodyLocality).await().dataReturned
//        return SamsApplication.getMockWebService().getSections().await().dataReturned
    }

    suspend fun syncDownSections() {
        val sections = getAllSectionsRemote()
        val localities = getAllLocalitiesRemote()
        SamsApplication.getDB().sectionDao().deleteAll()
        SamsApplication.getDB().sectionDao().deleteAllLocality()
        SamsApplication.getDB().sectionDao().insertAll(sections)
        SamsApplication.getDB().sectionDao().insertAllLocality(localities)
    }
}