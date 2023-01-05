class Student {
//    var firstName: String? = null
//        set(value){
//            if(value != null && value.length > 5){
//                field = value.trim().toUpperCase()
//            }
//        }
//    var lastName: String? = null
//        set(value) {
//            if(value != null && value.length > 5){
//                field = value.trim().toUpperCase()
//            }
//        }

    var firstName: String? by NameDelegate()
    var lastName: String? by NameDelegate()

    override fun toString(): String {
        return "$firstName $lastName"
    }
}