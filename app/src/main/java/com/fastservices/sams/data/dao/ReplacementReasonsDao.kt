package com.fastservices.sams.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.fastservices.sams.data.entities.Channel
import com.fastservices.sams.data.entities.ComplaintReason
import com.fastservices.sams.data.entities.ReplacementReason
import com.fastservices.sams.data.entities.SubChannel

@Dao
interface ReplacementReasonsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(list: List<ReplacementReason>)

    @Query("SELECT * FROM ReplacementReason")
    fun getAllReasons(): List<ReplacementReason>

    @Query("DELETE FROM ReplacementReason")
    fun deleteAll()

}