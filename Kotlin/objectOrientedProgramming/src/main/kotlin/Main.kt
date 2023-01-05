import javax.print.attribute.standard.Media

class App: DownloadListener{
    override fun onDownloadStarted() {
        println("Download Started")
    }

    override fun onDownloadCompleted(file: String) {
        println("$file Downloaded")
    }

    override fun onProgressUpdate(progress: Int) {
        println("$progress% Downloaded")
    }
}

class MediaFile(
    private val downloader: Downloader1,
    private val player: Player1
): Downloader1 by downloader, Player1 by player
//{
//    override fun download() {
//        downloader.download()
//        println("")
//    }
//
//    override fun play() {
//        player.play()
//        println("")
//    }
//
//}

class FileDownloader(private val file: String): Downloader1{
    override fun download(){
        println("$file Downloaded")
    }
}

class FilePlayer(private val file: String): Player1{
    override fun play(){
        println("$file Playing")
    }
}

fun main(args: Array<String>) {
////   OOPS BASICS
//   val box = Box()
//   val box1 = Box()
//   val box2 = Box()
//
//    println("Height of the box: ${box.h}")
//    box.b = 10
//    println("Breadth of the box: ${box.b}")
//    box.fillContents()
//    box.open()

////   GETTER SETTERS
//    println("Volume of the box: ${box.volume}")
//    box1.boxName = "Vishesh's Box"
//    println("Name: ${box1.boxName}")
//
////    CONSTRUCTORS
//    val boxCon1 = BoxConstructor(10, 12, 5)
////    when value not passed, secondary constructor gets called automatically
//    val boxCon2 = BoxConstructor()

//    INHERITANCE
//    val coffeeMachine = BaseCoffeeMachine(100.00, "black")
//    coffeeMachine.makeCoffee()
//    val coffeeMachine1 = PremiumCoffeeMachine(300.00, "brown")
//    coffeeMachine1.makeCoffee()
//    coffeeMachine1.makeCappucino()

//    val coffeeMachine = PremiumCoffeeMachine(300.00, "brown")
//    val info = coffeeMachine.machineInfo()
//    val coffee = coffeeMachine.makeCoffee("CAPPUCINO")
//    println(coffee)
//    println(info)
//
//    val simpleCoffeeMachine = CoffeeMachine(100.00, "brown")
//    val infoS = coffeeMachine.machineInfo()
//    val coffeeS = simpleCoffeeMachine.makeCoffee("CAPPUCINO")
//    println(coffeeS)
//    println(infoS)

//    INTERFACES


////    OBJECT LISTENER/ ANONYMOUS CLASS
//    val downloadListener = App()
//    val downloader = Downloader()
//
//    downloader.downloadListener = object: DownloadListener{
//        override fun onDownloadStarted() {
//            println("Download Started")
//        }
//
//        override fun onDownloadCompleted(file: String) {
//            println("$file Downloaded")
//        }
//
//        override fun onProgressUpdate(progress: Int) {
//            println("$progress% Downloaded")
//        }
//    }
//    downloader.downloadFile("FileA.mp4")
//
////    DELEGATION
//    val file: String = "File1.mkv"
//    val mediaFile = MediaFile(FileDownloader(file), FilePlayer(file))
//    mediaFile.download()
//    mediaFile.play()
}