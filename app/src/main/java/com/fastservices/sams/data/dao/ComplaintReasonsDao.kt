package com.fastservices.sams.data.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.fastservices.sams.data.entities.Channel
import com.fastservices.sams.data.entities.ComplaintReason
import com.fastservices.sams.data.entities.SubChannel

@Dao
interface ComplaintReasonsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(list: List<ComplaintReason>)

    @Query("SELECT * FROM ComplaintReason")
    fun getAllComplaintReasons(): List<ComplaintReason>

    @Query("DELETE FROM ComplaintReason")
    fun deleteAll()

}