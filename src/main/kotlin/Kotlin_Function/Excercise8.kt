package Kotlin_Function

// Write a Kotlin function that calculates the Body Mass Index (BMI) of a person. The function should take the height (in meters) and weight (in kilograms) as arguments. Use default arguments for height and weight.
fun calculateBMI(height: Double = 0.0, weight: Double = 0.0): Double {
    require(height > 0.0) { "Height must be greater than 0." }
    require(weight > 0.0) { "Weight must be greater than 0." }

    val bmi = weight / (height * height)
    return bmi
}

fun main() {
    val height = 1.65
    val weight = 63.5
    val bmi = calculateBMI(height, weight)
    println("BMI: $bmi")
}
// The "calculateBMI()" function is defined with two parameters: height (default value of 0.0) and weight (default value of 0.0). These parameters represent height in meters and weight in kilograms, respectively.
//The require function validates that the provided height and weight are greater than 0. If either requirement fails, an exception is thrown with the corresponding error message.
//The BMI is calculated using the formula weight / (height * height).
//The calculated BMI is returned from the function.
//In the "main()" function, a sample height of 1.65 meters and 63.5 kilograms is provided. The calculateBMI function is called with these values, and the resulting BMI is printed to the console.