package com.example.miprimeraapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController
import com.example.miprimeraapp.views.InicioScreen
import com.example.miprimeraapp.views.LoginScreen


@Composable
fun AppNavigation(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "login"
    )
    {
        composable("login"){
            LoginScreen(navController).login()
        }

        composable ("inicio"){
            InicioScreen(navController).inicio()
        }



    }
}