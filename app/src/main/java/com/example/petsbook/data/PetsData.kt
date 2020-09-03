package com.example.petsbook.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PetsData (
    val pet: String,
    val petId: Int,
    val petImage: Int) : Parcelable
