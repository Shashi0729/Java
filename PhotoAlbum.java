
class PhotoAlbum {
    public String photoNames[] = new String[4];
    public int index = 0;

    public int getLength() {
        return this.photoNames.length;
    }

    public void addPhoto(String photo) {
        if (this.index < this.getLength()) {
            this.photoNames[index] = photo;
            index++;
        }
    }

    public void displayPhotos() {
        for (int i = 0; i < this.getLength(); i++) {
            System.out.println("Photos are: " + photoNames[i]);
        }
    }

    // Search
    public String searchPhoto(String photo) {
        for (String p : photoNames) {
            if (p == photo) {
                System.out.println("Photo is: " + p);
                return "Photo found.";
            }
        }
        return "not found";
    }

    // Update
    public String updatePhoto(String oldPhoto, String newPhoto) {
        for (int i = 0; i < this.getLength(); i++) {
            if (oldPhoto == photoNames[i]) {
                photoNames[i] = newPhoto;
                return "Updated";
            }
        }
        return "not found";
    }

    // Delete
    public String deletePhoto(String photoName) {
        for (int i = 0; i < this.getLength(); i++) {
            if (photoName == photoNames[i]) {
                photoNames[i] = null;
                return "Deleted";
            }
        }
        return "not found";
    }
}




