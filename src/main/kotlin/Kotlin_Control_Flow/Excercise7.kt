package Kotlin_Control_Flow

// Write a Kotlin program to calculate the sum of all numbers between two given numbers.
fun main() {
    val start = 15
    val end = 25

    val sum = calculateSum(start, end)
    println("Sum of numbers between $start and $end: $sum")
}

fun calculateSum(start: Int, end: Int): Int {
    var sum = 0

    for (num in start..end) {
        sum += num
    }

    return sum
}
// Write a Kotlin program to calculate the sum of all numbers between two given numbers.
/* In the main() function the variables start and end represent the starting and ending numbers of the range for which we want to calculate the sum.
The calculateSum() function takes the start and end values as arguments and returns the sum of all numbers between them.
Inside the calculateSum() function, we initialize a variable sum to hold the cumulative sum and set it to 0.
We use a for loop to iterate over the numbers from start to end (inclusive) using the range operator ...
For each number in the range, we add it to the sum variable.
After the loop completes, we return the calculated sum.*/