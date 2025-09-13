package com.robert.appbar.screens.Issues

import androidx.annotation.DrawableRes

data class DataIssues (
    @DrawableRes val image : Int,
    val title : String,
    val name : String,
    val time : String,
    val state : Boolean
)