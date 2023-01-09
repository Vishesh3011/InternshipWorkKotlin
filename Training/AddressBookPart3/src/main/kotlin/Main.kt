fun main(args: Array<String>) {
    var person = AddressBookOperations()

    println(person.addContact(
        Contact(
            1,
            "vishesh",
            "modi",
            Email("modivishesh30@gmail.com", "vishesh.vayana@gmail.com"),
            Phone("+91 1234567890", "+91 7977212360"),
            Address("Khatri Pole", "Vadodara", 390001),
            mutableListOf("NUV", "Vayana", "Friends")
        )
    ))

    println(person.addContact(
        Contact(
            3,
            "shivam",
            "chavda",
            Email("modivishesh30@gmail.com", "vishesh.vayana@gmail.com"),
            Phone("+91 1234567890", "+91 7977212360"),
            Address("Khatri Pole", "Vadodara", 390001),
            mutableListOf("NUV", "Vayana", "Friends")
        )
    ))

    println(person.addContact(
        Contact(
            2,
            "shivam",
            "chavda",
            Email("modivishesh30@gmail.com", "vishesh.vayana@gmail.com"),
            Phone("+91 1234567890", "+91 7977212360"),
            Address("Khatri Pole", "Vadodara", 390001),
            mutableListOf("NUV", "Vayana", "Friends")
        )
    ))



//    person.searchContact("shivam")
//    person.searchContact("shivam chavda")
//    person.searchContact("vivek")
//
//    println(person.deleteContact("shivam"))
//    println(person.deleteContact("shivam"))
//    println(person.deleteContact("vivek"))
//    println(person.listAllContacts())

    println(person.editContact(
        Contact(
            3,
            "shiv",
            "chavda",
            Email("shivam30@gmail.com", "shivam.vayana@gmail.com"),
            Phone("+91 989812313455", "+91 7977212360"),
            Address("Khatri Pole", "Vadodara", 390001),
            mutableListOf("NUV", "Vayana", "Friends")
        )
    ))
    println(person.listAllContacts())
}