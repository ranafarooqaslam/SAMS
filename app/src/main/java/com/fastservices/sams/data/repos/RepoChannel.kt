package com.fastservices.sams.data.repos

import com.fastservices.sams.SamsApplication
import com.fastservices.sams.data.entities.Channel
import com.fastservices.sams.data.entities.SubChannel
import com.fastservices.sams.data.models.PostBody
import com.fastservices.sams.data.models.UserInfo

class RepoChannel(val user: UserInfo) {

    private val SP_NAME = "spSelectCODESAndroid"
//    private val bodyChannel: PostBody<ParentID> = PostBody(SP_NAME, ParentID("46"))
    private val bodyChannel = mapOf<String,String>("ParentID" to "46","DistributorID" to user.DistributionID)
    private val bodySubChannel =  mapOf<String,String>("ParentID" to "49","DistributorID" to user.DistributionID)


    private suspend fun getChannelsRemote(): List<Channel> {
        return SamsApplication.getWebService().getChannel(PostBody(SP_NAME,bodyChannel)).await().dataReturned
    }

    private suspend fun getSubChannelsRemote(): List<SubChannel> {
        return SamsApplication.getWebService().getSubChannel(PostBody(SP_NAME,bodySubChannel)).await().dataReturned
    }

    fun getAllChannelsLocal() = SamsApplication.getDB().channelDao().getAllChannel()

    suspend fun syncDownChannels() {
        val channels = getChannelsRemote()
        val subChannel = getSubChannelsRemote()

        SamsApplication.getDB().channelDao().deleteAllChannel()
        SamsApplication.getDB().channelDao().deleteAllSubChannel()

        SamsApplication.getDB().channelDao().insertAllChannel(channels)
        SamsApplication.getDB().channelDao().insertAllSubChannel(subChannel)
    }

}