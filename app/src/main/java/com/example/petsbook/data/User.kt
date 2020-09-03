package com.example.petsbook.data

import org.threeten.bp.LocalDate

data class User(
    var petId: Int? = null,
    var breedId: Int? = null,
    var gender: Gender? = null,
    var dob: LocalDate? = null,
    var name: String? = null,
    var email: String? = null,
    var password: String? = null
)


enum class Gender(val genderId:Int){
    MALE(1),FEMALE(2);

    companion object {
        fun fromGenderId(id: Int): Gender {
            return when (id) {
                MALE.genderId -> MALE
                FEMALE.genderId-> FEMALE
                else -> FEMALE
            }
        }
    }
}
