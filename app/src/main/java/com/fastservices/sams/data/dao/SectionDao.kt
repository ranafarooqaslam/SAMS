package com.fastservices.sams.data.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.fastservices.sams.data.entities.Section

@Dao
interface SectionDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(sections: List<Section>)

    @Query("SELECT * FROM SECTIONS")
    fun getAll(): List<Section>

    @Query("DELETE FROM SECTIONS")
    fun deleteAll()
}