package Kotlin_Control_Flow

// Write a Kotlin program to count the number of even and odd elements in an array.
/*The "numbers" array contains the elements for which we want to count even and odd numbers.

The "countEvenNumbers()" function takes the numbers array as an argument and counts the number of even elements in the array.
Inside the "countEvenNumbers()" function, we initialize a variable count to hold the count of even numbers and set it to 0.
We use a for loop to iterate over each element in the numbers array.
For each element, we check if it is divisible by 2 (i.e., even) by using the condition number % 2 == 0. If it is, we increment the count variable.
After iterating through all the elements, we return the final count of even numbers.
The "countOddNumbers()" function is similar to countEvenNumbers(), but it counts odd elements instead.
In the main() function, we call "countEvenNumbers()" and "countOddNumbers()" with the numbers array and store the respective counts in evenCount and oddCount.
Finally, we print the counts of even and odd elements using println() function. */

fun main(){
    val num = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)

    val evenCount = countEvenNumbers(num)
    val oddCount = countOddnumbers(num)

    println("Number of even elements : $evenCount")
    println("Number of odd elements : $oddCount")
}

fun countEvenNumbers(num: Array<Int>): Int{
    var count = 0

    for(number in num){
        if(number % 2 == 0){
            count++
        }
    }
    return count
}
fun countOddnumbers(num: Array<Int>): Int{
    var count = 0

    for(number in num){
        if(number % 2 != 0){
            count++
        }
    }
    return count
}