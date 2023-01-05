//fun main(){
////    no need of new
//    val person = Person()
//
////    person.firstName
////    person.lastName
////    person.nickName = "Rahul"
////    person.nickName = "Dr. Arya"
////    println(person.nickName)
//
//    person.printInfo()
//
//}

// val is immutable
val globalName: String = "Dev"

// var is mutable
// ? is used to return/give value "null" to a function/variable
var greeting: String? = "hello"

// Kotlin supports type inference, i.e. no need to specify string
val name = "Jesse"

// Greetings cannot be inferered anymore as string
// var greetings = null
var greetings: String? = null

// main difference between Java & Kotlin is that in
// Kotlin types are not null by default

val nameNULL: String? = null

//fun getGreeters(): String? {
////    return null
//    return "Hello Kotlin"
//}

// single line fun
//fun getGreeters(): String = "Hello Kotlin"

fun getGreeters() = "Hello Kotlin"

// Unit is used to return nothing
fun sayHello(): Unit {
    println(getGreeters())
}

fun functionWithParams(greetingz: String, itemToGreet: String) = println("$greetingz $itemToGreet")

fun main() {
    var name: String = "Vishesh"
    println(name)

    name = "Sparsh"

    println(name)

//    val name2: String = "Vishesh"
//    name2 = "Dev"
//    println(name2)

    println(globalName)
    println(greeting)

    greeting = "lol"
    println(greeting)

    println(nameNULL)
    greeting = null
    println(greeting)

    greetings = null
    println(greetings)

//    greetings = "Yo"
    if(greetings != null){
        println(greetings)
    }
    else{
        println("Hi")
    }
    println(globalName)

    // similar to switch()
    greetings = "Yo"
    when(greetings){
        null -> println("Hi")
        else -> println(greetings)
    }
    println(globalName)

    val greetingToPrint = if(greetings != null) greetings else "Hi"
    println(greetingToPrint)
    println(globalName)

    greetings = null
    val greetingToPrint2 = when (greetings){
        null -> "Hi"
        else -> greetings
    }
    println(greetingToPrint2)
    println(globalName)

    // Calling a function with return type
    println(getGreeters())

    // Calling a function with no return type
    sayHello()

    // Calling a function with parameters
    functionWithParams(greetingz = "Yo", itemToGreet = "Vishesh")
    functionWithParams("Sup", name)

    for (x in 1..10 step 2) {
        println(x)
    }
    for (x in 9 downTo 0 step 3) {
        println(x)
    }
}