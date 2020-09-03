package com.example.petsbook.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class BreedsData (
    val petId: Int,
    val breedId: Int,
    val breed: String) : Parcelable