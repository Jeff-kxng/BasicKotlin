package Kotlin_

import java.util.*

fun randomDay() : String{
    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun fishfood(day : String) : String{
    return when (day){
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "Nothing"
    }
}

fun feedThefish(){
    val day = randomDay()
    val food = fishfood(day)
    println("Today is $day and the fish eat $food")
}

fun main(args: Array<String>){
    feedThefish()
}