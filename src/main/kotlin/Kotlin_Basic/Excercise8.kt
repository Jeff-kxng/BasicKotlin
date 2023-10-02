package Kotlin_Basic

// Write a Kotlin program to find the factorial of a given number.
// Inside the "main()" function, a variable named 'number' is declared and assigned a value of 5.
// The calculateFactorial() function is then called with the number as an argument, and the result is stored in a variable named factorial.
// Finally, the result is printed using string interpolation in the println() statement: "Factorial of $number: $factorial".
// In the calculateFactorial() function,
/*The function takes an integer number as a parameter and returns the factorial as a Long value.
Inside the function, an if statement checks if the number is equal to 0 or 1. If it is, the function returns 1 because the factorial of 0 and 1 is 1.
If the number is greater than 1, the function initializes a variable result with 1L, indicating the starting value for the factorial calculation.
A for loop is used, starting from 2 (as the factorial calculation starts from 2) and continuing until number. In each iteration, the result is multiplied by i and assigned back to the result.
Finally, the calculated factorial is returned. */

fun main(){
    val num = 5
    val fac = calculateFactorial(num)
    println("Factorial of $num : $fac")
}
fun calculateFactorial(num: Int): Long {
    return if (num == 0 || num == 1) {
        1
    } else {
        var result = 1L
        for (i in 2..num) {
            result *= i
        }
        result
    }
}