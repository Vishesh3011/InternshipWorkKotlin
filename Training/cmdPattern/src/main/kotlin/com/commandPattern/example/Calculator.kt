package com.commandPattern.example

class Calculator(
    private var value: Int = 0,
    val history: MutableList<Command> = mutableListOf()
) {
    fun executeCommand(command: Command): Int{
        value = command.execute(value)
        history.add(command)
        return value
    }

    fun undoCommand(command: Command): Int{
        value = command.undo(value)
        history.add(command)
        return value
    }
}