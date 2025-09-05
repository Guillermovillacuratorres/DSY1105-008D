import EstadoAdopcion.EnProceso.buscarMascota

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val mascotasBUscar = listOf(1,2,3,4)


    mascotasBUscar.forEach { id ->
        println("Buscando la mascota.....")

        val resultado =  buscarMascota(id)

        when(resultado){
            is EstadoAdopcion.Disponible -> {
                println("MASCOTA DISPONIBLE")
                println("NOMBRE: ${resultado.nombre} - EDAD: ${resultado.edad} - RAZA: ${resultado.raza}")
            }

            is EstadoAdopcion.Adoptado -> {
                println("MASCOTA ADOPTADA")
                println("NOMBRE: ${resultado.nombre} - FECHA: ${resultado.fechaAdopcion}")
            }

            is EstadoAdopcion.NoDisponible -> {
                println("MASCOTA NO DISPONIBLE")
                println("MOTIVO: ${resultado.motivo} - FECHA CONSULTA: ${resultado.fechaConsulta}")
            }

            EstadoAdopcion.EnProceso -> {
                println("EL PROCESO DE ADOPCION SE ENCUENTRA EN PROCESO....!!!!")
            }
        }

    }

}