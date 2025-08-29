open class Vehiculo (val marca:String,val patente:String,val anio:Int, val color:String, var velocidad:Int){
    /*
    var marca: String = "";
    var patente:String = "";
    var anio:Int = 0;
    var color:String = "";


    constructor()

    constructor(marca: String, patente: String, anio: Int, color: String) {
        this.marca = marca
        this.patente = patente
        this.anio = anio
        this.color = color
    }
*/





    fun acelerar(){
        velocidad +=10
        velocidad = velocidad + 10
        println("El vehiculo está acelerando!!! -- Velocidad actual: $velocidad")

    }

    override fun toString(): String {
        return "Vehiculo(marca='$marca', patente='$patente', anio=$anio, color='$color', velocidad=$velocidad)"
    }

}