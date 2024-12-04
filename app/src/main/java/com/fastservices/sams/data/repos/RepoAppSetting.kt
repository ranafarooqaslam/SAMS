package com.fastservices.sams.data.repos

import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.entities.AppSettingValueClass
import com.fastservices.sams.data.models.PostBody
import com.fastservices.sams.data.models.UserInfo

class RepoAppSetting (val user: UserInfo) {
    private val SP_NAME = "uspAndroidAppSettings"
    private val params = mapOf("UserId" to user.UserId)

    suspend  fun syncDown() {
        val appSetting = getAllRemote()
        if(appSetting.isNotEmpty()) {
            SamsApplication.getDB().AppSettingValueDao().deleteAll()
            SamsApplication.getDB().AppSettingValueDao().insertAll(appSetting[0])
        }
    }

    private suspend fun getAllRemote() = SamsApplication.getWebService().getAppSetting(
        PostBody(SP_NAME, params)
    ).await().dataReturned

    fun getSetting(): List<AppSettingValueClass> {
        return SamsApplication.getDB().AppSettingValueDao().getAll()
    }
}