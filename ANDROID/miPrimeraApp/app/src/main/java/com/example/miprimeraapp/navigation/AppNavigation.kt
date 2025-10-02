package com.example.miprimeraapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController
import com.example.miprimeraapp.views.inicio.InicioScreen
import com.example.miprimeraapp.views.login.LoginScreen


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