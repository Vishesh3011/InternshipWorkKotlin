fun main(args: Array<String>) {
//     Data Class
    val person1 = Person(1231, "Thanos", 8234691251)
    val person2 = Person(1231, "Thanos", 8234691251)
    println(person1)
    println(person1.getNames())
    println(person1 === person2)

    val person3 = Person(350, "Dark Seid", 7977212360)
//    println(person3.component1())
    println(person3.component2())
    println(person1.component3())

    val (identity, name, phone) = person3
    println(identity)
    println(name)
    println(phone)

//    Nested Class
    val boxMetrics = Box(5, 3, 2)
    val box = boxMetrics.Content("Box 1")

    println(box.printContent())
    println(box.printInfo())

//    Enum Class
//    Color.values().forEach { println(it) }
//    val color = Color.RED
//    when(color){
//        Color.RED -> println("Red")
//        Color.BLUE -> println("Blue")
//        Color.GREEN -> println("Green")
//        else -> println("Invalid")
//    }

    println("Name: ${Color.RED.colorName}   Code: ${Color.RED.colorCode}")

    Color.GREEN.doColor()

    val circle = Shape.circle(3.0)
    val rect = Shape.rect(5.0, 4.0)
    val triangle = Shape.triangle(3.0, 6.0)
    println(calcArea((circle)))
    println(calcArea((rect)))
    println(calcArea(triangle))
//     It is not able to detect square due to sealed class, hence it limits the ones that are
//    thru outside of it.
//    val square = Shape.square(4.90)
}

class Square(
    val side: Double
): Shape()