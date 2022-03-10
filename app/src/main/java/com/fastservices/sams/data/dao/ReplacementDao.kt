package com.fastservices.sams.data.dao

import android.arch.persistence.room.*
import com.fastservices.sams.data.entities.Replacement
import com.fastservices.sams.data.entities.StockPositionMaster

@Dao
interface ReplacementDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(replacement: Replacement): Long


    @Query("SELECT * FROM Replacement")
    fun getAll(): List<Replacement>

    @Query("DELETE FROM Replacement")
    fun deleteAll()

    @Delete
    fun delete(replacement: Replacement)

}