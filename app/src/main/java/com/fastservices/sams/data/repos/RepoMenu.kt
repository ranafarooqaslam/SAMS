package com.fastservices.sams.data.repos

import android.util.Log
import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.entities.Menu
import com.fastservices.sams.data.models.Parameter
import com.fastservices.sams.data.models.PostBody
import com.fastservices.sams.data.models.UserInfo

class RepoMenu(val user: UserInfo) {

    val SP_NAME = "uspGetAndroidMenu"
    val body: PostBody<Parameter> = PostBody(SP_NAME, Parameter(user.UserId))

    fun getMenuItemsLocal(): List<Menu> {

        return SamsApplication.getDB().menuDao().getAllItems()
    }

     private suspend fun getMenuItemsRemote(): List<Menu> {
//        return SamsApplication.getMockWebService().getMenu().await().dataReturned
        return SamsApplication.getWebService().getMenu(body).await().dataReturned
    }

    private fun saveMenuItems(items: List<Menu>) {
        SamsApplication.getDB().menuDao().insertAll(items)
    }

    suspend fun loadAndSaveMenu(): List<Menu> {
        val items = getMenuItemsRemote()
        Log.d("ApiCheck", "loadAndSaveMenu: $items")
        saveMenuItems(items)
        return items
    }


}