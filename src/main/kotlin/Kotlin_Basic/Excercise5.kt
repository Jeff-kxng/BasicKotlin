package Kotlin_Basic

// Write a Kotlin program to perform addition, subtraction, multiplication and division of two numbers.

fun main(args: Array<String>) {
    if (args.size >= 2) {
        val number1 = args[0].toDoubleOrNull()
        val number2 = args[1].toDoubleOrNull()

        if (number1 != null && number2 != null) {
            val sum = number1 + number2
            val difference = number1 - number2
            val product = number1 * number2
            val quotient = number1 / number2

            println("Sum: $sum")
            println("Difference: $difference")
            println("Product: $product")
            println("Quotient: $quotient")
        } else {
            println("Invalid input. Please enter valid numbers.")
        }
    } else {
        println("Insufficient number of arguments. Please provide two numbers as command-line arguments.")
    }
}