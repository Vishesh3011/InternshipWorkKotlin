data class Person(
    val id: Int,
    val name: String,
    val phoneNum: Long,
){
    fun getNames() = "$name"
}