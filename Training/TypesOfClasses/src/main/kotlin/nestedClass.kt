class Box(
    val l: Int = 0,
    val b: Int = 0,
    val h: Int = 0
) {
//     The content class can access Box's values by using inner keyword
    inner class Content(private val content: String){
        fun printInfo(){
            println("$l, $b, $h")
        }

        fun printContent(){
            println(content)
        }
    }
}