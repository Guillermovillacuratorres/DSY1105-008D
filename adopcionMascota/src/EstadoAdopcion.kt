sealed class EstadoAdopcion {

    data class Disponible(val nombre:String, val edad:Int, val raza:String) : EstadoAdopcion()
    data class Adoptado(val nombre:String, val fechaAdopcion:String): EstadoAdopcion()
    object EnProceso:EstadoAdopcion()
    data class NoDisponible(val motivo:String, val fechaConsulta:String):EstadoAdopcion()


    fun buscarMascota(id:Int):EstadoAdopcion{
        return when(id){
            1 -> EstadoAdopcion.Disponible("Lunita",2,"Gatuno")
            2 -> EstadoAdopcion.Adoptado("Firulais","05-09-2025")
            3 -> EstadoAdopcion.NoDisponible("La mascota se encuentra enfermo","04-09-2025")
            else -> EstadoAdopcion.EnProceso
        }
    }




}