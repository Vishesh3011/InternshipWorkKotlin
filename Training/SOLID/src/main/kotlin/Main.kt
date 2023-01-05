fun main(args: Array<String>) {
//    Single Responsibility Principle
    val sRP = Square()

    println(sRP.calcArea(2))
    println(sRP.calcPerimeter(2))

    val sRP2 = SquareUI()

    sRP2.renderLargeSquare()
    sRP2.renderSmallSquare()

//    Open Closed Principle
    val Cust1 = VehicleInsCust()
    val Cust2 = HomeInsCust()
    val Cust3 = LifeInsCust()

    val iC = InsuranceCompany()
    iC.discount(Cust1)
    iC.discount(Cust2)
    iC.discount(Cust3)

//    Open Closed Principle 2
    val rect1 = Rectangle(2.0, 5.0)
    val rect2 = Rectangle()
    val circle = Circle(3.5)

    println(rect1.area())
    println(rect2.area())
    println(circle.area())

//    Liskov Substitution Principle
    var list = mutableListOf(CasualCar(), SportsCar())
    list.forEach{
        println(it.getInteriorWidth())
    }

//    Liskov Substitution Principle 2
    val sqr = Sqr(4.0)
    val rec = Rect(5.0, 4.0)

    println(rec.area())
    println(sqr.area())

//    Dependency Inversion Principle
    val productCatalog = ProductCatalog()
    productCatalog.listAllProducts()

//    Dependency Inversion Principle 2
    val data = DataBaseClient()
    data.insertData("Okay")
    data.retrieveData()
}