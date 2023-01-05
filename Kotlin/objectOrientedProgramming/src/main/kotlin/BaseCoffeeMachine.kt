//open is used to implement inheritance
//open class BaseCoffeeMachine(
//    private val price: Double,
//    private val color: String
//) {
//    fun makeCoffee(){
//        println("Here's your coffee")
//    }
//}

//abstract class can't have objects/instances
abstract class BaseCoffeeMachine(
    private val price: Double,
    private val color: String
) {
    abstract val brand: String

    abstract fun makeCoffee (type: String): String

    open fun machineInfo(): String {
        return "Coffee Machine Details: \n" + "Price: $price\n" + "Color: $color\n"
    }
}