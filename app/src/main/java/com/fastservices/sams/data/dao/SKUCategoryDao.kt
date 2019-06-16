package com.fastservices.sams.data.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.fastservices.sams.data.entities.Category

@Dao
interface SKUCategoryDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(sections: List<Category>)

    @Query("SELECT * FROM CATEGORY")
    fun getAll(): List<Category>

    @Query("DELETE FROM CATEGORY")
    fun deleteAll()
}