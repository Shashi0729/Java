class Spotify {
public static void Music() {
if (true) {
System.out.println("Spotify Music Playing");
} else {
System.out.println("Spotify Music Not Playing");
}
}

public static void PlaySong(String songName, String artist) {
    if (songName != null && artist != null) {
        System.out.println("Playing " + songName + " by " + artist);
    } else {
        System.out.println("Song or Artist is null");
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
