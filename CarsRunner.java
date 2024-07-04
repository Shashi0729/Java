
public class CarsRunner {
    public static void main(String[] args) {
        Cars.Drive();
        Cars.BuyCar("BMW ", 6000000);
        System.out.println(Cars.GetCarCount());
        Cars.GetCarDetails(1);
    }
}

