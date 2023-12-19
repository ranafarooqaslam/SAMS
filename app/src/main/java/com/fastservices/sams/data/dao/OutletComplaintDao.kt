package com.fastservices.sams.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.fastservices.sams.data.entities.Channel
import com.fastservices.sams.data.entities.ComplaintReason
import com.fastservices.sams.data.entities.OutletComplaint
import com.fastservices.sams.data.entities.SubChannel

@Dao
interface OutletComplaintDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(list: List<OutletComplaint>)

    @Query("SELECT * FROM OutletComplaint")
    fun getAllComplaintReasons(): List<OutletComplaint>

    @Query("Delete FROM OutletComplaint")
    fun deleteAll()

}