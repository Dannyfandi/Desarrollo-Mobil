package com.example.proyect1.Estructuras_condicionales

fun ganaroperder(apuesta: Int){
    var moneda: Int = (0 until 1).random()
    if (apuesta == moneda) {
        println("¡Ganaste!")
    } else {
        println("Perdiste :c")
    }
}

fun apostar(cantidad: Int) {
    for (i in 1..cantidad) {
        println("Escoje Cara o Sello")
        var apuesta = readLine()!!.toString()
        if (apuesta == "Cara") {
            ganaroperder(0)
        } else if (apuesta == "Sello") {
            ganaroperder(1)
        } else {
            println("Lado no valido, recuerda escoger Cara o Sello")
        }
    }
}

fun main() {
    println("Ingresa la cantidad de veces que quieres jugar")
    var cantidad= readLine()!!.toInt()
    apostar(cantidad)
}