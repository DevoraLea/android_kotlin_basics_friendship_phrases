package com.example.motivationapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(@StringRes val idResource:Int,
                       @DrawableRes val imageResource:Int)
