package com.mark.khedma.navigation

import com.mark.khedma.utils.Constants

sealed class Screen (val route:String){
    object Authentication:Screen(route = "authentication_screen")
    object Home:Screen(route = "home_screen")
    object Write:Screen(route = "write_screen?${Constants.WRITE_SCREEN_ARGUMENT_KEY}={${Constants.WRITE_SCREEN_ARGUMENT_KEY}}")
    fun passDiaryId(diaryId:String) = "write_screen?${Constants.WRITE_SCREEN_ARGUMENT_KEY}=$diaryId"
}