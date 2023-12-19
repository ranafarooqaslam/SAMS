package com.fastservices.sams.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
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