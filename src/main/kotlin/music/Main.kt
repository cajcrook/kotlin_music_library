package music
//import music.Track
//import kotlin.time.toDuration

class MusicLibrary {
    val tracklist = mutableListOf<String>()


    fun addTrack(track: Track): String {
        if (track.title.isNotBlank() && track.artist.isNotBlank() && track.duration > 0) {
            tracklist.add("${track.title} - ${track.artist} - ${track.duration}")
        } else {
            println("Incorrect song and/or artist.")
        }
        return "Incorrect song and/or artist."
    }
    fun getTracks(): List<String> = tracklist
}

fun main(args: Array<String>) {
    val musicLibrary = MusicLibrary()
    musicLibrary.addTrack(Track("1_Test_Title", "1_Test_Artist", 111))
    println("getTrack 1: ${musicLibrary.getTracks()}")

    musicLibrary.addTrack(Track("2_Test_Title", "2_Test_Artist", 222))
    println("getTrack 1 and 2: ${musicLibrary.getTracks()}")

    musicLibrary.addTrack(Track("3_Test_Title", "3_Test_Artist", 333))
    println("getTrack 1 and 2 and 3: ${musicLibrary.getTracks()}")

    println("getTrack index 0: ${musicLibrary.getTracks()[0]}")
    println("getTrack index 1: ${musicLibrary.getTracks()[1]}")
    println("getTrack index 2: ${musicLibrary.getTracks()[2]}")





}