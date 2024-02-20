package com.example.proyect1.Estructuras_condicionales
import kotlin.math.sqrt
fun suma(a: Double, b: Int): Double{
    return a + b
}
fun resta(a: Double, b: Int): Double{
    return a - b
}
fun multiplicacion(a: Double, b: Int): Double{
    return a * b
}
fun division(a: Double, b: Int): Double{
    return a / b
}
fun raiz(a: Double): Double{
    val squareRoot = sqrt(a)
    return squareRoot
}
fun potencia(a: Double, b: Int): Double{
    var c: Double = 1.0
    if (b > 0) {
        for (i in 1..b){
            c = c*a
        }
        return c
    } else if (b < 0) {
        for (i in 1..-b){
            c = c*a
        }
        return 1/c
    } else {
        return 1.0
    }
}

fun main(){
    println("Ingresa el primer numero")
    var a= readLine()!!.toDouble()
    println("Ingresa el segundo numero")
    var b= readLine()!!.toInt()
    println("Selecciona la operacion que deseas realizar (Suma, Resta, Multiplicacion, Division, Raiz o potencia)")
    var operacion = readLine()!!.toString()
    when (operacion) {
        "Suma" -> println("$a sumado $b es ${suma(a,b)} \n")
        "Resta" -> println("$a restado $b es ${resta(a,b)} \n")
        "Multiplicacion" -> println("$a multiplicado $b es ${multiplicacion(a,b)} \n")
        "Division" -> println("$a dividido $b es ${division(a,b)} \n")
        "Raiz" -> println("La raiz cuadrada de $a es ${raiz(a)} \n")
        "Potencia" -> println("$a elevado a la potencia de $b es ${potencia(a,b)} \n")
    }
}