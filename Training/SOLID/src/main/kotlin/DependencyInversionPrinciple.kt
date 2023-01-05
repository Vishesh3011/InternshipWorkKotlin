//// DIP states that Lower Module Class shouldn't depend on lower ones, instead both should depend on abstraction
//// Ex: below class depends on lower one as
//// High Level Module
//class ProductCatalog {
//    fun listAllProducts(){
////        Here this class is depended on SQLProductRepo
//        val sQL = SQLProductRepo()
//        sQL.getAllProducts().forEach{
//            println(it)
//        }
//    }
//}
//
//// Low Level Module
//class SQLProductRepo{
//    fun getAllProducts(): MutableList<String>{
//        return mutableListOf("Apple", "Banana", "Orange")
//    }
//}
//
//// Instead why not create an extra interface and make both of them dependable on it?

interface ProductRepo{
    fun getAllProducts(): MutableList<String>
}

class ProductCatalog {
    fun listAllProducts(){
//        Here this class is a type of ProductRepo and not directly depended on SQLProductRepo
        val sQL: ProductRepo = SQLProductRepo()
        sQL.getAllProducts().forEach{
            println(it)
        }
    }
}

class SQLProductRepo: ProductRepo{

    override fun getAllProducts(): MutableList<String>{
        return mutableListOf("Apple", "Banana", "Orange")
    }
}

