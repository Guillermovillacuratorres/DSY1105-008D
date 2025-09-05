sealed class EstadoAdopcion {

    data class Disponible(val nombre: String) : EstadoAdopcion()
    data class Adoptado(val nombre:String):EstadoAdopcion()
    data class NoDisponible(val motivo:String): EstadoAdopcion()

    fun buscarMascota(id:Int): EstadoAdopcion{
        return when (id){
            1 -> EstadoAdopcion.Disponible("Firulais")
            2 -> EstadoAdopcion.NoDisponible("Esta enfermo")
            3 -> EstadoAdopcion.Adoptado("Rex")
        }
    }


}