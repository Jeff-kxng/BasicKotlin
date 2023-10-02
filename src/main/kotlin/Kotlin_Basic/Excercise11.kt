import kotlin.math.round

fun main() {
    println("Choose an option:")
    println("1. Convert Celsius to Fahrenheit")
    println("2. Convert Fahrenheit to Celsius")

    val optionInput = readLine()
    val option = optionInput?.toIntOrNull()

    if (option != null && (option == 1 || option == 2)) {
        println("Enter the temperature:")
        val temperatureInput = readLine()
        val temperature = temperatureInput?.toDoubleOrNull()

        if (temperature != null) {
            when (option) {
                1 -> {
                    val fahrenheit = celsiusToFahrenheit(temperature)
                    println("Temperature in Celsius: $temperature")
                    println("Temperature in Fahrenheit: ${round(fahrenheit * 100) / 100}") // Round to 2 decimal places
                }
                2 -> {
                    val celsius = fahrenheitToCelsius(temperature)
                    println("Temperature in Fahrenheit: $temperature")
                    println("Temperature in Celsius: ${round(celsius * 100) / 100}") // Round to 2 decimal places
                }
            }
        } else {
            println("Invalid temperature. Please enter a valid numeric value.")
        }
    } else {
        println("Invalid option. Please choose option 1 or 2.")
    }
}

fun celsiusToFahrenheit(celsius: Double): Double {
    return (celsius * 9 / 5) + 32
}

fun fahrenheitToCelsius(fahrenheit: Double): Double {
    return (fahrenheit - 32) * 5 / 9
}
// Write a Kotlin program to convert temperature from Celsius to Fahrenheit and vice versa.
/*The user is prompted to choose an option by entering a number: 1 for converting Celsius to Fahrenheit, or 2 for converting Fahrenheit to Celsius.
The user's input is read using readLine() and converted to an Int using toIntOrNull().
The temperature input is read and converted to Double using toDoubleOrNull().
If the temperature input is valid, a when expression is used to handle the selected option:
Option 1: The celsiusToFahrenheit() function is called with the temperature value as an argument. The function converts Celsius to Fahrenheit using the formula: (celsius * 9 / 5) + 32.
Option 2: The fahrenheitToCelsius() function is called with the temperature value as an argument. The function converts Fahrenheit to Celsius using the formula: (fahrenheit - 32) * 5 / 9.
The converted temperature is then printed to the console using string interpolation.
If the temperature input or option is invalid (null or not within the specified range), error messages are displayed.*/