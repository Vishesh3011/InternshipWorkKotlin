sealed class Shape {
    class rect(val l: Double, val b: Double): Shape()
    class circle(val r: Double): Shape()
    class triangle(val h: Double, val b: Double): Shape()
}

fun calcArea(shape: Shape): Double{
    return when(shape){
        is Shape.circle -> Math.PI * shape.r * shape.r
        is Shape.rect -> shape.b * shape.l
        is Shape.triangle -> (1 / 2) * shape.h * shape.b
        else -> return 0.0
    }
}

