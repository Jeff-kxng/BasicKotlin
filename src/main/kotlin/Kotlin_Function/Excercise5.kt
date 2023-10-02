package Kotlin_Function

// Write a Kotlin function that checks if a string is a palindrome or not

fun isPalindrome(str : String) : Boolean{
    val cleanStr = str.toLowerCase().replace(Regex("[^a-zA-Z0-9]"), " ")
    return cleanStr == cleanStr.reversed()
}

fun main(){
    val str1 = "Jeff"
    val str2 = "Kotlin"

    println("$str1 is palindrome : ${isPalindrome(str1)}")
    println("$str2 is palindrome : ${isPalindrome(str2)}")
}
/*
The "isPalindrome()" function takes a str parameter, which represents the string to be checked.
Within the function, the input string str is first cleaned by converting it to lowercase and removing any non-alphanumeric characters using a regular expression.
The cleaned string cleanStr is compared with its reversed form (cleanStr.reversed()) using the == operator.
If the cleaned string and its reversed form are equal, the input string is a palindrome, and the function returns true. Otherwise, it returns false.
In the "main()" function, two sample strings (str1 and str2) are defined.
The "isPalindrome()" function is called for each string, and the result is printed to the console.*/