package Kotlin_Control_Flow

// I don't know about u but why I feel overwhelmed with their tasks they give me
fun main(){
    val n = 30
    println("Fabonacci series up to $n: ")
    printFibonacciSeries(n)
}
fun printFibonacciSeries(n: Int){
    var num1 = 0
    var num2 = 1
    print("$num1, $num2")

    while (num2 <= n) {
        val nextNum = num1 + num2
        if (nextNum<=n)
        {
            print(", $nextNum")
        }
        num1 = num2
        num2 = nextNum
    }
}