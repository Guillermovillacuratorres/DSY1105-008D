class Vehiculo {
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

    override fun toString(): String {
        return "Vehiculo(marca='$marca', patente='$patente', anio=$anio, color='$color')"
    }


}