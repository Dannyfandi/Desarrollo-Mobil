package com.example.proyect1
fun dosis(meses: Int, peso: Double){
    var dosisvac: Double = ((peso+10)/(meses*10))*8
    print("La dosis que se debe colocar al bebe es de $dosisvac mililitros \n")
}
fun main(){
    println("Ingresa la edad del bebe en meses")
    var edad= readLine()!!.toInt()
    println("Ingresa el peso del bebe en kg")
    var peso= readLine()!!.toDouble()
    dosis(edad, peso)
}