package Kotlin_Function

import javax.annotation.processing.Messager

// Write a Kotlin function taht prints a message and does not return anything

fun printMessage(messager: String){
    println(messager)
}
fun main(){
    printMessage("Hello, Jeff!!")
}

// The printMessage() function take a parameter message of type String. Inside the function, it prints the message using println function
// In the main function, we call the "printMessage()" function and provide the message "Hello, world!" as an argument. The function prints the message to the console.
// Since the "printMessage()" function does not return any value (unit-returning function), its return type is Unit, which is the default return type for functions that do not specify a return type explicitly.