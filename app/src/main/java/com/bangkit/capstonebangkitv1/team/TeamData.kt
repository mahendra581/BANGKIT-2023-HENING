package com.bangkit.capstonebangkitv1.team

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TeamData(
    val name: String,
    val photoUrl: String
) : Parcelable