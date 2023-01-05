fun main(args: Array<String>) {
    println("Average finder v0.1")
    val avg = findAverage(args)
    println("The average is $avg")
}

fun findAverage(input: Array<String>): Double {
    var result = 0.0
    for (s in input) {
        result += s.toDouble()
    }
    return result / input.size
}