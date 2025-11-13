package com.example.miprimeraapp.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.miprimeraapp.models.VehiculoAgregar
import com.example.miprimeraapp.models.VehiculoState
import com.example.miprimeraapp.repository.VehiculoService
import kotlinx.coroutines.launch

class VehiculoViewModel : ViewModel(){

    private val vehiculoService = VehiculoService.instance

    var state by mutableStateOf(VehiculoState())

    init {
        obtenerVehiculos()
    }


    fun cambiarMarca(nuevaMarca:String){
        state = state.copy(marca = nuevaMarca)
    }
    fun cambiarModelo(nuevaModelo:String){
        state = state.copy(modelo = nuevaModelo)
    }
    fun cambiarColor(nuevoColor:String){
        state = state.copy(color = nuevoColor)
    }
    fun cambiarCilindrada(nuevaCilindrada:String){
        state = state.copy(cilindrada = nuevaCilindrada)
    }
    fun cambiarImagen(nuevaImagenUrl:String){
        state = state.copy(imagenUrl = nuevaImagenUrl)
    }



    fun obtenerVehiculos(){
        viewModelScope.launch {
            try {
                val vehiculosObtenidos =  vehiculoService.obtenerVehiculos()
                state = state.copy(vehiculos = vehiculosObtenidos)
            }catch (e: Exception){

            }
        }
    }




    fun agregarVehiculo(){
        viewModelScope.launch {
            try {
                val cilindrada = state.cilindrada.toIntOrNull() ?: 0

                val autoNuevo = VehiculoAgregar(
                    marca = state.marca,
                    modelo = state.modelo,
                    color = state.color,
                    imagenUrl = state.imagenUrl,
                    cilindrada = cilindrada
                )

                vehiculoService.agregarVehiculo(autoNuevo)



                state = state.copy(
                    marca = "",
                    modelo = "",
                    color = "",
                    cilindrada = "",
                    imagenUrl = ""
                )



            }catch (e: Exception){

            }
        }
    }
}