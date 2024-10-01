package com.example.practicakotlin

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}

class Person(
    val name: String,
    val age: Int,
    val hobby: String?, /*Interrogante cuando no sabes si va estar vacio o no*/
    val referrer: Person?) {

    fun showProfile(){
        println("Name: $name")
        println("Age: $age")
        if(hobby != null){
            print("Like to $hobby.")
        }else{
            print("Doesn't have a Hobby.")
        }
        if(referrer != null){
            println("Has a referrer named ${referrer.name}, who likes to play ${referrer.hobby}")
        }else{
            println("Doesn't have a referrer.")
        }
    }
}