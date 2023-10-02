package Kotlin_Control_Flow
// Write a Kotlin program to generate the multiplication table of a given number.
fun main() {
    // Change this value to generate the multiplication
    //  table for a different number

    val number = 7

    println("Multiplication table of $number:")
    generateMultiplicationTable(number)
}

fun generateMultiplicationTable(number: Int) {
    for (i in 1..10) {
        val result = number * i
        println("$number * $i = $result")
    }
}
/*In the main() function the "number" variable represents the number for which we want to generate the multiplication table. You can modify this value to generate the table for a different number.
The "generateMultiplicationTable()" function takes the number as an argument and generates a multiplication table for that number.
Inside the "generateMultiplicationTable()" function, we use a for loop to iterate from 1 to 7.
For each iteration, we calculate the result of multiplying the number with the loop variable i and store it in the result variable.
Finally we print the multiplication expression and the corresponding result using the println() function. */