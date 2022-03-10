package com.fastservices.sams.data.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
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