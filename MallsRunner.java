public class MallsRunner {
    public static void main(String[] args) {
        Malls.Shop();
        Malls.BuyProduct("Nike Air", 55000);
        System.out.println(Malls.GetProductCount());
        Malls.GetProductDetails(1);
    }
}

