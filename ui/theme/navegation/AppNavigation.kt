package com.angelaxd.lab62.ui.theme.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.angelaxd.lab62.ui.theme.ui.concerts.viewConcerts
import com.angelaxd.lab62.ui.theme.ui.details.viewDetails
import com.angelaxd.lab62.ui.theme.ui.favorites.viewFavorites
import com.angelaxd.lab62.ui.theme.ui.profile.viewProfile
import com.angelaxd.lab62.ui.theme.ui.concerts.viewInfo

@Composable
fun AppNavigation(){
    val navController = rememberNavController() //para que se mantenga
    NavHost(navController = navController, startDestination = AppScreens.viewConcerts.route ) {
        composable(route = AppScreens.viewConcerts.route){
            viewConcerts(navController)
        }
        composable(route = AppScreens.viewDetails.route){
            viewDetails(navController)
        }
        composable(route = AppScreens.viewFavorites.route){
            viewFavorites(navController)
        }
        composable(route = AppScreens.viewProfile.route){
            viewProfile(navController)
        }
        composable(route = AppScreens.viewInfo.route){
            viewInfo(navController)
        }

    }

}
