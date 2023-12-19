package com.fastservices.sams.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.fastservices.sams.data.entities.OutletLocal

@Dao
interface OutletLocalDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(outlet: OutletLocal)

    @Query("SELECT * FROM OUTLETLOCAL")
    fun getAll(): List<OutletLocal>

    @Query("DELETE  FROM OUTLETLOCAL")
    fun deleteAll()
}