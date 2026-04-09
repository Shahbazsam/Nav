package com.example.muzammil_chutiya.presentation.screen2

import androidx.annotation.DrawableRes
import com.example.muzammil_chutiya.R

data class Photo(
    val name : String,
    @DrawableRes
    val photo : Int
)


val photoList = listOf(
    Photo( name = "Chutiya" , photo = R.drawable.photo1),
    Photo(name = "Chutiya2" , photo = R.drawable.poto2),
    Photo(name = "Chutiya3" , photo = R.drawable.photo3),
    Photo(name = "Chutiya4" , photo = R.drawable.photo4),
    Photo(name = "Chutiya5" , photo = R.drawable.photo5),
    Photo(name = "Chutiya6" , photo = R.drawable.photo1),
    Photo(name = "Chutiya7" , photo = R.drawable.photo5),
)


