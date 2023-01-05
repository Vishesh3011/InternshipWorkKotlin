class FileDownloader(private val file: String) : Downloader{
    override fun download() {
        println("${file} Downloaded")
    }
}

class FilePlayer(private val file: String) : Player{
    override fun play() {
        println("${file} Playing")
    }

}

class MediaFile(
    private val downloader: Downloader,
    private val player: Player
) : Downloader by downloader, Player by player{
//    override fun download() {
//        downloader.download()
//    }
//
//    override fun play() {
//        player.play()
//    }

}

interface Engine {
    fun start()
}

class Car(
    private val engine: Engine
): Engine by engine
// The Car class delegates the start() method to the engine object
//{
//    override fun start() {
//        engine.start()
//    }
//}

class GasEngine : Engine {
    override fun start() {
        println("Starting gas engine")
    }
}

fun main(args: Array<String>) {
////    DELEGATION EXAMPLE 1
//    val file: String = "File1.mkv"
//    val mediaFile = MediaFile(FileDownloader(file), FilePlayer(file))
//    mediaFile.download()
//    mediaFile.play()

////    DELEGATION EXAMPLE 2
//    val car = Car(GasEngine())
//    car.start()  // Output: "Starting gas engine"


////    DELEGATING PROPERTIES
    val student = Student()
    student.firstName = "Vishesh"
    student.lastName = "Modis"
    println(student)
}
