package Kotlin_Function

// Write a Kotlin function that takes named arguments `name`, `age`, and `city` and prints the details of a person.
fun printDetails(name: String, age: Int, city: String) {
    println("Name: $name")
    println("Age: $age")
    println("City: $city")
}

fun main() {
    printDetails(name = "Jeff Kwng", age = 22, city = "Siem Reap")
}
//The printDetails() function takes three named arguments: name of type String, age of type Int, and city of type String.
//Inside the function, it prints the details of a person by accessing the values of the named arguments. The details are printed using println().
//In the main function, we call the "printDetails()" function and provide the values for the named arguments explicitly.