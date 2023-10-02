package Kotlin_

fun main() {
    println("Explore numeric operators")
    println(1 + 1)
    println(53 - 3)
    println(50 / 10)
    println(1.0 / 2.0)
    println(2.0 * 3.5)
    println(5 * 60)
    println(6.0 * 50.0)
    println(6.0 * 50)
    println(2.times(3))
    println(3.5.plus(4))
    println(2.4.div(2))
    println("\nPractice using types")
    val i: Int = 6
    val b1 = i.toByte()
    println(b1)
    val b2: Byte = 1
    println(b2)
    val i4: Int = b2.toInt()
    println(i4)
    val i5: String = b2.toString()
    println(i5)
    val i6: Double = b2.toDouble()
    println(i6)
    val oneMillion = 1_000_000
    println(oneMillion)
    val socialSecurityNumber = 999_99_9999L
    println(socialSecurityNumber)
    val hexBytes = 0xFF_EC_DE_5E
    println(hexBytes)
    val bytes = 0b11010010_01101001_10010100_10010010
    println(bytes)
    println("\nLearn the value of variable types")
    var fish = 1
    fish = 2
    val aquarium = 1
    val fish1: Int = 12
    val lakes: Double = 2.5
    println("\nLearn about strings and characters")
    val numberOfFish = 5
    val numberOfPlants = 12
    println("I have $numberOfFish fish" + " and $numberOfPlants plants")
    println("I have ${numberOfFish + numberOfPlants} fish and plants")
}
