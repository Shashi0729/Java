
public class Movie {
    String title;
    String director;
    int year;
    String genre;
    String plot;
    String cast;

    Movie(String title) {
        this.title = title;
        System.out.println("Title: " + title);
        System.out.println("\n");
    }

    Movie(String title, String director) {
        this(title);
        this.director = director;
        System.out.println("Director: " + director);
        System.out.println("\n");
    }

    Movie(String title, String director, int year) {
        this(title, director);
        this.year = year;
        System.out.println("Year: " + year);
        System.out.println("\n");
    }

    Movie(String title, String director, int year, String genre) {
        this(title, director, year);
        this.genre = genre;
        System.out.println("Genre: " + genre);
        System.out.println("\n");
    }

    Movie(String title, String director, int year, String genre, String plot) {
        this(title, director, year, genre);
        this.plot = plot;
        System.out.println("Plot: " + plot);
        System.out.println("\n");
    }

    Movie(String title, String director, int year, String genre, String plot, String cast) {
        this(title, director, year, genre, plot);
        this.cast = cast;
        System.out.println("Cast: " + cast);
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Movie m = new Movie("The Shawshank Redemption", "Frank Darabont", 1994, "Drama", "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.", "Tim Robbins, Morgan Freeman");
    }
}
