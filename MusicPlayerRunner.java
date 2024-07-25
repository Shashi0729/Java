
public class MusicPlayerRunner {
    public static void main(String... args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        int length = musicPlayer.getLength();
        System.out.println("Length is: " + length);
        musicPlayer.addSong("Baarisu Kannada");
        musicPlayer.addSong("Kannada Mannina");
        musicPlayer.addSong("Aaramagana");
        musicPlayer.addSong("Ondu Munja");
        musicPlayer.addSong("Kaanadante Maayavadano");
        musicPlayer.displaySongs();
        System.out.println("-----Search-----");
        String result = musicPlayer.searchSong("Aaramagana");
        System.out.println(result);
        System.out.println("-----Update-----");
        String update = musicPlayer.updateSong("Aaramagana", "Nee Sanihake");
        System.out.println(update);
        musicPlayer.displaySongs();
        System.out.println("-----Delete-----");
        String delete = musicPlayer.deleteSong("Ondu Munja");
        System.out.println(delete);
        musicPlayer.displaySongs();
    }
}