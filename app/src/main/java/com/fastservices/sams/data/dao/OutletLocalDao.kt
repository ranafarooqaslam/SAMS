package com.fastservices.sams.data.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
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