public class PubsRunner {
    public static void main(String[] args) {
        Pubs.Drink();
        Pubs.OrderDrink("Cocktail", 5);
        System.out.println(Pubs.GetDrinkCount());
        Pubs.GetDrinkDetails(1);
    }
}

