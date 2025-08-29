

class Auto (val cantidadPuertas:Int,val aireAcondicionado: Boolean, color:String, anio:Int, patente:String, marca:String,velocidad:Int): Vehiculo(marca,patente,anio, color,velocidad){





    override fun toString(): String {
        return "Auto(aireAcondicionado=$aireAcondicionado, cantidadPuertas=$cantidadPuertas) ${super.toString()}"
    }
}


