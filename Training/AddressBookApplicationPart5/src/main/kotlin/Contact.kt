data class Contact(
    val id: Int,
    val attributes: Attributes,
    val groups: MutableMap<String, Groups>,
    val phoneNum: MutableMap<String, Phone>,
    val email: MutableMap<String, Email>,
    val address: MutableMap<Int, Address>
) {

}