//primary
//class BoxConstructor constructor(
//    val l: Int = 10,
//    var b: Int = 5,
//    var h: Int = 12,
//){
// }

//if no access modifier needed
class BoxConstructor
    (
    val l: Int = 0,
    var b: Int = 0,
    var h: Int = 0,
) {
//    logic for constructor
//    always called after primary constructor
    init {
        println("Init block called")
    }

//    secondary constructor
    constructor(color: String = "Red"): this(0, 0, 0){
        println("Secondary constructor called")
    }


    val volume get() = l * b * h
}