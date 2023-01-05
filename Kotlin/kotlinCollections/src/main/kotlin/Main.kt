//fun greet(greeting: String, itemsToGreet: List <String>){
//    itemsToGreet.forEach{ i ->
//        println("$greeting $i")
//    }
//}

// vararg tells compiler we'll take variable number of
// string arguments after initial argument to the function
fun greet(greeting: String, vararg itemsToGreet: String){
    itemsToGreet.forEach{ i ->
        println("$greeting $i")
    }
}

fun greetPerson(greeting: String, name: String) = println("$greeting $name")

fun greetPersonWithDefaultArgs(greeting: String = "Yo", name: String = "Kotlin") = println("$greeting $name")

fun main() {
    // Arrays
    val arr = arrayOf("Kotlin", "C++", "Python")
    println(arr.size)
    println(arr[0])
    println(arr.get(0))

//    for (i in arr){
//        println(i)
//    }

    // no data for iterator
    arr.forEach { i ->
        println(i)
    }

    // value of index sustained
    arr.forEachIndexed {index, i ->
        println("$i at index $index")
    }

//    List
//    Immuatable
    val list = listOf("Kotlin", "C++", "Python")

    list.forEach {i ->
        println(i)
    }

//    Mutable
    val mutList = mutableListOf("Kotlin", "C++", "Python")
    mutList.add("Java")

    mutList.forEach {i ->
        println(i)
    }

//    Map
    val map = mapOf(1 to "A", 2 to "V", 3 to "S")
    map.forEach { key, value ->
        println("$key -> $value")
    }

//    Mutable map
    val mutMap = mutableMapOf(1 to "A", 2 to "V", 3 to "S")
    mutMap.put(10, "D")

    mutMap.forEach { key, value ->
        println("$key -> $value")
    }

//    Using list as param of function
//    greet(greeting = "Hi", mutList)

//    Using vararg
    greet("Hi", "Kotlin",  "C++", "Python")

//    Using array as param of function
//    Can be used for accepting data from DB/Network
//    Use spread operator *
    greet("Hi", *arr)

//    Use to avoid order without any errors
    greetPerson(greeting = "hi", name = "Vishesh")

//    Default args can be used to call functions with single or no arguments
    greetPersonWithDefaultArgs(name = "Jesse Pinkman")
    greetPersonWithDefaultArgs()

    greet(greeting = "Hi", itemsToGreet = *arr)

    val fruits = listOf("Apple", "Orange", "Banana", "Mango", "Apricot")
    println(fruits.filter{it.startsWith('A')}.map{it.toUpperCase()}.sortedBy { it })
    fruits.filter{it.startsWith('A')}.map{it.toUpperCase()}.sortedBy { it }.forEach({ println(it) })
}