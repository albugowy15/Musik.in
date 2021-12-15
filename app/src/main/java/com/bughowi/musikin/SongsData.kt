import com.bughowi.musikin.Songs
import com.bughowi.musikin.R

object SongsData {

    private val songsTitle = arrayOf(
        "Faded",
        "Dear God",
        "At My Worst",
        "Attention",
        "Bring Me To Life",
        "Don't Look Back In Anger",
        "Heal The World",
        "I Don't Want To Miss A Thing",
        "I Will Always Love You",
        "Bad Liar",
        "Just The Way You Are",
        "More Than You Know",
        "See You Again",
        "She's Gone",
        "Someone Like You"
    )

    private val songsArtist = arrayOf(
        "Alan Walker",
        "Avenged Sevenfold",
        "Pink Sweat$",
        "Charlie Puth",
        "Evanescence",
        "Oasis",
        "Michael Jackson",
        "Aerosmith",
        "Whitney Houston",
        "Imagine Dragons",
        "Bruno Mars",
        "Axwell /\\ Ingrosso",
        "Wiz Khalifa (feat. Charlie Puth)",
        "Steelheart",
        "Adele"
    )

    private val songsArtistCover = intArrayOf(
        R.drawable.artist_alan_walker,
        R.drawable.artist_avenged_sevenfold,
        R.drawable.artist_pink_sweats,
        R.drawable.artist_charlie_puth,
        R.drawable.artist_evanescence,
        R.drawable.artist_oasis,
        R.drawable.artist_michael_jackson,
        R.drawable.artist_aerosmith,
        R.drawable.artist_whitney_houston,
        R.drawable.artist_imagine_dragons,
        R.drawable.artist_bruno_mars,
        R.drawable.artist_axwell_ingrosso,
        R.drawable.artist_wiz_khalifa,
        R.drawable.artist_steelheart,
        R.drawable.artist_adele
    )

    val listData: ArrayList<Songs>
        get() {
            val list = arrayListOf<Songs>()
            for (position in songsTitle.indices) {
                val songs = Songs()
                songs.title = songsTitle[position]
                songs.artist = songsArtist[position]
                songs.artist_cover = songsArtistCover[position]
                list.add(songs)
            }
            return list
        }
}