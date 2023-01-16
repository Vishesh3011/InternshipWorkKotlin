fun main() {
//    val person = AddressBook()
//
//    val createdPerson1 = person.executeCommand(AddContactCommand(
//        AddContactRequest(
//            "vishesh",
//            "modi",
//            mutableMapOf("personal" to "modivishesh30@gmail.com"),
//            mutableMapOf("work" to "+91 9099349745", "home" to "+91 7977212360"),
//            Address("Khatri Pole", "Vadodara", 390001),
//        )
//    )) as Contact
//
//    val createdPerson2 = person.executeCommand(AddContactCommand(
//        AddContactRequest(
//            "vishesh",
//            "modi",
//            mutableMapOf("personal" to "modivishesh30@gmail.com"),
//            mutableMapOf("work" to "+91 9099349745", "home" to "+91 7977212360"),
//            Address("Khatri Pole", "Vadodara", 390001),
//        )
//    )) as Contact
//
//    val createdPerson3 = person.executeCommand(AddContactCommand(
//        AddContactRequest(
//            "shivam",
//            "chavda",
//            mutableMapOf("business" to "shivam30@gmail.com", "work" to "shivam.vayana@gmail.com"),
//            mutableMapOf("work" to "+91 9099349123", "home" to "+91 7977212456", "mobile" to "+91 7977212456"),
//            Address("Shree Society", "Vadodara", 390008),
//        )
//    )) as Contact
//
//    println(person.executeCommand(UpdateContactCommand(createdPerson1.id,
//        UpdateContactRequest(
//            createdPerson1.id,
//            "narendra",
//            createdPerson1.lastName,
//            createdPerson1.phoneNum,
//            createdPerson1.email,
//            createdPerson1.address
//        ))))
//
////    println(person.executeCommand(ListContactCommand()))
//
//    person.executeCommand(DeleteContactCommand(createdPerson3.id))
//
//    println(person.executeCommand(ListContactCommand()))
//
//    println(person.executeCommand(SearchContactCommand("+91 7977212360")))
//
//    println(person.history)
}