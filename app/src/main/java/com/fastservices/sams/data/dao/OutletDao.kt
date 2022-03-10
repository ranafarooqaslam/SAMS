package com.fastservices.sams.data.dao

import android.arch.persistence.room.*
import com.fastservices.sams.data.entities.Outlet

@Dao
interface OutletDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(outlet: List<Outlet>)

    @Update
    fun update(outlet: List<Outlet>)

    @Query("SELECT * FROM OUTLET ORDER BY outletName")
    fun getAll(): List<Outlet>



    @Query("DELETE  FROM OUTLET")
    fun deleteAll()

    @Query("SELECT COUNT(*) FROM OUTLET")
    fun countAll(): Int
}