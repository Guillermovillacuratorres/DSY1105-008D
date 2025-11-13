package com.example.miprimeraapp.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.miprimeraapp.viewModel.VehiculoViewModel

class AgregarVehiculoScreen (private val navController: NavHostController? = null){




    @Composable
    fun agregarVehiculo(){


        val vehiculoViewModel = viewModel<VehiculoViewModel>()

        val marca = vehiculoViewModel.state.marca
        val modelo = vehiculoViewModel.state.modelo
        val color = vehiculoViewModel.state.color
        val cilindrada = vehiculoViewModel.state.cilindrada
        val imagenUrl = vehiculoViewModel.state.imagenUrl


        Column (modifier = Modifier.fillMaxSize().padding(top = 45.dp, bottom = 30.dp, start = 20.dp, end = 20.dp),
            verticalArrangement = Arrangement.Top
        )

        {

            Text(text = "Agregar vehiculo", fontSize = 40.sp)


            Spacer(Modifier.height(16.dp))


            OutlinedTextField(
                value = marca,
                onValueChange = {vehiculoViewModel.cambiarMarca(it)},
                label = {Text("Marca")},
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(Modifier.height(16.dp))




            OutlinedTextField(
                value = modelo,
                onValueChange = {vehiculoViewModel.cambiarModelo(it)},
                label = {Text("Modelo")},
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(Modifier.height(16.dp))





            OutlinedTextField(
                value = color,
                onValueChange = {vehiculoViewModel.cambiarColor(it)},
                label = {Text("Color")},
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(Modifier.height(16.dp))





            OutlinedTextField(
                value = cilindrada,
                onValueChange = {vehiculoViewModel.cambiarCilindrada(it)},
                label = {Text("Cilindrada")},
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(Modifier.height(16.dp))





            OutlinedTextField(
                value = imagenUrl,
                onValueChange = {vehiculoViewModel.cambiarImagen(it)},
                label = {Text("Imagen URL")},
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(Modifier.height(16.dp))



            Button(
                onClick = {vehiculoViewModel.agregarVehiculo()},
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Agregar vehiculo")
            }





        }
    }





}



@Preview(showBackground = true)
@Composable
fun verAgregar(){
    AgregarVehiculoScreen().agregarVehiculo()
}