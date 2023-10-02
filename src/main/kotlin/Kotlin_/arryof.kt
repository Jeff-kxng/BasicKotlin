package Kotlin_

fun main() {
    println("Explore arrays, lists, and loops")
    println("Make lists")

    val school = listOf("mackerel", "trout", "halibut")
    println(school)

    val myList = mutableListOf("tuna", "salmon", "shark")
    myList.remove("shark")

    println("Create arrays")

    val schools = arrayOf("shark", "salmon", "minnow")
    println(schools.joinToString())

    val mix = arrayOf("fish", 2)
    val numbers = intArrayOf(1, 2, 3)

    val numbers2 = intArrayOf(1, 2, 3)
    val numbers3 = intArrayOf(4, 5, 6)
    val foo2 = (numbers2 + numbers3).getOrNull(5)
    println(foo2)

    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(numbers.toList(), oceans, "salmon")
    println(oddList)

    val array = Array(5) { it * 2 }
    println(array.joinToString())

    println("Create loops")
    for (element in school) {
        print("$element ")
    }

    for ((index, element) in school.withIndex()) {
        println("Item at $index is $element")
    }

    for (i in 1..5) print(i)
    for (i in 5 downTo 1) print(i)
    for (i in 3..6 step 2) print(i)
    for (i in 'd'..'g') print(i)

    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }
    println("\n$bubbles bubbles in the water")

    do {
        bubbles--
    } while (bubbles > 0)
    println("$bubbles bubbles in the water")

    repeat(2) {
        println("A fish is swimming")
    }
}
