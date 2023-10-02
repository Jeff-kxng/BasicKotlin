package Kotlin_Control_Flow

//Write a Kotlin program to check if a given number is divisible by 7.
fun main(){
    // val number = 19
    val number = 42
    println("Number is $number")
    if (number % 7 == 0){
        println("The number is dvisible by 7.")
    }
    else {
        println("The number is not divisible by 7")
    }
}