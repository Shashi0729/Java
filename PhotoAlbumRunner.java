
public class PhotoAlbumRunner {
    public static void main(String... args) {
        PhotoAlbum photoAlbum = new PhotoAlbum();
        int length = photoAlbum.getLength();
        System.out.println("Length is: " + length);
        photoAlbum.addPhoto("Family Vacation");
        photoAlbum.addPhoto("Wedding Day");
        photoAlbum.addPhoto("Graduation");
        photoAlbum.addPhoto("Birthday Party");
        photoAlbum.addPhoto("Holiday Trip");
        photoAlbum.displayPhotos();
        System.out.println("-----Search-----");
        String result = photoAlbum.searchPhoto("Wedding Day");
        System.out.println(result);
        System.out.println("-----Update-----");
        String update = photoAlbum.updatePhoto("Wedding Day", "Anniversary");
        System.out.println(update);
        photoAlbum.displayPhotos();
        System.out.println("-----Delete-----");
        String delete = photoAlbum.deletePhoto("Graduation");
        System.out.println(delete);
        photoAlbum.displayPhotos();
    }
}
