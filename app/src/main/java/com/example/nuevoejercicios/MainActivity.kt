
fun main(parametro: Array<String>)    {

    val valorA: Int
    val valorB: Int
    valorA = 100
    valorB = 400
    var resultado: Int
    resultado = valorA + valorB
    println("La suma de $valorA + $valorB es $resultado")
    resultado = valorA * valorB
    println("El producto de $valorA * $valorB es $resultado")


    print("Ingrese primer valor:")
    val valor1 = readLine()!!.toInt()
    print("Ingrese segundo valor:")
    val valor2 = readLine()!!.toInt()
    val suma = valor1 + valor2
    println("La suma de $valor1 y $valor2 es $suma")
    val producto = valor1 * valor2
    println("El producto de $valor1 y $valor2 es $producto")

    print("Ingrese la medida del lado del cuadrado: ")
    val lado = readLine()!!.toInt()
    val perimetro = lado * 4
    println("El perimetro del cuadrado es " + perimetro)
 //    println("El perimetro del cuadrado es $perimetro")
    print("Ingrese el precio de un producto: ")
    val precio = readLine()!!.toDouble()
    print("Ingrese la cantidad de productos: ")
    val cantidad = readLine()!!.toInt()
    val total = (precio * cantidad)
    println("El total a pagar es $total")

    print("Ingrese un numero: ")
    val numero1 = readLine()!!.toInt()
    print("Ingrese un numero: ")
    val numero2 = readLine()!!.toInt()
    val resultado1 = (numero1 + numero2)
    println("el resultado de la primer suma es $resultado1")

    print("Ingrese un numero: ")
    val numero3 = readLine()!!.toInt()
    print("Ingrese un numero: ")
    val numero4 = readLine()!!.toInt()

    val resultado2 = (numero3 * numero4)
    println("el resultado de la suma de la 2 suma es $resultado2")

    val resultado3 = (numero1 + numero2 + numero3 + numero4)
    println("el resultado de la suma de todos los numeros  es $resultado3")

    val resultado4 =  (numero1 + numero2 + numero3 + numero4) / 4
    println("el promedio de todos los numeros es  $resultado4")

    //IF - CONDICIONAL SIMPLE
    print("Ingrese el sueldo del empleado: ")
    val sueldo = readLine()!!.toDouble()
    if (sueldo > 3000)
        println("Debe pagar impuesto ")

    // IF CONDICIONAL COMPUESTO ELSE

    if ( valor1 > valor2)
    println("El mayor valor es $valor1" )
    else
    println("El mayor valor es $valor2")

    if (valor1 < valor2){
        val suma = (valor1 + valor2)
        val resta = (valor1 - valor2)
        println("La suma es $suma")
        println("La resta es $resta")
    } else {
        val producto = (valor1 * valor2)
        val division = (valor1 / valor2)
        println("El producto es $producto")
        println("La division es $division")

        print("Ingrese nota de Matematicas ")
        var matematicas = readLine()!!.toInt()
        print("Ingrese nota de Historia ")
        var historia = readLine()!!.toInt()
        print("Ingrese nota de Lengua ")
        var lengua = readLine()!!.toInt()
        val promedio = (matematicas + historia + lengua) / 3
        if ( promedio >=  7){
            println("Promocionando")
        }else if (promedio >=4)
            println("Regular")
        else {
            println("no promocionaste")
        }
        //val estado = if(promedio >=7)"Promocionado" else if (promedio >=4)"Regular" else (promedio >=4)"No promociona"

        print("Ingrese su numero ")
        var digito = readLine()!!.toInt()
        if ( digito > 9) {
            //if (digito < 10)
            println("Su numero tiene 2 digitos")

    }  else {
            println("Su numero tiene 1 solo digito")
        }
}
    print("Ingrese un valor entero:")
    val valor = readLine()!!.toInt()
    if (valor == 0)
        println("Se ingresó el cero")
    else
        if (valor > 0)
            println("Se ingresó un valor positivo")
        else
            println("Se ingresó un valor negativo")

//Realizar un programa que pida cargar una fecha cualquiera, luego verificar si dicha fecha corresponde a Navidad.

    print("Ingrese Dia ")
    val dia = readLine()!!.toInt()
    print("Ingrese Mes ")
    val mes = readLine()!!.toInt()
    print("Ingrese Año ")
    val año = readLine()!!.toInt()
    val fecha = ("$dia - $mes - $año")
    if (dia == 31 || mes == 12 )
        println("$fecha es navidad")
    else(println("no es navidad"))

// Se ingresan tres valores por teclado, si todos son iguales calcular el cubo del número y mostrarlo.

    var = cubo (numero1 * numero2 * numero3)
        if (numero1 == numero2  || == numero3) * 3
    println("El cubo es  ")
    else("No son iguales no se calcula el cubo ")





    // Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor de ellos.


    print("Ingrese primer valor:")
    val digito1 = readLine()!!.toInt()
    print("Ingrese segundo valor:")
    val digito2 = readLine()!!.toInt()
    print("Ingrese tercer valor:")
    val digito3 = readLine()!!.toInt()
    if (digito1 > digito2)
        if (digito1 > digito3)
            print(digito1)
        else
            print(digito3)
    else
        if (digito2 > digito3)
            print(digito2)
        else
            print(digito3)

}
