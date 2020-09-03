package com.example.petsbook.data.database.converters

import androidx.room.TypeConverter
import com.example.petsbook.data.Gender

class EnumTypeConverter {

    @TypeConverter
    fun toSessionEventType(value: Int): Gender {
        return Gender.fromGenderId(value)
    }

    @TypeConverter fun toInt(type: Gender): Int {
        return type.genderId
    }
}