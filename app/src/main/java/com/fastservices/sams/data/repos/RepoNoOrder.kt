package com.fastservices.sams.data.repos

import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.entities.NoOrderItem
import com.fastservices.sams.data.models.UserInfo

class RepoNoOrder(user: UserInfo?) {

//    private val SP_NAME = "uspGetUnOrderStatus"

//    suspend fun syncDownData() {
//
//        val reasons = getReasonsRemote()
//        SamsApplication.getDB().noOrderReasonDao().deleteAll()
//        SamsApplication.getDB().noOrderReasonDao().insertAll(reasons)
//
//    }

     fun getAll(): List<NoOrderItem> {
        return SamsApplication.getDB().noOrderDao().getAll()
    }



    fun insertItem(item: NoOrderItem) = SamsApplication.getDB().noOrderDao().insert(item)
    fun countAll(): Int {
        return SamsApplication.getDB().noOrderDao().countAll()

    }
}