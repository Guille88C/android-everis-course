package com.everis.myapplication.list

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ListModel(
    val title: String,
    val description: String
) : Parcelable