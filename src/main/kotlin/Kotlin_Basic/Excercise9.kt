package Kotlin_Basic

import java.time.Year

/*In the above exercise,

Inside the "main()" function, a variable named year is declared and assigned a value.
The program then checks if the given year is a leap year by calling the isLeapYear() function and passing the year as an argument.
The result of the isLeapYear() function is evaluated in an if statement.
If the function returns true, the year is a leap year. The program prints the message "$year is a leap year." using string interpolation.
If the function returns false, the year is not a leap year. The program prints the message "$year is not a leap year." using string interpolation.
In the isLeapYear() function,

It takes an integer year as a parameter and returns a boolean value (true if it's a leap year, false otherwise).
Inside the function, a leap year is determined by the following conditions:
The year should be divisible by 4.
The year should not be divisible by 100, unless it is also divisible by 400.
The function uses the modulo operator % to check these conditions and returns the result as a boolean value.*/

// Write a Kotlin program to check if a given year is a leap year.
fun main(){
    val year = 2000
    // val year = 2003
    if(isLeapYear(year)){
        println("$year is a leap year")
    }
    else {
        println("$year is not a leap year")
    }
}
fun isLeapYear(year: Int) : Boolean {
    return year %4 == 0 && (year %100 != 0 || year % 400 == 0)
}