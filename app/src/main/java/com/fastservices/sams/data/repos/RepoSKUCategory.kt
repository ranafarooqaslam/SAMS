package com.fastservices.sams.data.repos

import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.entities.Category
import com.fastservices.sams.data.models.PostBody
import com.fastservices.sams.data.models.UserInfo

class RepoSKUCategory(val user: UserInfo) {

    private val SP_NAME = "spSelectSKU_HIERARCHYAndroid"
    private val params = mapOf("TypeID" to "59", "UserID" to user.UserId)


    suspend fun syncDownCategoies() {
        val categories = SamsApplication.getWebService().getCategories(PostBody(SP_NAME, params)).await().dataReturned
        SamsApplication.getDB().skuCategoryDao().deleteAll()
        SamsApplication.getDB().skuCategoryDao().insertAll(categories)

        RepoSKU(user).syncDownSKUs()
    }

    fun getCategoriesLocal(): List<Category> {
        return SamsApplication.getDB().skuCategoryDao().getAll()
    }
}