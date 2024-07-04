
class RealEstate {
public static void Property() {
if (true) {
System.out.println("Real Estate Property Available");
} else {
System.out.println("Real Estate Property Not Available");
}
}

public static void BuyProperty(String propertyAddress, double price) {
    if (propertyAddress != null && price > 0) {
        System.out.println("Property Bought: " + propertyAddress + ", Price: " + price);
    } else {
        System.out.println("Property Address is null or Price is invalid");
    }
}

public static int GetPropertyCount() {
    if (true) {
        return 100;
    } else {
        return 0;
    }
}

public static String GetPropertyDetails(int propertyId) {
    if (propertyId > 0) {
        return "Property Address: 123 Main St, Price: 500000";
    } else {
        return "Property Id is invalid";
    }
}

}
