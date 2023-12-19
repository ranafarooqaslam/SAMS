package com.fastservices.sams.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
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