public class KitchenRunner {
    public static void main(String[] args) {
        Kitchen.Cook();
        Kitchen.PrepareMeal("Chicken Meal");
        System.out.println(Kitchen.GetMealCount());
        Kitchen.GetMealDetails(1);
    }
}