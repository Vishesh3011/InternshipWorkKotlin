//// Interface Segregation Principle States that instead of create big interfaces, create small ones
//// i.e. avoid bulky interfaces whenever possible
//// For example we have this large interface for printers
//interface MultiFunctions {
//    fun bWPrint()
//    fun colorPrint()
//    fun scan()
//    fun scanPhoto()
//    fun fax()
//    fun internetFax()
//}
//
//// Now Canon Printers don't use fax functions but we need to override all functions, if we don't it will show an error
//class CanonPrinter: MultiFunctions{
//    override fun bWPrint() {
//        TODO("Not yet implemented")
//    }
//
//    override fun colorPrint() {
//        TODO("Not yet implemented")
//    }
//
//    override fun scan() {
//        TODO("Not yet implemented")
//    }
//
//    override fun scanPhoto() {
//        TODO("Not yet implemented")
//    }
//
//
//    override fun fax() {
//        TODO("Not yet implemented")
//    }
//
//    override fun internetFax() {
//        TODO("Not yet implemented")
//    }
//}
//
//// So the solution is we can create small interfaces and then make the canon printer override it

interface Print{
    fun bWPrint()
    fun colorPrint()
}

interface Scan{
    fun scan()
    fun scanPhoto()
}

interface Fax{
    fun fax()
    fun internetFax()
}

//// Hence, inherit only those classes that are necessary
class CanonPrinter: Print, Scan {
    override fun bWPrint() {
        TODO("Not yet implemented")
    }

    override fun colorPrint() {
        TODO("Not yet implemented")
    }

    override fun scan() {
        TODO("Not yet implemented")
    }

    override fun scanPhoto() {
        TODO("Not yet implemented")
    }
}

class HPPrinter: Print, Scan, Fax{
    override fun bWPrint() {
        TODO("Not yet implemented")
    }

    override fun colorPrint() {
        TODO("Not yet implemented")
    }

    override fun scan() {
        TODO("Not yet implemented")
    }

    override fun scanPhoto() {
        TODO("Not yet implemented")
    }

    override fun fax() {
        TODO("Not yet implemented")
    }

    override fun internetFax() {
        TODO("Not yet implemented")
    }

}