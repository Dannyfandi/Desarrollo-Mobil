package com.example.proyect1.Retos

import com.example.proyect1.Quizes.division
import com.example.proyect1.Quizes.multiplicacion
import com.example.proyect1.Quizes.potencia
import com.example.proyect1.Quizes.raiz
import com.example.proyect1.Quizes.resta
import com.example.proyect1.Quizes.suma

/*fun suma(a: Double, b: Int): Double{
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
*/
fun main(){
    println("Ingresa el primer numero")
    var a= readLine()!!.toDouble()
    println("Ingresa el segundo numero")
    var b= readLine()!!.toInt()
    println("$a sumado $b es ${suma(a,b)} \n")
    println("$a restado $b es ${resta(a,b)} \n")
    println("$a multiplicado $b es ${multiplicacion(a,b)} \n")
    println("$a dividido $b es ${division(a,b)} \n")
    println("La raiz cuadrada de $a es ${raiz(a)} \n")
    println("$a elevado a la potencia de $b es ${potencia(a,b)} \n")
}