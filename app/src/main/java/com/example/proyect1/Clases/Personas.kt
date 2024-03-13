package com.example.proyect1.Clases

class Persona {
    var nombre:String
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var edad:Int
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var estatura:Double
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var sexo:Boolean
        get() {
            return field
        }
        set(value) {
            field = value
        }
    //constructor()
    constructor(estatura:Double, sexo:Boolean, edad:Int, nombre:String) {
        this.estatura = estatura
        this.sexo = sexo
        this.edad = edad
        this.nombre = nombre
    }
    fun pedirDatos() {
        println("Por favor ingrese su nombre")
        this.nombre = readLine()!!.toString()
        println("Por favor ingrese su edad")
        this.edad = readLine()!!.toInt()
    }
}
    fun main(){
        println("Por favor ingrese su nombre")
        val nombre = readLine()!!.toString()
        println("Por favor ingrese su edad")
        val edad = readLine()!!.toInt()
        println("Por favor ingrese su estatura")
        val estatura = readLine()!!.toDouble()
        println("Por favor ingrese su Sexo")
        val sexo = readLine()!!.toBoolean()
        val person1=Persona(estatura, sexo, edad, nombre)
        val person2=Persona(0.0,true,0,"a")
        person2.pedirDatos()
        println("Nombre:" + person1.nombre)
        println("Edad:" + person1.edad)
        println("Estatura:" + person1.estatura)
        println("Sexo:" + person1.sexo)

        println("Nombre:" + person2.nombre)
        println("Edad:" + person2.edad)
    }