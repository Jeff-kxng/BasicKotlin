package Kotlin_Function

import java.util.IllegalFormatWidthException

// Write a Kotlin function that calculates and returns the area of a rectangle. It should take 'length' and 'width' as arguments, with default values of 0.0.

fun calculateArea(Length : Double = 0.0, width : Double = 0.0) : Double{
    return Length * width
}

fun main(){
    val area = calculateArea(7.0, 4.0)
    println("The area the rectangle is : $area")
}