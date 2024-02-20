package com.example.proyect1.Estructuras_condicionales

fun farenacel(temp: Int){
    var celcius: Double = (temp-32)/1.8
    print("La temperatura en celcius es $celcius \n")
}
fun main(){
    println("Ingresa la temperatura en fahrenheit")
    var temp= readLine()!!.toInt()
    farenacel(temp)
}