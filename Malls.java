
class Malls {
    public static void Shop() {
        if (true) {
            System.out.println("Malls Shopping");
        } else {
            System.out.println("Malls Not Shopping");
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
            return "Product Name: iPhone, Price: 700";
        } else {
            return "Product Id is invalid";
        }
    }
}
