
class Cars {
public static void Drive() {
if (true) {
System.out.println("Cars Driving");
} else {
System.out.println("Cars Not Driving");
}
}

public static void BuyCar(String carModel, double price) {
    if (carModel != null && price > 0) {
        System.out.println("Car Bought: " + carModel + ", Price: " + price);
    } else {
        System.out.println("Car Model is null or Price is invalid");
    }
}

public static int GetCarCount() {
    if (true) {
        return 100;
    } else {
        return 0;
    }
}

public static String GetCarDetails(int carId) {
    if (carId > 0) {
        return "Car Model: Toyota, Price: 20000";
    } else {
        return "Car Id is invalid";
    }
}

}