package com.commandPattern.example

fun main() {
    val calc = Calculator(6)

    println(calc.executeCommand(AddNumber(4)))

    println(calc.undoCommand(AddNumber(4)))

    println(calc.history)

    println(calc.executeCommand(MultiplyNumber(5)))
    println(calc.executeCommand(DivideNumber(3)))

    println(calc.undoCommand(MultiplyNumber(5)))

    println(calc.undoCommand(DivideNumber(3)))

    println(calc.history)
}