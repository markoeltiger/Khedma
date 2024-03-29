package com.mark.khedma.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.ComposeNavigator
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.mark.khedma.utils.Constants

@Composable
fun SetUpNavGraph(startDestination: String,navController: NavHostController){
NavHost(navController = navController, startDestination =startDestination ){
    authenticationRoute()
    homeRoute()
    writeRoute()
}
}
fun NavGraphBuilder.authenticationRoute(){
    composable(route=Screen.Authentication.route){
    }
}
fun NavGraphBuilder.homeRoute(){
    composable(route=Screen.Home.route){
    }
}
fun NavGraphBuilder.writeRoute(){
    composable(route=Screen.Write.route, arguments = listOf(navArgument(name = Constants.WRITE_SCREEN_ARGUMENT_KEY){
        type= NavType.StringType
        nullable=true
        defaultValue=null
    })){

    }
}