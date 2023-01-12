class Calculator(
    var value: Int = 0
) {
    fun addValue(valueToAdd: Int): Int{
        value += valueToAdd
        return value
    }

    fun subtractValue(valueToSubtract: Int): Int{
        value -= valueToSubtract
        return value
    }

    fun mutiplyValue(valueToMutiply: Int): Int{
        value *= valueToMutiply
        return value
    }

    fun divideValue(valueToDivide: Int): Int{
        value /= valueToDivide
        return value
    }
}