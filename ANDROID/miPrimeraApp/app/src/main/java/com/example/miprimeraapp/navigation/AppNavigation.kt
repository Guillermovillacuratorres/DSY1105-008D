package com.example.miprimeraapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController
import com.example.miprimeraapp.viewModel.ProductoViewModel
import com.example.miprimeraapp.viewModel.VehiculoViewModel
import com.example.miprimeraapp.views.AgregarVehiculoScreen
import com.example.miprimeraapp.views.CamaraScreen
import com.example.miprimeraapp.views.InicioScreen
import com.example.miprimeraapp.views.LoginScreen
import com.example.miprimeraapp.views.ProductoScreen
import com.example.miprimeraapp.views.VibracionScreen


@Composable
fun AppNavigation(viewModel: ProductoViewModel, vehiculoViewModel: VehiculoViewModel){
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
            InicioScreen(navController,vehiculoViewModel).inicio()
        }

        composable("productos") {
            ProductoScreen(navController, viewModel).pantallaProducto()
        }

        composable ("camara"){
            CamaraScreen(navController).camara()
        }

        composable ("vibrar"){
            VibracionScreen(navController).BotonVibrar()
        }

        composable ("agregarVehiculo"){
            AgregarVehiculoScreen().agregarVehiculo()
        }


    }
}