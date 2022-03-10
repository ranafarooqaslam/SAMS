package com.fastservices.sams.data.database

import android.arch.persistence.room.TypeConverter
import java.util.*


class DateTypeConverters {

    @TypeConverter
    fun fromTimestamp(value: Long?): Date? {
        return if (value == null) null else Date(value)
    }

    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? {
        if (date == null)
            return null
        else
            return date.time
    }
}