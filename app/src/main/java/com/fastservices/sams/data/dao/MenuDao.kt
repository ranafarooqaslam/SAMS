package com.fastservices.sams.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.fastservices.sams.data.entities.Menu

@Dao
interface MenuDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(items: List<Menu>)

    @Query("SELECT * FROM MENU ORDER BY androidMenuID")
     fun getAllItems(): List<Menu>
}