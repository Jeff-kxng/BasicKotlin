package Kotlin_Control_Flow

// Write a Kotlin program to check if a given number is positive, negative, or zero.
fun main(){
    val num1 = 1
    println("Number is : $num1")
    if(num1 >0){
        println("The number is positive.")
    }
    else if(num1 < 0){
        println("The number is negative.")
    }
    else {
        println("The number is zero.")
    }
}