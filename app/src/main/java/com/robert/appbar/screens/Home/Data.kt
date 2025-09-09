package com.robert.appbar.screens.Home

import androidx.annotation.DrawableRes

data class Data(
    @DrawableRes val image: Int,
    val title: String,
    val semiTitle: String,
    val description: String,
    val numberOfStars: Int
)