package com.angelaxd.lab62.ui.theme.navegation

sealed class AppScreens(val route: String){
    object viewConcerts: AppScreens("primera")
    object viewDetails: AppScreens("segunda")
    object viewFavorites: AppScreens("tercera")
    object viewProfile: AppScreens("cuarta")
    object viewInfo: AppScreens("quinta")


}
