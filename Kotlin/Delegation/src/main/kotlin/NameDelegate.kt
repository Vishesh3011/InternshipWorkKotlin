import kotlin.reflect.KProperty

class NameDelegate {
    var formattedValue: String? = null

//    setter
    operator fun setValue(
        thisRef: Any?,
        property: KProperty <*>,
        value: String?
    ){
//        (thisRef as Student).firstName
//    thisRef is used to access members of Class
//    property contains meta info
        if(value != null && value.length > 5){
            formattedValue = value.trim().toUpperCase()
        }
    }

//    getter
    operator fun getValue( thisRef: Any?, property: KProperty <*>): String? {
        return formattedValue
    }
}