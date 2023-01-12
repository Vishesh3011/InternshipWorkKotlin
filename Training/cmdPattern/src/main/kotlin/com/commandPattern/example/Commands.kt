package com.commandPattern.example

interface Command {
    fun execute(currValue: Int): Int
    fun undo(currValue: Int): Int

}