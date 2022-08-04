
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
}

