data class AddContactRequest(
    val attributes: MutableMap<String, String>,
    val groups: MutableMap<String, String>,
    val phoneNum: MutableList<Phone>,
    val email: MutableList<Email>,
    val address: MutableMap<String, String>
)

data class UpdateContactRequest(
    val id: Int,
    val attributes: Attributes,
    val groups: MutableMap<Int, Groups>,
    val phoneNum: MutableMap<Int, Phone>,
    val email: MutableMap<Int, Email>,
    val address: MutableMap<Int, Address>
)

data class AddressRequest(
    val aId: Int,
    val type: String,
    val address: String,
    val cId: Int
)

data class AttributesRequest(
    val aId: Int,
    val type: String,
    val address: String,
    val cId: Int
)

data class EmailRequest(
    val eId: Int,
    val type: String,
    val email: String,
    val cId: Int
)

data class PhoneNumberRequest(
    val aId: Int,
    val type: String,
    val address: String,
    val cId: Int
)