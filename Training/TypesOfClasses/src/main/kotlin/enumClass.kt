//enum class Color{
//    RED,
//    GREEN,
//    BLUE
//}

enum class Color(
    val colorName: String,
    val colorCode: String
): DoColor{
    RED("Red", "#FCDE"){
        override fun doColor() {
            println("Colored with Red")
        }
    },
    GREEN("Green", "#DRED") {
        override fun doColor() {
            println("Colored with Green")
        }
    },
    BLUE("Blue", "#GHJC") {
        override fun doColor() {
            println("Colored with Blue")
        }
    }
}

interface DoColor{
    fun doColor()
}

