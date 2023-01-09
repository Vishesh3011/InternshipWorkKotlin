data class Phone(
    val work: String? = null,
    val mobile: String? = null,
    val home: String? = null,
) {
    override fun toString(): String {
        return "Work: ${work}   Mobile: ${mobile}   Home: ${home}"
    }
}