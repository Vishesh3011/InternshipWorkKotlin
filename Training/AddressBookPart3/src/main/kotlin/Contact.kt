data class Contact (
    val id: Int,
    val firstName: String,
    val lastName: String,
    val email: Email,
    val phoneNum: Phone,
    val address: Address,
    val groups: MutableList<String>
){

}