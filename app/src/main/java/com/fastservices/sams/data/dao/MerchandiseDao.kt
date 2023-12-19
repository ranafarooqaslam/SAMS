package com.fastservices.sams.data.dao

import androidx.room.*
import com.fastservices.sams.data.entities.Channel
import com.fastservices.sams.data.entities.Merchandise
import com.fastservices.sams.data.entities.SubChannel

@Dao
interface MerchandiseDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(list: List<Merchandise>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(m: Merchandise)


    @Query("SELECT * FROM Merchandise")
    fun getAll(): List<Merchandise>

    @Query("DELETE FROM Merchandise")
    fun deleteAll()

}