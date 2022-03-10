package com.fastservices.sams.data.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
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