import sun.security.util.Length

interface Shape{
    fun area(): Double = 0.0
}

class Rectangle(
    val width: Double = 0.0,
    val length: Double = 0.0
) : Shape {
    override fun area(): Double {
        return width * length
    }
}

class Circle(
    val radius: Double = 0.0
): Shape {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}