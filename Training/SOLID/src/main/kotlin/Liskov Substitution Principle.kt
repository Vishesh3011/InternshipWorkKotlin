// LSP states that all classes are interconvertible or it can be said that subtypes must be substitutable for its base type
//if a program is using a base class, then it should be able to use a subclass in its place without knowing it.
//In other words, any subclass should be able to substitute for its base class without causing any issues

//open class Car{
//    fun getCabinWidth(): Int = 39
//}
//
//class SportsCar: Car() {
//    fun getCockpitWidth(): Int = 12
//}
//
//fun main(){
//    val list = mutableListOf(Car(), SportsCar())
//    list.forEach{
//        when(it){
//            is SportsCar -> {
//                println(it.getCockpitWidth())
//            }
//            is Car -> {
//                println(it.getCabinWidth())
//            }
//        }
//    }
//}

open class Car {
    open fun getInteriorWidth(): Int = 0
}

class CasualCar: Car(){
    override fun getInteriorWidth(): Int {
        return getCabinWidth()
    }

    private fun getCabinWidth(): Int {
        return 39
    }
}

class SportsCar: Car(){
    override fun getInteriorWidth(): Int {
        return getCockpitWidth()
    }

    private fun getCockpitWidth(): Int {
        return 12
    }
}