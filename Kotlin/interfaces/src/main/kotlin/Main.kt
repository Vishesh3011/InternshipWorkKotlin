fun main(args: Array<String>) {
    // INTERFACE
    val audioDown = Audio("Audio1.mp3")
    val videoDown = Video("Video1.mp4")

    audioDown.download()
    audioDown.play()
    audioDown.playerInfo()
    audioDown.downloaderInfo()

    videoDown.download()
    videoDown.play()
    videoDown.playerInfo()
    videoDown.downloaderInfo()
}