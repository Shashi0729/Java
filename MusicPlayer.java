

class MusicPlayer {
    public String songTitles[] = new String[4];
    public int index = 0;

    public int getLength() {
        return this.songTitles.length;
    }

    public void addSong(String song) {
        if (this.index < this.getLength()) {
            this.songTitles[index] = song;
            index++;
        }
    }

    public void displaySongs() {
        for (int i = 0; i < this.getLength(); i++) {
            System.out.println("Songs are: " + songTitles[i]);
        }
    }

    // Search
    public String searchSong(String song) {
        for (String s : songTitles) {
            if (s == song) {
                System.out.println("Song is: " + s);
                return "Song found.";
            }
        }
        return "not found";
    }

    // Update
    public String updateSong(String oldSong, String newSong) {
        for (int i = 0; i < this.getLength(); i++) {
            if (oldSong == songTitles[i]) {
                songTitles[i] = newSong;
                return "Updated";
            }
        }
        return "not found";
    }

    // Delete
    public String deleteSong(String songTitle) {
        for (int i = 0; i < this.getLength(); i++) {
            if (songTitle == songTitles[i]) {
                songTitles[i] = null;
                return "Deleted";
            }
        }
        return "not found";
    }
}






