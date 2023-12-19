package com.fastservices.sams.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.fastservices.sams.data.entities.Channel
import com.fastservices.sams.data.entities.Section
import com.fastservices.sams.data.entities.Locality

@Dao
interface SectionDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(sections: List<Section>)

    @Query("SELECT * FROM SECTIONS")
    fun getAll(): List<Section>

    @Query("DELETE FROM SECTIONS")
    fun deleteAll()
    

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllLocality(list: List<Locality>)
    

    @Query("DELETE FROM LOCALITY")
    fun deleteAllLocality()

    @Query("SELECT * FROM LOCALITY")
    fun getAllLocality(): List<Locality>

    @Query("SELECT routeName FROM LOCALITY WHERE routeID = :id LIMIT 1")
    fun getLocalityName(id: Int) : String
}