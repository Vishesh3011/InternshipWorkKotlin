class Box {
    val l: Int = 10
    var b: Int = 5
    var h: Int = 12

//    var x: Int = 0
//        get() = 10
//        set(value) {
//            field = value
//        }

//    getter
    val volume get() = l * b * h
// getter cab be val/var while setter is var
//    setter
var boxName: String = "Box Name"
    set(value) {
    if(value.length < 3)
        println("Name cannot be less than 3 characters")
    else
        field = value
}

    fun fillContents(){
        println("Box filled")
    }

    fun open(){
        println("Box opened")
    }
}