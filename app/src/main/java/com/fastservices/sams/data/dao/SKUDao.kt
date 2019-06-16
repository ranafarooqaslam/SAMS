package com.fastservices.sams.data.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.fastservices.sams.data.entities.SKU
import com.fastservices.sams.modules.stockpositioning.SKUNameID

@Dao
interface SKUDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(sections: List<SKU>)

    @Query("SELECT * FROM SKU ORDER BY SKU_NAME")
    fun getAll(): List<SKU>

    @Query("SELECT * FROM SKU WHERE SKU_ID = :skuId")
    fun getAll(skuId: Int): List<SKU>

    @Query("DELETE FROM SKU")
    fun deleteAll()

//    @Query("SELECT SKU_NAME,SKU_ID,SKU_CODE FROM SKU ORDER BY SKU_NAME")
//    fun getAllSKUsNameId(): List<SKUNameID>

    @Query("SELECT * FROM SKU WHERE CATEGORY_ID = :catId")
    fun getAllForCategory(catId: Int): List<SKU>


}