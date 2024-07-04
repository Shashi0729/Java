
class Songs {
    public static void Play() {
        if (true) {
            System.out.println("Songs Playing");
        } else {
            System.out.println("Songs Not Playing");
        }
    }

    public static void DownloadSong(String songName, String artist) {
        if (songName != null && artist != null) {
            System.out.println("Song Downloaded: " + songName + ", Artist: " + artist);
        } else {
            System.out.println("Song Name or Artist is null");
        }
    }

    public static int GetSongCount() {
        if (true) {
            return 100;
        } else {
            return 0;
        }
    }

    public static String GetSongDetails(int songId) {
        if (songId > 0) {
            return "Song Name: Happy, Artist: Pharrell Williams";
        } else {
            return "Song Id is invalid";
        }
    }
}
