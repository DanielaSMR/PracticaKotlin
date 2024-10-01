package com.example.practicakotlin

open class Phone(var isScreenLightOn: Boolean = false){
    /*
        Es necesario hacer la funcion abierta para poder hederarla,
        al igual que las funciones
     */
    open fun InterruptorOn() {
        isScreenLightOn = true
    }

    fun InterruptorOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class MovilPlegable(var plegado : Boolean =  true) : Phone(){

    override fun InterruptorOn(){
        if(plegado == false){
            isScreenLightOn = true
        }
    }

    fun abrirTelefono(){
        plegado = false
    }

    fun cerrarTelefono(){
        plegado = true
    }
}

fun main(){
    val telefono1 = MovilPlegable();

    telefono1.InterruptorOn()
    telefono1.checkPhoneScreenLight()
    telefono1.abrirTelefono()
    telefono1.InterruptorOn()
    telefono1.checkPhoneScreenLight()
    telefono1.cerrarTelefono()

}