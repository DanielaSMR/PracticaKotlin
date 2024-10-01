package com.example.practicakotlin

import java.util.Arrays

fun main(){
    println("Lista Inmutable")
    listaInmutable()
    println("Lista Mutable")
    listaMutable()
}

fun listaInmutable(){
    val DAM:List<String> = listOf("PSP","PSM","Ingles")

    val DAM2 = arrayOf("PSP","ASM","Ingles")
    Arrays.sort(DAM2) { s1:String, s2:String -> s1.compareTo(s2)}
    println(Arrays.toString(DAM2))


    var language = arrayOf("Ruby", "Kotlin", "Python","Java")
    for (item in language)
        println(item)

    for (i in 1..5) println(i)

    for (clase in DAM){
        if(clase == DAM[2]){
            println("Este es la posicion 3")
        }
        println(clase)
    }

}


fun listaMutable(){
    val DAM:MutableList<String> = mutableListOf("PSPmov","PSM","Ingles")

    println("Primer valor de la lista " + DAM.first())
    println("Ultimo valor de la lista " + DAM.last())
    println("Tamaño de la lista " + DAM.size)



    for (clase in DAM){
        if(clase.contains("mov")){
            println(clase)
        }
    }
}