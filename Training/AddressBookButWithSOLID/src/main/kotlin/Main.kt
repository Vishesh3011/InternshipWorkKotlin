import kotlin.system.exitProcess

fun main(args: Array<String>) {
    val person = Contacts()

    person.addContact(
        "THNS1",
        "Thanos",
        Phone("+91 7965345231", "+91 9209934965"),
        mutableListOf(Address("Titan"), Address("Morag")),
        listOf("Titanian", "Deviant", "Eternal")
    )
    person.addContact(
        "SPDRMN3",
        "Peter Parker",
        Phone("+91 7965345231", "+91 9209934965"),
        mutableListOf(Address("Queens"), Address("Earth")),
        listOf("Human")
    )
    person.addContact(
        "TNYSTRK1",
        "Tony Stark",
        Phone("+91 7965345231", "+91 9209934965"),
        mutableListOf(Address("Avengers Tower"), Address("Earth")),
        listOf("Human")
    )
    person.addContact(
        "STRLRD2",
        "Peter Quill",
        Phone("+91 7965345231", "+91 9209934965"),
        mutableListOf(Address("Galaxy"), Address("Random")),
        listOf("Human")
    )
    person.addContact(
        "IKRS45",
        "Ikaris",
        Phone("+91 7965345231", "+91 9209934965"),
        mutableListOf(Address("Galaxy"), Address("Earth")),
        listOf("Eternal")
    )

    person.listAllContact()
    person.showGroupMembers("Human")
    person.showGroupMembers("Eternal")

    person.searchContact("Thanos")

    person.deleteContact("Ikaris")
    person.listAllContact()


}