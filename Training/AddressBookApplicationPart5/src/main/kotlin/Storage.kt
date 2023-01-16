object Storage {
    private val contactList: MutableMap<Int, Contact> = mutableMapOf()

    private val contactPhone: MutableMap<Int, Phone> = mutableMapOf()
    private val contactAttributes: MutableMap<Int, Attributes> = mutableMapOf()

    private val contactAddress: MutableMap<Int, Address> = mutableMapOf()
    private val contactEmail: MutableMap<Int, Email> = mutableMapOf()
    private val contactGroup: MutableMap<Int, Groups> = mutableMapOf()
    fun addContact(contact: Contact): Contact {
        contactList[contact.id] = contact
        return contact
    }

//    fun findContactByPhone(phone: String) : Contact {
//        val contactId = if (phone in contactPhone) {
//            contactPhone[phone]!!
//        } else {
//            throw Exception("Phone no not found: $phone")
//        }
//        return contactList[contactId]!!
//    }

    fun updateContact(id: Int, contact: Contact): Contact {
        contactList[id] = contact

        return contact
    }

    fun deleteContact(contactId: Int): MutableMap<Int, Contact> {
        contactList.remove(contactId)
        return contactList
    }

    fun searchContact(toSearch: String): MutableList<Contact?>{
        val searchResults = mutableListOf<Contact?>()

        for (i in contactAttributes) {
            if (
                i.value.firstName == toSearch
                || i.value.lastName == toSearch
                || i.value.firstName + " " + i.value.lastName == toSearch
            ) {
                searchResults.add(contactList[i.value.cId])
            }
        }

        for (i in contactPhone) {
            if (
                i.value.number == toSearch
            ) {
                searchResults.add(contactList[i.value.cId])
            }
        }

        for (i in contactEmail) {
            if (
                i.value.email == toSearch
            ) {
                searchResults.add(contactList[i.value.cId])
            }
        }

        for (i in contactAddress) {
            if (
                i.value.address == toSearch
            ) {
                searchResults.add(contactList[i.value.cId])
            }
        }

        return searchResults
    }

    fun searchContactByPhone(toSearch: String): MutableList<Contact?>{
        val searchResults = mutableListOf<Contact?>()
        for (i in contactPhone) {
            if (
                i.value.number == toSearch
            ) {
                searchResults.add(contactList[i.value.cId])
            }
        }
        return searchResults
    }

    fun listAllContacts(): MutableMap<Int, Contact>{
        return contactList
    }

    override fun toString(): String {
        return super.toString()
    }
}