open class Shapes {
    open fun area(): Double {
        return 0.0
    }
}

open class Rect(
    private val width: Double = 0.0,
    private val length: Double = 0.0
): Shapes(){
    override fun area(): Double {
        return width * length
    }
}

class Sqr(
    private val side: Double = 0.0
): Rect(side, side){

}