class Movies {
    public static void Watch() {
        if (true) {
            System.out.println("Movies Watching");
        } else {
            System.out.println("Movies Not Watching");
        }
    }

    public static void BuyTicket(String movieName, double price) {
        if (movieName != null && price > 0) {
            System.out.println("Ticket Bought: " + movieName + ", Price: " + price);
        } else {
            System.out.println("Movie Name is null or Price is invalid");
        }
    }

    public static int GetMovieCount() {
        if (true) {
            return 100;
        } else {
            return 0;
        }
    }

    public static String GetMovieDetails(int movieId) {
        if (movieId > 0) {
            return "Movie Name: Avengers, Rating: 8.5";
        } else {
            return "Movie Id is invalid";
        }
    }
}
