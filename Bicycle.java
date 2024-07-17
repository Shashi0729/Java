

public class Bicycle {
    String brand;
    String model;
    int gears;
    String color;
    int[] price;

    public Bicycle(String b, String m, int g, String c, int[] pr) {
        brand = b;
        model = m;
        gears = g;
        color = c;
        price = pr;
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Gears: " + gears);
        System.out.println("Color: " + color);
        for (int index = 0; index < pr.length; index++) {
            System.out.println("Price: " + price[index]);
        }
    }

    public static void main(String[] args) {
        int[] ia = {200, 300, 400, 500};
        Bicycle bicycle1 = new Bicycle("Trek", "Emonda", 21, "Red", ia);
        Bicycle bicycle2 = new Bicycle("Cannondale", "Synapse", 15, "Blue", ia);
        Bicycle bicycle3 = new Bicycle("Schwinn", "Phantom", 7, "Green", ia);
        Bicycle bicycle4 = new Bicycle("Giant", "TCR", 30, "Yellow", ia);
    }
}


