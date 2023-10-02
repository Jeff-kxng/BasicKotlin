package Kotlin_Basic

import java.util.Arrays

// Write a Kotlin program to take user input and display it
fun main(args: Array<String>) {
    if (args.isNotEmpty()) {
        val name = args[0]
        println("Entered name: $name")
    } else {
        println("No name provided. Please provide a name as a command-line argument.")
    }
}
