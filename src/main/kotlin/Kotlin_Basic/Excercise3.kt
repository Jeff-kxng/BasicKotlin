package Kotlin_Basic
import java.util.Date
import java.text.SimpleDateFormat

// Write a Kotlin program to display the current date and time.
fun main(){
    val currentDate = Date()
    val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val formaDate = dateFormat.format(currentDate)
    println("Currrent Date Time : $formaDate")
}