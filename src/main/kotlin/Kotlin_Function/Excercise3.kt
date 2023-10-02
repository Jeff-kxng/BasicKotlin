package Kotlin_Function

// Write a Kotlin function 'countVowels' taht counts the number of vowels in a given string

fun countVowles(input: String) : Int{
    val vowels = listOf('a', 'e', 'i', 'o', 'u')
    var count = 0

    for (char in input.lowercase()){
        if(char in vowels){
            count++
        }
    }
    return count
}
fun main(){
    val str = "kotlin, function!!"
    val vowelCount = countVowles(str)
    println("The number of vowels in '$str' is $vowelCount")
}