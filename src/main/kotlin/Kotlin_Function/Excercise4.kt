package Kotlin_Function

// Write a kotlin function that reverses a given string
fun reverseString(input : String): String {
    return input.reversed()
}
fun main(){
    val str = "Kotlin function"
    println("original string : $str")
    val reversedStr = reverseString(str)
    println("Reversed string : $reversedStr")
}
/*The "reverseString()" function takes a String parameter named input, representing the string to reverse.
The reversed() function is called on the input string, which returns the string with the characters in reverse order.
The reversed string is then returned as the function result.
In the main function, a sample string str is defined.
The reverseString function is called with the string as an argument, and the result is stored in the 'reversedStr' variable.
Finally the reversed string is printed to the console.*/