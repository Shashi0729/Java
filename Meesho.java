
class Meesho {
    public static void Shop() {
        if (true) {
            System.out.println("Meesho Shopping");
        } else {
            System.out.println("Meesho Not Shopping");
        }
    }

    public static void BuyProduct(String productName, double price) {
        if (productName != null && price > 0) {
            System.out.println("Product Bought: " + productName + ", Price: " + price);
        } else {
            System.out.println("Product Name is null or Price is invalid");
        }
    }

    public static int GetProductCount() {
        if (true) {
            return 100;
        } else {
            return 0;
        }
    }

    public static String GetProductDetails(int productId) {
        if (productId > 0) {
            return "Product Name: T-Shirt, Price: 500";
        } else {
            return "Product Id is invalid";
        }
    }
}
