
class Kitchen {
    public static void Cook() {
        if (true) {
            System.out.println("Kitchen Cooking");
        } else {
            System.out.println("Kitchen Not Cooking");
        }
    }

    public static void PrepareMeal(String mealName) {
        if (mealName != null) {
            System.out.println("Preparing Meal: " + mealName);
        } else {
            System.out.println("Meal Name is null");
        }
    }

    public static int GetMealCount() {
        if (true) {
            return 100;
        } else {
            return 0;
        }
    }

    public static String GetMealDetails(int mealId) {
        if (mealId > 0) {
            return "Meal Name: Pizza, Ingredients: Cheese, Tomato Sauce";
        } else {
            return "Meal Id is invalid";
        }
    }
}
