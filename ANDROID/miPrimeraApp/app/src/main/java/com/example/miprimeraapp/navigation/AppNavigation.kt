package com.example.miprimeraapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController
import com.example.miprimeraapp.viewModel.ProductoViewModel
import com.example.miprimeraapp.views.InicioScreen
import com.example.miprimeraapp.views.LoginScreen
import com.example.miprimeraapp.views.ProductoScreen


@Composable
fun AppNavigation(viewModel: ProductoViewModel){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "inicio"
    )
    {
        composable("login"){
            LoginScreen(navController).login()
        }

        composable ("inicio"){
            InicioScreen(navController).inicio()
        }

        composable("productos") {
            ProductoScreen(navController, viewModel).pantallaProducto()
        }


    }
}