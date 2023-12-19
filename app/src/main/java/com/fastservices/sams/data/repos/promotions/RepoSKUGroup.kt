package com.fastservices.sams.data.repos.promotions

import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.models.PostBody
import com.fastservices.sams.data.models.UserInfo

class RepoSKUGroup(val user: UserInfo) {

    private val SP_NAME = "uspSelectSKU_GroupsAndroid"
    private val params = emptyMap<String,String>()


    suspend  fun syncDown() {
        val groups = getAllRemote()
        SamsApplication.getDB().skuGroupDao().deleteAll()
        SamsApplication.getDB().skuGroupDao().insertAll(groups)

    }


    private suspend fun getAllRemote() = SamsApplication.getWebService().getSKUGroups(PostBody(SP_NAME, params)).await().dataReturned


}