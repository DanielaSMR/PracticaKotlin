package com.example.practicakotlin

fun main() {
    val morningNotification = 51
    /*
     * Val para atributos que no se modifican
     * Var para atributos dinamicos
     */
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    if(numberOfMessages > 99){
        println("Your phone is blowing up! You have 99+ notifications.")
    }else{
        println("You have $numberOfMessages notifications.")
    }
}