package com.example.miprimeraapp.models

import com.squareup.moshi.Json

data class Vehiculo(
    @field:Json("id")
    val id: Int,

    @field:Json("marca")
    val marca:String,

    @field:Json("modelo")
    val modelo:String,

    @field:Json("color")
    val color:String,

    @field:Json("imagenUrl")
    val imagenUrl:String,

    @field:Json("cilindrada")
    val cilindrada:Int
)

data class VehiculoState(
    val vehiculos: List<Vehiculo> = emptyList(),
    val id: Int? = null,
    val marca:String = "",
    val modelo:String = "",
    val color:String = "",
    val cilindrada:String = "",
    val imagenUrl:String = ""
)



data class VehiculoAgregar(
    @field:Json("marca")
    val marca:String,

    @field:Json("modelo")
    val modelo:String,

    @field:Json("color")
    val color:String,

    @field:Json("imagenUrl")
    val imagenUrl:String,

    @field:Json("cilindrada")
    val cilindrada:Int
)