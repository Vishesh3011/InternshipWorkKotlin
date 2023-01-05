fun main(args: Array<String>) {
    val person = Contacts()

    person.addContact("Thanos", 7977212369)
    person.addContact("Peter Parker", 9898123451)

    person.listAllContact()

    person.deleteContact("Thanos")

    person.listAllContact()

    person.addContact("Moonknight", 90993497455)
    person.listAllContact()

    println(person.searchContact("Moonknight"))
    println(person.searchContact("Tony Stark"))
}