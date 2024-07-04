public class MocktailsRunner {
    public static void main(String[] args) {
        Mocktails.Enjoy();
        Mocktails.OrderMocktail("Fruit punch", 4);
        System.out.println(Mocktails.GetMocktailCount());
        Mocktails.GetMocktailDetails(1);
    }
}

