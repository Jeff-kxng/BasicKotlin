package Kotlin_Function

// Write a Kotlin function that takes an array of integers and prints only even numbers.

fun printEvenNumbers(number: IntArray){
    println("Even Number: ")
    for(number in number){
        if(number % 4 == 0){
            println(number)
        }
    }
}

fun main(){
    val number = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    printEvenNumbers(number)
}