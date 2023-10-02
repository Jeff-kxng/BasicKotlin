package Kotlin_Control_Flow

// Write a Kotlin program to check if a given character is a vowel or a consonant.
fun main(){
    val input = 'B'
    val character = input.lowercaseChar()

    if (character in listOf('a', 'e', 'i', 'o', 'u')) {
        println("The character '$input' is a vowel")
    }
    else {
        println("The character is '$input' is a consonant")
    }
}