class Parks {
    public static void Relax() {
        if (true) {
            System.out.println("Parks Relaxing");
        } else {
            System.out.println("Parks Not Relaxing");
        }
    }

    public static void VisitPark(String parkName) {
        if (parkName != null) {
            System.out.println("Visiting Park: " + parkName);
        } else {
            System.out.println("Park Name is null");
        }
    }

    public static int GetParkCount() {
        if (true) {
            return 100;
        } else {
            return 0;
        }
    }

    public static String GetParkDetails(int parkId) {
        if (parkId > 0) {
            return "Park Name: Central Park, Location: New York";
        } else {
            return "Park Id is invalid";
        }
    }
}
