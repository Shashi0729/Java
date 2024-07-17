

public class Phone {
    String brand;
    String model;
    int storage;
    String color;
    int[] price;

    public Phone(String b, String m, int s, String c, int[] pr) {
        brand = b;
        model = m;
        storage = s;
        color = c;
        price = pr;
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storage + "GB");
        System.out.println("Color: " + color);
        for (int index = 0; index < pr.length; index++) {
            System.out.println("Price: " + price[index]);
        }
    }

    public static void main(String[] args) {
        int[] ia = {20000, 30000, 40000, 50000};
        Phone phone1 = new Phone("Apple", "iPhone 13", 128, "Space Gray", ia);
        Phone phone2 = new Phone("Samsung", "Galaxy S22", 256, "Phantom Black", ia);
        Phone phone3 = new Phone("Google", "Pixel 6", 128, "Seafoam Green", ia);
        Phone phone4 = new Phone("OnePlus", "9 Pro", 256, "Morning Mist", ia);
    }
}


