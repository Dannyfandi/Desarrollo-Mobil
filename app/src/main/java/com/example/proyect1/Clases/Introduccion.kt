package com.example.proyect1.Clases

class Introduccion {
}

fun main() {
    print("Hola")
    println("Hola tonotos")

    val name:String="Daniel"

    println("el nombre es $name \n")

    println("Ingrese su edad")
    var edad= readLine()!!.toInt()
    println("Ingrese su apellido")
    var apellido= readLine()!!.toString()
    println("La edad es $edad \n")
    println("El apellido es $apellido \n")

}