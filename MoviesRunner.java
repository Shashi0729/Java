public class MoviesRunner {
    public static void main(String[] args) {
        Movies.Watch();
        Movies.BuyTicket("KGF", 10.50);
        System.out.println(Movies.GetMovieCount());
        Movies.GetMovieDetails(1);
    }
}

