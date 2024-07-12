
public class Uta{
 public static final int PRICE = 10; 

public static void displayFoodItems(String foodItemName, int quantity) {
System.out.println(foodItemName + " x " + quantity + " = " + (quantity * PRICE));
}

public static void main(String[] args) {
String[] foodItems = {"Pizza", "Burger", "Sandwich", "Salad", "Fries", "Coke", "Water", "Apple", "Banana", "Orange", "Chicken", "Rice", "Noodles", "Soup", "Ice Cream", "Cake", "Donut", "Muffin", "Coffee", "Tea"};
int quantity = 3; 
for (String foodItem : foodItems) {
displayFoodItems(foodItem, quantity);
}
}
}
