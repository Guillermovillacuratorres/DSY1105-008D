//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val autos = listOf("Nissan", "Honda", "Citroen")
    val frutas = mutableListOf("Manzana", "Platano", "Naranja", "Manzana")


    frutas.add("Durazno")

    //println(autos)
    //println(frutas)

    for (i in frutas) {
        //  println(i)
    }


    frutas.forEach { println(it) }


    var filtroFruta = frutas.filter { it == "Manzana" }

    println(filtroFruta)


    var filtroFru = frutas.find { it == "Manzana" }
    println(filtroFru)

    var filtroFrutasFirst = frutas.first() { it == "Manzana" }

    var filtroFrutas = frutas.last() { it == "Manzana" }


    var numeros = listOf(2, 3, 4, 5, 6, 7, 8, 9)

    var agrupacionParesImpares = numeros.groupBy {
        if (it % 2 == 0) "PAR" else "IMPAR"
    }

    println(agrupacionParesImpares)

    var ordenar = numeros.sorted()
    var ordenar2 = numeros.sortedDescending()


    var ordenarString = frutas.sortedBy { it.length }


    println(ordenarString)


    var mayu = frutas.map { it.uppercase() }

    println(mayu)

    var redu = numeros.reduce { ac, num -> ac * num  }
    println(redu)

    println(autos[0])

    println(autos.size)


    val edades = mapOf(
        "Juan" to 25,
        "Pedro" to 50,
        "Diego" to 60
    )

    val autosDict = mutableMapOf(
        "Chevrolet" to 500,
        "Honda" to 1000,
        "Citroen" to 1500
    )

    autosDict["Honda"] = 550

    println(autosDict)


    println(edades["Pedro"])


    println(edades.keys)
    println(edades.values)


    for(i in edades.values){
        println(i)
    }

    edades.forEach { (clave,valor) ->
        println("La clave es: $clave y el valor es: $valor")
    }



    try {
        println("Ingrese un numero: ")
        var n1 = readLine()?.toInt()
    }catch(e: NumberFormatException){
        println("Error: solo se permiten numeros.")
    }
    finally {
        println("Siempre se ejecuta")
    }


    fun dividir(n1:Int, n2:Int): Result<Int>{
        if(n2 == 0){
            return Result.failure(Exception("No se puede dividir por cero"))
        }else{
            return Result.success(n1/n2)
        }
    }



    var resultado = dividir(10,0)

    resultado.onSuccess { valor -> println("El resultado de la division es: $valor") }
        .onFailure { error -> println("Error:::: ${error.message}") }




    
}
