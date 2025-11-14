package com.example.miprimeraapp.repository

import com.example.miprimeraapp.models.Vehiculo
import com.example.miprimeraapp.models.VehiculoAgregar
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface VehiculoService {
    companion object{
        val instance =
            Retrofit.Builder().baseUrl("https://dev.matiivilla.cl/dsy1105/")
                .addConverterFactory(MoshiConverterFactory.create())
                .client(OkHttpClient.Builder().build())
                .build().create(VehiculoService::class.java)
    }


    @GET("vehiculos")
    suspend fun obtenerVehiculos():List<Vehiculo>

    @GET("vehiculos/{id}")
    suspend fun buscarVehiculo(@Path("id") id:Int): Vehiculo

    @POST("vehiculos")
    suspend fun agregarVehiculo(@Body auto: VehiculoAgregar)

    @PUT("vehiculos")
    suspend fun actualizarVehiculo(@Body auto: Vehiculo)

    @DELETE("vehiculos/{id}")
    suspend fun eliminarVehiculo(@Path("id") id:Int)


}