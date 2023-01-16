class AddressBook(
    val history: MutableList<Command> = mutableListOf()
) {
    fun executeCommand(command: Command): Any {
        history.add(command)
        return command.execute()
    }
}