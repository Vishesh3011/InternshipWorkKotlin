class PremiumCoffeeMachine(
    price: Double,
    color: String
) : BaseCoffeeMachine(price, color) {
//    fun makeCoffee1(){
////        println("Here's your premium coffee")
//        makeCoffee()
//    }

    fun makeCappucino(){
        println("Here's your cappuchino")
    }

    override val brand: String
        get() = "Brand X"

     override fun makeCoffee(type: String): String {
        return "Your $type is Ready"
    }
}