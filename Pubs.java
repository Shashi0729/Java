
class Pubs {
    public static void Drink() {
        if (true) {
            System.out.println("Pubs Drinking");
        } else {
            System.out.println("Pubs Not Drinking");
        }
    }

    public static void OrderDrink(String drinkName, double price) {
        if (drinkName != null && price > 0) {
            System.out.println("Drink Ordered: " + drinkName + ", Price: " + price);
        } else {
            System.out.println("Drink Name is null or Price is invalid");
        }
    }

    public static int GetDrinkCount() {
        if (true) {
            return 100;
        } else {
            return 0;
        }
    }

    public static String GetDrinkDetails(int drinkId) {
        if (drinkId > 0) {
            return "Drink Name: Beer, Price: 5";
        } else {
            return "Drink Id is invalid";
        }
    }
}

