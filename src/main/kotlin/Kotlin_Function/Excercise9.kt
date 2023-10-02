package Kotlin_Function

// Write a Kotlin function that calculates the area of a circle. Use a default value of 3.14 for pi.
fun calculateCircleArea(radius: Double, pi: Double = 3.14): Double {
    return pi * radius * radius
}

fun main() {
    val radius = 4.0
    val area = calculateCircleArea(radius)
    println("The area of the circle with radius $radius is $area")
}
// The "calculateCircleArea()" function takes two parameters: radius (representing the circle radius) and pi (representing the value of pi). The pi parameter has a default value of 3.14.
//Within the function, the circle area is calculated by multiplying the square of the radius by pi.
//The calculated area is returned as a Double value.
//In the "main()" function, a sample radius of 5.0 is defined.
//The "calculateCircleArea()" function is called with the radius as an argument, and the result is stored in the area variable.
//The circle area is then printed to the console using string interpolation.