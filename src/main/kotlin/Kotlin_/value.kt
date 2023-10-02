package Kotlin_

fun main(args: Array<String>){
    // Will assign kotlin.Unit
    //val isUnit = println("This is my first Kotlin with Android Programming!!!")
    //println(isUnit)
   /* val temp = 50
    val isHot = if (temp > 50) true else false
    println(isHot) */
    val temp = 100
    val mess = "The water temperature is  ${ if (temp > 50) "too warm" else "OK" }."
    println(mess)
    // if temp > 50 is too warn
    // if temp < 50 is OK
}