package Kotlin_Function

// Write a Kotlin function that takes a 'name' as an argument and prints a personalized greeting message to the user.

fun welcomeUser(name: String) {
    println("Hello, $name! Welcome!")
}

fun main() {
    val name = "Jeff Kwng"
    welcomeUser(name)
}
/*The "greetUser()" function takes a "name" parameter of type String. It prints a personalized greeting message to the user by concatenating the name with a greeting phrase.
In the "main()" function, we initialize a variable "name" with the value " " and then call the "greetUser()" function, passing the "name" variable as an argument.
*/