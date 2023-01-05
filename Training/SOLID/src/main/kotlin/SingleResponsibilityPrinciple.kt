class Square {
    fun calcArea(side: Int) : Int {
        return side * side
    }

    fun calcPerimeter(side: Int) : Int{
        return side * 4
    }

////    SRP states that a class should have only one reason to change i.e. a class should have only one responsibility
////    For ex: Below code is related to the UI of square which has no relation with the square's metrics
////    So why not divide these functions related to UI to another class
////    Hence to increase the cleanliness of the code we divide the responsibility of the class
////    in-order to deliver a single job
//
//    fun renderSmallSquare() = println("This is a small Square")
//    fun renderLargeSquare() = println("This is a Large Square")
}

class SquareUI {
    fun renderSmallSquare() = println("This is a small Square")
    fun renderLargeSquare() = println("This is a Large Square")
}