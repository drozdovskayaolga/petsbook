package com.example.petsbook.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.petsbook.data.database.converters.DateTypeConverter
import com.example.petsbook.data.database.converters.EnumTypeConverter

@Database(entities = [UserEntity::class], version = 1)
@TypeConverters(DateTypeConverter::class, EnumTypeConverter::class)
abstract class UserDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}