package com.fastservices.sams.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.fastservices.sams.data.entities.NoOrderReason

@Dao
interface NoOrderReasonDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(list: List<NoOrderReason>)

    @Query("SELECT * FROM NoOrderReason")
    fun getAllReasons(): List<NoOrderReason>

    @Query("DELETE FROM NoOrderReason")
    fun deleteAll()
}