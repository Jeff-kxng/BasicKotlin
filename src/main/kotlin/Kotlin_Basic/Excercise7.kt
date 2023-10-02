package Kotlin_Basic

// Write a Kotlin program to find the maximum and minimum of three numbers
// Inside the 'main()' function, three variable named num1, nu2, nad num3 are decleared and assigned values 12, 10 and 19 respectively
// The MaxOf() function find the maximum value among num1, num2, num3. It takes multiple argument and return the maximum value
// the manOf() function find the minimum value among num1, num2, num3. It also takes arguments and reaturn the minimum value
// The maximum value is stored in the maximum variable, and the minimum value is stored in the minimum variable.
 fun main(){
     val num1 = 12
    val num2 = 25
    val num3 = 29
    println("Three number are : $num1, $num2, $num3")
    val max = maxOf(num1, num2, num3)
    val min = minOf(num1, num2, num3)
    println("Maximum od above three number : $max")
    println("Minimum od above three number : $min")
 }