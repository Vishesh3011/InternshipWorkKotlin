class Person(val firstName: String = "Sparsh", val lastName: String = "Arya") {
    var nickName: String? = null
        // overidding default value setter
        set(value){
            field = value
            println("New NickName is $value")
        }

        // overidding default value getter
        get(){
            println("the return value is $field")
            return field
        }

    // creating methods
    fun printInfo(){
        val nickNameToPrint = nickName ?: "No NickName"

        println("$firstName ($nickNameToPrint) $lastName")
    }

//    init {
//        println("init 1")
//    }
//
//    constructor(): this("Jesse", "Pinkman"){
//        println("secondary constructor")
//    }
//
//    init {
//        println("init 2")
//    }

//    val firstName: String = _firstName
//    val lastName: String = _lastName

//    init {
//        firstName = _firstName
//        lastName = _lastName
//    }

}

//Also valid
//class Person()