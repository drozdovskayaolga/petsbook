package com.example.petsbook.data.database

import android.app.Application
import android.content.Context
import androidx.room.Room

object DatabaseDatasource {

    fun getDatabase(context: Context): UserDatabase {
        return Room.databaseBuilder(
            context,
            UserDatabase::class.java, "appdb.db"
        ).allowMainThreadQueries().build()

    }

}