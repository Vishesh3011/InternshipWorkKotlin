interface AddressBook{
    fun addContact(name: String, phone: Long)
    fun listAllContact()
    fun deleteContact(name: String)
    fun searchContact(name: String): String
}

class Contacts: AddressBook{

    class Contact(
        val name: String,
        val phone: Long
    )

    private val contactList = mutableListOf<Contact>()

    override fun addContact(name: String, phone: Long) {
        contactList.add(Contact(name, phone))
        println("${name}'s Contact Saved")
    }

    override fun listAllContact() {
        contactList.forEach{
            println("Name: ${it.name}")
            println("Phone: ${it.phone}\n")
        }
    }

    override fun deleteContact(name: String) {
        for((index, element) in contactList.withIndex()){
            if(name == element.name) {
                println("${name}'s contact deleted")
                contactList.removeAt(index)
            }
            else
                println("${name} not found")
        }
    }

    override fun searchContact(name: String): String {
        for(index in contactList){
            if(index.name == name) {
                return "${index.phone} is the number of ${index.name}"
            }
        }
        return "$name not found."
    }
}