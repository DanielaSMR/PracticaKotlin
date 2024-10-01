package com.example.practicakotlin

fun main(){
    val can1 = Canciones("1000 horas","Desconocido",2012,200)

    can1.contarR()
    can1.imprimirCancion()
}

class Canciones(
    var titulo : String,
    var artista : String,
    var añoP : Int,
    var recuento : Int
) {
    fun contarR(){
        if(recuento < 1000){
            println("La cancion no es popular")
        }
    }
    fun imprimirCancion(){
        println("$titulo, interpretada por $artista, se lanzo en $añoP")
    }
}