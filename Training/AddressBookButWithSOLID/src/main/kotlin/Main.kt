fun main(args: Array<String>) {
    val person = addContact()

    person.addContact(
        "TNS1",
        "Thanos",
        Phone("+91 7965345231", "+91 9209934965"),
        mutableListOf(Address(1, "Titan"), Address(2, "Morag")),
        listOf("Titanian", "Deviant", "Eternal")
    )

    person.addContact(
        "SPDRMN3",
        "Peter Parker",
        Phone("+91 7965345231", "+91 9209934965"),
        mutableListOf(Address(1, "Queens"), Address(2, "Earth")),
        listOf("Human")
    )

    person.addContact(
        "TNYSTRK1",
        "Tony Stark",
        Phone("+91 7965345231", "+91 9209934965"),
        mutableListOf(Address(1, "Avengers Tower"), Address(2, "Earth")),
        listOf("Human")
    )

    person.addContact(
        "STRLRD2",
        "Peter Quil",
        Phone("+91 7965345231", "+91 9209934965"),
        mutableListOf(Address(1, "Galaxy"), Address(2, "Random")),
        listOf("Human")
    )

    person.addContact(
        "IKRS45",
        "Ikaris",
        Phone("+91 7965345231", "+91 9209934965"),
        mutableListOf(Address(1, "Galaxy"), Address(2, "Earth")),
        listOf("Eternal")
    )

    val showContact = listContacts()
    showContact.listAllContact()
    showContact.showGroupMembers("Human")
    showContact.showGroupMembers("Eternal")

    val searchContact = searchContact()
    searchContact.searchContact("Thanos")

    val deleteContact = deleteContact()
    deleteContact.deleteContact("Ikaris")

    showContact.listAllContact()
}