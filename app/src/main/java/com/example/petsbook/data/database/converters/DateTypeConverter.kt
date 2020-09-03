package com.example.petsbook.data.database.converters

import androidx.room.TypeConverter
import org.threeten.bp.Instant
import org.threeten.bp.LocalDate
import org.threeten.bp.ZoneId


class DateTypeConverter {

    @TypeConverter
    fun fromTimestamp(value: Long?): LocalDate? {
        return if (value == null) null else Instant.ofEpochSecond(value).atZone(ZoneId.systemDefault()).toLocalDate()
    }

    @TypeConverter
    fun dateToTimestamp(date: LocalDate?): Long? {
        return (if (date == null) null else date.atStartOfDay().atZone(ZoneId.systemDefault()).toEpochSecond())!!.toLong()
    }
}