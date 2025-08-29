//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //asd

    /*
    df
    sdf
    */



    /*
    println("Hola")
    println("Adios")

    var nombre = "Pedro";
    nombre = "90";
    println(nombre)

    val numero = 10;
    //numero = 9;

    while(true){

        println("--- MENU ---")
        println("1 - Sumar")
        println("2 - Restar")
        println("3 - Multiplicar")
        println("4 - Dividir")
        println("5 - Salir")
        var opcion = 0
        try {
            println("seleccione una opción 1 - 5: ")
            opcion = readLine()?.toInt()!!;
        }catch (e: NumberFormatException){
             println("ERROR: Solo puede ingresar numeros enteros")
            continue
        }
        if(opcion == 1){
            var numeroUno = readLine()?.toInt();
            var numeroDos = readLine()?.toInt();
            val suma = numeroUno!! + numeroDos!!;
            println("La suma de los dos numeros es:  $suma")
        }
        else if(opcion == 2){
            var numeroUno = readLine()?.toInt();
            var numeroDos = readLine()?.toInt();
            val resta = numeroUno!! - numeroDos!!;
            println("La resta de los dos numeros es:  $resta")
        }else if(opcion  == 3){
            var numeroUno = readLine()?.toInt();
            var numeroDos = readLine()?.toInt();
            val multiplicacion = numeroUno!! * numeroDos!!;
            println("La multiplicacion de los dos numeros es:  $multiplicacion")
        }else if(opcion == 4){
            var numeroUno = readLine()?.toInt();
            var numeroDos = readLine()?.toInt();
            val division = numeroUno!! / numeroDos!!;
            println("La division de los dos numeros es:  $division")
        }else if(opcion == 5){
            println("Saliendo!!")
            break
        }else{
            println("Opcion no valida!!!!!!!")
        }

    }


*/



/*
    var uno = readLine()?.toInt()
    var dos = readLine()?.toInt()

    if(uno != null && dos != null){
        print(uno + dos)
    }
  */

/*
    var autoUno = Vehiculo()
    autoUno.color = "Verde"

    var autoDos = Vehiculo(anio = 2021, color = "Rojo", marca = "Honda", patente = "abcd14")

    println(autoDos)

*/


    var swift = Auto(3,true,"Rojo",2020,"abcd-15","Suzuki",30);

    swift.acelerar()

    println(swift)


}