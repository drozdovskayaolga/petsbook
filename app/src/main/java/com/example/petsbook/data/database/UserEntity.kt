package com.example.petsbook.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.example.petsbook.data.Gender
import org.threeten.bp.LocalDate

@Entity
data class UserEntity(

    @PrimaryKey(autoGenerate = true)
    val userId: Int? = null,

    val petId:Int,

    val breedId:Int,

    val gender: Gender,

    val dob: LocalDate,

    val name: String,

    val email: String,

    val password: String
)


