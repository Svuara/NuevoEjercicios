
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




}

