interface contact{
    val contactList: MutableList<Contact>
        get() = mutableListOf<Contact>()
}
interface add{
    fun addContact(id: String, name: String, phone: Phone, address: List<Address>, group: List<String>)
}

interface display{
    fun listAllContact()
    fun showGroupMembers(species: String)
}

interface delete{
    fun deleteContact(name: String)
}

interface search{
    fun searchContact(name: String): String
}

data class Contact(
    val id: String,
    val name: String,
    val phone: Phone,
    val address: List<Address>,
    val group: List<String>
)

data class Address(
    val id: Int,
    val street: String
)

data class Phone(
    val mobile: String? = null,
    val work: String? = null,
    val telephone: String? = null
)

interface Group{
    val groups: MutableMap<String, MutableList<String>>
}

class addContact: contact, add, Group{
    override fun addContact(id:String, name: String, phone: Phone, address: List<Address>, group: List<String>) {
        contactList.add(Contact(id, name, phone, address, group))
        for(i in group){
            if(groups[i]?.size != null){
                val list = groups[i]
                list?.add(name)
            }
            else{
                val list2 = mutableListOf<String>()
                list2.add(name)
                groups[i] = list2
            }
        }
        println("${name}'s Contact Saved")
    }
}

interface deleteContact: contact, delete{
    override fun deleteContact(name: String) {
        for((index, element) in contactList.withIndex()){
            if(name == element.name) {
                println("${name}'s contact deleted")
                contactList.removeAt(index)
                return
            }
        }
        println("$name not found.")
    }
}

interface searchContact: contact, search{
    override fun searchContact(name: String): String {
        for(index in contactList){
            if(index.name == name)
                return "${index.phone} is the number of ${index.name}"
        }
        return "$name not found."
    }
}

interface listContacts: contact, display, Group(){
    override fun listAllContact() {
        contactList.forEach{
            println("ID: ${it.id}")
            println("Name: ${it.name}")
            println("Phone:")
            println("Mobile: ${it.phone.mobile} Work: ${it.phone.work} Telephone: ${it.phone.telephone}")
            println("Addresses:")
            for((index, element) in it.address.withIndex()){
                println("Address ${index + 1}: ${element.street}")
            }
            println("Groups:")
            for((index, element) in it.group.withIndex()){
                println("Group ${index + 1}: $element")
            }
            println("\n\n")
        }
    }

    override fun showGroupMembers(species: String) {
        println("${groups[species]} are the members of $species")
    }
}

class Contact: addContact