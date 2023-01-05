interface PersonInfoProvider {
    val providerInfo : String

    fun printInfo(person: Person){
        println(providerInfo)
        person.printInfo()
    }
}

interface SessionInfoProvider {
    fun getSessionId(): String
}

//abstract class BasicInfoProvider : PersonInfoProvider
open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider{
//    override fun printInfo(person: Person) {
//        println("basicInfoProvider")
//        person.printInfo()
//    }

    override val providerInfo: String
        get() = "BasicInfoProvider"

//    open val sessionIdPrefix = "Session"
    protected open val sessionIdPrefix = "Session"

    override fun  printInfo(person : Person){
        super.printInfo(person)
        println("additional print statement")
    }

    override fun getSessionId(): String {
        return sessionIdPrefix
    }
}


fun main(){
//    val provider = BasicInfoProvider()
//    val provider = FancyInfoProvider()
//    provider.sessionIdPrefix
    val provider = object: PersonInfoProvider{
        override val providerInfo: String
            get() = "New info provider"

        fun getSessionId() = "id"
    }

    provider.printInfo(Person())
    provider.getSessionId()

    checkTypes(provider)
}

fun checkTypes(infoProvider: PersonInfoProvider){
    if(infoProvider !is SessionInfoProvider)
        println("Not a session info provider")
    else{
        println("Is a session info provider")
//        (infoProvider as SessionInfoProvider).getSessionId()
        infoProvider.getSessionId()
    }
}