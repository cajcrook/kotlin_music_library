import music.MusicLibrary
import music.Track
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class MusicLibraryTest {

    @Test
    fun testNoTrackAddedWhenLibraryHas1() {
        val library = MusicLibrary()
        val track = Track("","", 0)
        library.addTrack(track)
        assertTrue(library.getTracks().isEmpty(), "Incorrect song and/or artist.")
    }

    @Test
    fun testAddSingleTrack() {
        val library = MusicLibrary()
        val track = Track("Voices", "Elkka", 120)
        library.addTrack(track)
        assertEquals(listOf("Voices - Elkka - 120"), library.getTracks())
    }

    @Test
    fun testAddSecondTrack() {
        val library = MusicLibrary()
        val track1 = Track("Voices", "Elkka", 120)
        val track2 = Track("Wild", "The Japanese House", 185)
        library.addTrack(track1)
        library.addTrack(track2)
        assertEquals(listOf("Voices - Elkka - 120", "Wild - The Japanese House - 185"), library.getTracks())
//    println("GET TRACKS ${library.getTracks()}")
    }

    @Test
    fun testGet1stTrack() {
        val library = MusicLibrary()
        val track1 = Track("Voices", "Elkka", 120)
        val track2 = Track("Wild", "The Japanese House", 185)
        library.addTrack(track1)
        library.addTrack(track2)
        assertEquals("Voices - Elkka - 120", library.getTracks()[0])
    }

    @Test
    fun testGet2ndTrack() {
        val library = MusicLibrary()
        val track1 = Track("Voices", "Elkka", 120)
        val track2 = Track("Wild", "The Japanese House", 185)
        library.addTrack(track1)
        library.addTrack(track2)
        assertEquals("Wild - The Japanese House - 185", library.getTracks()[1])
    }

    @Test
    fun testGetAllTrack() {
        val library = MusicLibrary()
        val track1 = Track("Voices", "Elkka", 120)
        val track2 = Track("Wild", "The Japanese House", 185)
        library.addTrack(track1)
        library.addTrack(track2)
        assertEquals(listOf("Voices - Elkka - 120", "Wild - The Japanese House - 185"), library.getTracks())
    }
}



