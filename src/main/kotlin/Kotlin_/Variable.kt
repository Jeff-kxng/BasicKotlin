package Kotlin_

fun main() {
    // Commented out code that was causing errors
    // var rocks: Int = null
    // null can not be a value of a non-null type Int
    var marbles: Int? = null
    var fishFoodTreats: Int? = 6 // Initialize with a nullable Int
    if (fishFoodTreats != null) {
        fishFoodTreats = fishFoodTreats.dec()
    }
    fishFoodTreats = fishFoodTreats?.dec() ?: 0
    val s: String? = "Hello, World!" // Initialize with a nullable String
    val len = s?.length ?: 0 // Use safe call operator ?. to avoid NullPointerException
    println(len) // Print the length of the string (or 0 if null)
}
