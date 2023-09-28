fun swim(speed: String = "fast"){
    swim() // use default speed
    swim("slow") // postional argument
    swim(speed = "turtke-like") // named parameter
    println("swimming $speed")
}