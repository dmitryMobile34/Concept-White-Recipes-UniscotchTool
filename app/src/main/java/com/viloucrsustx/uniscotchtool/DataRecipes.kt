package com.viloucrsustx.uniscotchtool

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class DataRecipes (
    val image: Int,
    val title: String,
    val description: String
) : Parcelable

