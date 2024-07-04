
public class SpotifyRunner {
    public static void main(String[] args) {
        Spotify.Music();
        Spotify.PlaySong("Happy", "Pharrell Williams");
        System.out.println(Spotify.GetSongCount());
        Spotify.GetSongDetails(1);
    }
}

