package com.example.petsbook.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
abstract class UserDao {

    @Query("SELECT * FROM UserEntity")
    abstract fun getAll(): List<UserEntity>

    @Query("SELECT * FROM UserEntity WHERE petId = :id")
    abstract fun getById(id: Long): UserEntity

    @Insert
    abstract fun insert(userEntity: UserEntity)

//    @Insert
//    fun insert(employee: UserEntity)
//
//    @Update
//    fun update(employee: UserEntity)
//
//    @Delete
//    fun delete(employee: UserEntity)

}