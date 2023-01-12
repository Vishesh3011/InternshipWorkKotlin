package com.commandPattern.example

class AddNumber(
    private val valueToAdd: Int
): Command {
    override fun execute(currValue: Int): Int {
        return currValue + valueToAdd
    }

    override fun undo(currValue: Int): Int {
        return currValue - valueToAdd
    }
}

class SubtractNumber(
    private val valueToSubtract: Int
): Command {
    override fun execute(currValue: Int): Int {
        return currValue - valueToSubtract
    }

    override fun undo(currValue: Int): Int {
        return currValue + valueToSubtract
    }
}

class MultiplyNumber(
    private val valueToMultiply: Int
): Command {
    override fun execute(currValue: Int): Int {
        return currValue * valueToMultiply
    }

    override fun undo(currValue: Int): Int {
        return currValue / valueToMultiply
    }
}

class DivideNumber(
    private val valueToDivide: Int
): Command {
    override fun execute(currValue: Int): Int {
        return currValue / valueToDivide
    }

    override fun undo(currValue: Int): Int {
        return currValue * valueToDivide
    }
}