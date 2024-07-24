public class MusicRunner {
    public static void main(String[] args) {
       
        Music[] musics = new Music[10];
        musics[0] = new Music("Happy", "Pharrell Williams", "G I R L", 240);
        musics[1] = new Music("Uptown Funk", "Mark Ronson ft. Bruno Mars", "Uptown Special", 280);
        musics[2] = new Music("Can't Stop the Feeling!", "Justin Timberlake", "Trolls: Original Motion Picture Soundtrack", 230);
        musics[3] = new Music("We Found Love", "Rihanna ft. Calvin Harris", "Talk That Talk", 260);
        musics[4] = new Music("Someone Like You", "Adele", "21", 290);
        musics[5] = new Music("Shut Up and Dance", "Walk the Moon", "Talking Is Hard", 210);
        musics[6] = new Music("All About That Bass", "Meghan Trainor", "Title", 240);
        musics[7] = new Music("Roar", "Katy Perry", "Prism", 270);
        musics[8] = new Music("Radioactive", "Imagine Dragons", "Night Visions", 300);
        musics[9] = new Music("Counting Stars", "OneRepublic", "Native", 260);

       
        for (int i = 0; i < musics.length; i++) {
            System.out.println("Music " + (i + 1) + ": Title = " + musics[i].getTitle() + ", Artist = " + musics[i].getArtist() + ", Album = " + musics[i].getAlbum() + ", Duration = " + musics[i].getDuration());
        }
    }
}


