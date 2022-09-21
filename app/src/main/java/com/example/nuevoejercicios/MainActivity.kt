fun main(parametro: Array<String>)    {

    menu()
    val opcion = readLine()!!.toInt()

    when(opcion){
        1 -> buscarElMayor()
        2 -> piezas()
        3 -> notas()
        4 -> dia()
        5 -> positivoNegativo()
        6 -> promedioNotas()
        7 -> unDigitoOdos()
        8 -> impuestoSueldo()
        9 -> perimetroCuadrado()
        10 -> sumaYproducto()
        11 -> promedioAltura()
        12 -> empleados()
        13 -> serie11()
        14 -> seriex8()
        15 -> cargaDeLista()
        16 -> notasConFor()
        17 -> triangulosCantidad()
        18 -> sumaDeLosUltimos5()
        19 -> tablas()
        20 -> triangulosFormas()
        21 -> cantidadDeHijos()
        22 -> arreglosEnteros()

    }
}
fun menu(){
    println("Ingrese 1 para buscar el mayor")
    println("Ingrese 2 para buscar piezas")
    println("Ingrese 3 para buscar notas")
    println("Ingrese 4 para dia")
    println("Ingrese 5 para positivo - negativo")
    println("Ingrese 6 para promedio notas")
    println("Ingrese 7 para un digito o dos")
    println("Ingrese 8 para impuesto")
    println("Ingrese 9 para perimetro del cuadrado")
    println("Ingrese 10 para suma y producto")
    println("Ingrese 11 para promedio altura")
    println("Ingrese 12 sueldo empleados")
    println("Ingrese 13 para serie 11")
    println("Ingrese 14 para serie x 8 ")
    println("Ingrese 15 cual es la lista mayor")
    println("Ingrese 16 notas con for")
    println("Ingrese 17 para cantidad de triangulos")
    println("Ingrese 18 para sumar los ultimos 5")
    println("Ingrese 19 para tablas")
    println("Ingrese 20 triangulos formas")
    println("Ingrese 21 cantidad de hijos")
    println("Ingrese 22 Arreglo entero")



}
//funciones

fun precioYcantidad(){
    print("Ingrese el precio de un producto: ")
    val precio = readLine()!!.toDouble()
    print("Ingrese la cantidad de productos: ")
    val cantidad = readLine()!!.toInt()
    val total = (precio * cantidad)
    println("El total a pagar es $total")
}

fun sumaYproducto(){
    print("Ingrese primer valor:")
    val valor1 = readLine()!!.toInt()
    print("Ingrese segundo valor:")
    val valor2 = readLine()!!.toInt()
    val suma = valor1 + valor2
    println("La suma de $valor1 y $valor2 es $suma")
    val producto = valor1 * valor2
    println("El producto de $valor1 y $valor2 es $producto")
}

fun perimetroCuadrado(){
    print("Ingrese la medida del lado del cuadrado: ")
    val lado = readLine()!!.toInt()
    val perimetro = lado * 4
    println("El perimetro del cuadrado es $perimetro")
}

fun impuestoSueldo(){
    print("Ingrese el sueldo del empleado: ")
    val sueldo = readLine()!!.toDouble()
    if (sueldo > 3000)
        println("Debe pagar impuesto ")
}

fun unDigitoOdos(){
    print("Ingrese su numero ")
    var digito = readLine()!!.toInt()
    if ( digito > 9) {
        //if (digito < 10)
        println("Su numero tiene 2 digitos")
    } else {
        println("Su numero tiene 1 solo digito")
    }
}

fun promedioNotas(){
    print("Ingrese nota de Matematicas ")
    var matematicas = readLine()!!.toInt()
    print("Ingrese nota de Historia ")
    var historia = readLine()!!.toInt()
    print("Ingrese nota de Lengua ")
    var lengua = readLine()!!.toInt()
    val promedio = (matematicas + historia + lengua) / 3
     if ( promedio >=  7){
        println("Promocionando")
     }else if (promedio >=4) {
         println("Regular")
     } else {
        println("no promocionaste")
     }
}
fun positivoNegativo(){
    print("Ingrese un valor entero:")
    val valor = readLine()!!.toInt()
    if (valor == 0)
        println("Se ingresó el cero")
    else if (valor > 0)
        println("Se ingresó un valor positivo")
        else println("Se ingresó un valor negativo")
}

//Realizar un programa que pida cargar una fecha cualquiera, luego verificar si dicha fecha corresponde a Navidad.
fun dia(){
    print("Ingrese Dia ")
    val dia = readLine()!!.toInt()
    print("Ingrese Mes ")
    val mes = readLine()!!.toInt()
    print("Ingrese Año ")
    val año = readLine()!!.toInt()
    val fecha = ("$dia - $mes - $año")
    if (dia == 31 && mes == 12 )
        println("$fecha es navidad")
    else(println("no es navidad"))
}

// Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor de ellos.
fun buscarElMayor() {
    print("Ingrese primer valor:")
    val digito1 = readLine()!!.toInt()
    print("Ingrese segundo valor:")
    val digito2 = readLine()!!.toInt()
    print("Ingrese tercer valor:")
    val digito3 = readLine()!!.toInt()
    if (digito1 > digito2) {
        if (digito1 > digito3)
            print(digito1)
        else
            print(digito3)
    }
    else if (digito2 > digito3){
        print(digito2)
    }
    else {
        print(digito3)
    }
}

fun piezas() {
    println("Cuantas piezas procesará:")
    val n = readln().toInt()
    var acumulador = 1
    var cantidadCaños = 0
    while (acumulador <= n) {
        print("Ingrese la medida de la pieza:")
        val largo = readln().toDouble()
        if (largo >= 1.20 && largo <= 1.30)
            cantidadCaños = cantidadCaños + 1
        acumulador = acumulador + 1;
    }
    println("La cantidad de piezas aptas son: $cantidadCaños")
}

// Escribir un programa que solicite ingresar 10 notas de alumnos
// y nos informe cuántos tienen notas mayores o iguales a 7 y cuántos menores.
fun notas() {
    var vueltas = 1
    var alumnosCon7OMas = 0
    var alumnosConMenosDe7 = 0

    while (vueltas <=10) {
        println("Ingrese sus notas: ")
        var nota = readln().toInt()

        if (nota >= 7) {
            alumnosCon7OMas++
        } else {
            alumnosConMenosDe7 = alumnosConMenosDe7 + 1
        }
        vueltas = vueltas + 1
    }

    println("cantidad de alumnos con 7 o mas son $alumnosCon7OMas")
    println("cantidad de alumnos con menos 7 son $alumnosConMenosDe7")

}

fun promedioAltura() {
    var alturaVuelta = 1
    var sumaAltura = 0.0

    println("Ingrese el numero de cuantas personas se van a medir: ")
    var cantidadDePersonas = readln().toInt()

    while (alturaVuelta <= cantidadDePersonas) {
        println("Ingrese la altura de las persona: ")
        var alturaPersona = readln().toDouble()
        sumaAltura = sumaAltura + alturaPersona
        alturaVuelta = alturaVuelta + 1
    }
    var promedioAltura = sumaAltura / cantidadDePersonas
    println("la altura promedio de las personas ingresadas son $promedioAltura")
}

fun empleados() {
    var sueldoVueltas = 1
    var sueldosHastaTrecientos = 0
    var sueldosMasDeTrecientos = 0
    var totalSueldos = 0

    println("Ingrese la cantidad de empleados: ")
    var empleados = readln().toInt()

    while (sueldoVueltas <= empleados) {
        println("Ingrese el sueldo de los empleados: ")
        var sueldos = readln().toInt()
        if (sueldos <= 300) {
            sueldosHastaTrecientos = sueldosHastaTrecientos + 1
        }else {
            sueldosMasDeTrecientos = sueldosMasDeTrecientos + 1
        }
        sueldoVueltas = sueldoVueltas + 1
        totalSueldos = sueldos + totalSueldos
    }
    println("los empleados que cobran de $100 a $300 son:$sueldosHastaTrecientos ")
    println("los empleados que cobran mas de $300 son: $sueldosMasDeTrecientos")
    println("el total de sueldos es $totalSueldos")
}

fun serie11(){
    var valorSerie = 0
    var serieVuelta = 1
     while ( serieVuelta <= 25){
         valorSerie = valorSerie + 11
         println("$valorSerie")
         serieVuelta = serieVuelta + 1
     }
}

fun seriex8(){
    var valorSerie8 = 0
    while (valorSerie8 <= 500) {
        valorSerie8 = valorSerie8 + 8
        println("$valorSerie8")
    }
}
fun cargaDeLista(){
    var sumaListaA = 0
    var vueltaLista = 1

    while (vueltaLista <= 5){
        println("Ingrese valores lista A: ")
        var listaA = readln().toInt()
        sumaListaA = sumaListaA + listaA
        vueltaLista = vueltaLista + 1
    }
    var sumaListaB = 0
    vueltaLista = 1
    while(vueltaLista <= 5){
        println("Ingrese valores lista B: ")
        var listaB = readln().toInt()
        sumaListaB = sumaListaB + listaB
        vueltaLista = vueltaLista + 1
    }
    if (sumaListaA > sumaListaB){
        println("la lista mayor es lista A con un total de $sumaListaA")
    } else if(sumaListaB > sumaListaA) {
        println("La lista mayor es lista B con un total de $sumaListaB")
    }
    else { println("las listas son iguales")
    }
}

fun notasConFor(){
    var aprobados = 0
    var reprobados = 0
    for(i in 1..10) {
        print("Ingrese nota:")
        val nota = readln().toInt()
        if (nota >= 7)
            aprobados++
        else
            reprobados++
    }
    println("Cantidad de alumnos con notas mayores o iguales a 7: $aprobados")
    println("Cantidad de alumnos con notas menores a 7: $reprobados")
}

fun triangulosCantidad(){
    var acumuladorDeSuperficie =0

    print("Cuantos triángulos procesará:")
    val cantidadDeTriangulos = readln().toInt()
    for (i in 1..cantidadDeTriangulos){
        print("Ingrese el valor de la base:")
        val base = readln().toInt()
        print("Ingrese el valor de la altura:")
        val altura = readln().toInt()
        val superficie = base * altura / 2
        println("La superficie es de $superficie")
        if (superficie > 12)
        acumuladorDeSuperficie + 117
    }
    print("La cantidad de triángulos con superficie superior a 12 son: $acumuladorDeSuperficie")
}

fun sumaDeLosUltimos5(){
    var sumaUltimos5 = 0
    for (i in 1..10){
        print("Ingrese los valores a sumar: ")
        val valorUltimos5 = readln().toInt()
            if (i > 5)
            sumaUltimos5 = sumaUltimos5 + valorUltimos5

    }
    println("La suma de los ultimos 5 son: $sumaUltimos5")
}
//no entiendo valor tablas
fun tablas(){
    print("Ingrese el numero para multiplicar: ")
    val valorAmultiplicar = readln().toInt()
    for (i in valorAmultiplicar..valorAmultiplicar*12 step valorAmultiplicar){
        println(i)

    }
}

fun triangulosFormas(){
    var cantidadTriangulos1 = 0
    var cantidadTriangulos2 = 0
    var cantidadTriangulos3 = 0
    print("Ingrese la cantidad de triángulos:")
    val cantidadTriangulos = readln().toInt()
    for (i in 1..cantidadTriangulos){
        print("Ingrese lado 1:")
        val lado1 = readln().toInt()
        print("Ingrese lado 2:")
        val lado2 = readln().toInt()
        print("Ingrese lado 3:")
        val lado3 = readln().toInt()
        when {
            lado1 == lado2 && lado1 == lado3 -> {
                println("es un triangulo equilatero")
                cantidadTriangulos1++
            }
            lado1 == lado2 || lado1 == lado3 || lado2 == lado3 -> {
                println("es un isosceles")
                cantidadTriangulos2++
            }
            else -> {
                println("Es un escaleno")
                cantidadTriangulos3++
            }


        }
        println("Cantidad de triángulos equilateros: $cantidadTriangulos1")
        println("Cantidad de triángulos isósceles: $cantidadTriangulos2")
        println("Cantidad de triángulos escalenos: $cantidadTriangulos3")

    }


}

fun cantidadDeHijos(){
    var cantidadDeHijos0 = 0
    var cantidadDeHijos1 = 0
    var cantidadDeHijos2 = 0

    for (i in 1..10){
        print("Ingrese la cantidad de hijos:")
        val numeroHijos = readln().toInt()
        when {
            numeroHijos == 0 ->{
                println("no tiene hjos")
                cantidadDeHijos0++
            }
            numeroHijos == 1 ->{
                println("tiene 1 hijo")
                cantidadDeHijos1++
            }
            else -> {
                println("Tiene 2 o mas hijos")
                cantidadDeHijos2++
            }
        }
    }
    println("Familias con 0 hijos $cantidadDeHijos0")
    println("Familias con 1 hijo $cantidadDeHijos1")
    println("Familias con 2 o mas hijos $cantidadDeHijos2")

}


fun arreglosEnteros(){
    var sumaArreglo = 0
    var mayorA30 = 0
    var menorA30 = 0
    var arregloEnteros = IntArray(8)
    for (i in 0..(arregloEnteros.size-1)){
        print("Ingrese elemento:")
        arregloEnteros[i] = readln().toInt()
    }
    for (i in arregloEnteros){
        sumaArreglo = sumaArreglo + i
        if (i > 30){
            mayorA30 = mayorA30 + 1
        } else {
            menorA30 = menorA30 + 1
        }

    }

    println("La suma total de los valores ingresados es: $sumaArreglo")
    println("La cantidad de valores mayor a 30 son: $mayorA30")
    println("La cantidad de valores menor a 30 son: $menorA30")


}





