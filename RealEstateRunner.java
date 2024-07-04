
public class RealEstateRunner {
    public static void main(String[] args) {
        RealEstate.Property();
        RealEstate.BuyProperty("Kalyan nagar Belagavi", 590005);
        System.out.println(RealEstate.GetPropertyCount());
        RealEstate.GetPropertyDetails(1);
    }
}

