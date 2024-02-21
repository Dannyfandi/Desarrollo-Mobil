package com.example.proyect1.Ciclos


// piedra = 0, papel = 1, tijera = 2
fun ganarperder(apuesta: Int):Int{
    var maquina: Int = (0 until 2).random()
    if (apuesta == 0) {
        if (maquina == 0) {
            println("Empataste!")
            return 0
        } else if (maquina == 1) {
            println("Perdiste!")
            return 1
        } else {
            println("Ganaste!")
            return 0
        }
    } else if (apuesta == 1) {
        if (maquina == 0) {
            println("Ganaste!")
            return 0
        } else if (maquina == 1) {
            println("Empataste!")
            return 0
        } else {
            println("Perdiste!")
            return 1
        }
    } else {
        if (maquina == 0) {
            println("Perdiste!")
            return 1
        } else if (maquina == 1) {
            println("Ganaste!")
            return 0
        } else {
            println("Empataste!")
            return 0
        }
    }

}
fun jugar (cantidad: Int) {
    var vidas_perdidas: Int = 0
    while (vidas_perdidas < cantidad) {
        println("Escoje Piedra, Papel o Tijera")
        var apuesta = readLine()!!.toString()
        if (apuesta == "Piedra") {
            vidas_perdidas += ganarperder(0)
        } else if (apuesta == "Papel") {
            vidas_perdidas += ganarperder(1)
        } else if (apuesta == "Tijera") {
            vidas_perdidas += ganarperder(2)
        } else {
            println("Lado no valido, recuerda escoger Cara o Sello")
        }
    }
}

fun main() {
    println("Ingresa la cantidad de oportunidades que quiere tener al jugar")
    var cantidad= readLine()!!.toInt()
    jugar(cantidad)
}