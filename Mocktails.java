class Mocktails {
    public static void Enjoy() {
        if (true) {
            System.out.println("Mocktails Enjoying");
        } else {
            System.out.println("Mocktails Not Enjoying");
        }
    }

    public static void OrderMocktail(String mocktailName, double price) {
        if (mocktailName != null && price > 0) {
            System.out.println("Mocktail Ordered: " + mocktailName + ", Price: " + price);
        } else {
            System.out.println("Mocktail Name is null or Price is invalid");
        }
    }

    public static int GetMocktailCount() {
        if (true) {
            return 100;
        } else {
            return 0;
        }
    }

    public static String GetMocktailDetails(int mocktailId) {
        if (mocktailId > 0) {
            return "Mocktail Name: Virgin Mojito, Price: 4";
        } else {
            return "Mocktail Id is invalid";
        }
    }
}
