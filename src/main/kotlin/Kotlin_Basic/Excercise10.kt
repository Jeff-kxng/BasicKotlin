import kotlin.math.PI

fun main(args: Array<String>) {
    if (args.isNotEmpty()) {
        val radius = args[0].toDoubleOrNull()

        if (radius != null && radius > 0) {
            val area = calculateArea(radius)
            val perimeter = calculatePerimeter(radius)

            println("Radius of the circle: $radius")
            println("Area of the circle: $area")
            println("Perimeter of the circle: $perimeter")
        } else {
            println("Invalid input. Please enter a valid positive radius.")
        }
    } else {
        println("No input provided. Please enter the radius of the circle as a command-line argument.")
    }
}

fun calculateArea(radius: Double): Double {
    return PI * radius * radius
}

fun calculatePerimeter(radius: Double): Double {
    return 2 * PI * radius
}
