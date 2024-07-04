public class SongsRunner {
    public static void main(String[] args) {
        Songs.Play();
        Songs.DownloadSong("Munjane manjali", "Raghu Dixit");
        System.out.println(Songs.GetSongCount());
        Songs.GetSongDetails(1);
    }
}

