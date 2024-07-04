public class MeeshoRunner {
    public static void main(String[] args) {
        Meesho.Shop();
        Meesho.BuyProduct("iphone Mobile", 500);
        System.out.println(Meesho.GetProductCount());
        Meesho.GetProductDetails(1);
    }
}

