package com.fastservices.sams.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.fastservices.sams.data.entities.AppSettingValueClass
@Dao
interface AppSettingValueDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(promotionValues: AppSettingValueClass)

    @Query("SELECT * FROM AppSetting")
    fun getAll():List<AppSettingValueClass>

    @Query("DELETE FROM AppSetting")
    fun deleteAll()
}