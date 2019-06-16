package com.fastservices.sams.data.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.fastservices.sams.data.entities.Channel
import com.fastservices.sams.data.entities.SubChannel

@Dao
interface ChannelDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllChannel(list: List<Channel>)


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllSubChannel(list: List<SubChannel>)

    @Query("SELECT * FROM CHANNEL")
    fun getAllChannel(): List<Channel>

    @Query("DELETE FROM CHANNEL")
    fun deleteAllChannel()

    @Query("DELETE FROM SUBCHANNEL")
    fun deleteAllSubChannel()

    @Query("SELECT * FROM SUBCHANNEL")
    fun getAllSubChannel(): List<SubChannel>

    @Query("SELECT name FROM SUBCHANNEL WHERE id = :id LIMIT 1")
    fun getSubChannelName(id: Int) : String
}