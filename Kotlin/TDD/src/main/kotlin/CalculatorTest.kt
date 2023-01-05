import org.jetbrains.annotations.TestOnly

class CalculatorTest {
    @TestOnly
    fun testMultiplyBy2(){
        val calculator = Calculator()
        val result = Calculator.parse("2 * 2")
        4 === result
    }
}

class Calculator {
    companion object {
        fun parse(s: String): Int {
            return 0
        }
    }
}
