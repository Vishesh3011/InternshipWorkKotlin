//class DataBase{
//    var info: String = ""
//    fun insert(data: String){
//        info = data
//        println("$data inserted")
//    }
//
//    fun retrieve(){
//        println("$info")
//    }
//}
//
//class DataBaseClient {
//    val dB = DataBase()
//
//    fun insertData(data: String){
//        dB.insert(data)
//    }
//
//    fun retrieveData(){
//        return dB.retrieve()
//    }
//}

interface DataBase {
    fun insert(data: String)
    fun retrieve(): String
}

class MySQLDataBase: DataBase{
    private var info: String = ""

    override fun insert(data: String) {
        info = data
        println("$data inserted")
    }

    override fun retrieve(): String {
        return "$info"
    }
}

class DataBaseClient(
    var database: DataBase = MySQLDataBase()
){
    fun insertData(data: String){
        database.insert(data)
    }

    fun retrieveData(){
        println(database.retrieve())
    }
}