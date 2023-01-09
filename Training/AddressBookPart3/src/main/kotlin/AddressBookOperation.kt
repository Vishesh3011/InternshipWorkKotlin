class AddressBookOperations{
    val contactList = mutableListOf<Contact>()
//    val groupsList = mutableMapOf<String, MutableList<String>>()

    fun addContact(contact: Contact): String {
        contactList.add(contact)
        return "${contact.firstName} ${contact.lastName}'s contact saved."
    }

    fun deleteContact(name: String): String{
        for((i, ele) in contactList.withIndex()){
            if(name == ele.firstName + " " + ele.lastName || name == ele.firstName || name == ele.lastName || name == ele.lastName + " " + ele.firstName) {
                contactList.removeAt(i)
                return "$name deleted."
            }
        }
        return "$name not found."
    }

    fun editContact(contact: Contact): String{
        for((i, ele) in contactList.withIndex()){
            if(ele.id == contact.id){
                contactList[i] = contact
                return "${contact.firstName}'s Contact Updated."
            }
        }
        return "${contact.firstName} not found."
    }

    fun searchContact(name: String) {
        val searchResults = mutableMapOf<Int, String?>()
        for((i, ele) in contactList.withIndex()){
            if(name == ele.firstName + " " + ele.lastName || name == ele.firstName || name == ele.lastName || name == ele.lastName + " " + ele.firstName) {
                searchResults[i] = "Mobile: ${ele.phoneNum.mobile} Work: ${ele.phoneNum.work} Home: ${ele.phoneNum.home}"
            }
        }
        searchResults.forEach{
            println("${name}: ${it.value}")
        }
        if(searchResults.isEmpty())
            println("$name Not Found")
    }

    fun showGroupMembers(name: String){

    }

    fun listAllContacts(){
        return contactList.forEach{
            println("First Name: ${it.firstName}\n" +
                    "Last Name: ${it.lastName}\n" +
                    "Phone Number: ${it.phoneNum}" )
        }
    }
}