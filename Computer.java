


class Computer {
    String brand;
    String model;
    int ram;
    int storage;
    int[] price;

    public Computer(String b, String m, int r, int s, int[] pr) {
        brand = b;
        model = m;
        ram = r;
        storage = s;
        price = pr;
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Storage: " + storage + "GB");
        for (int index = 0; index < pr.length; index++) {
            System.out.println("Price: " + price[index]);
        }
    }

    public static void main(String[] args) {
        int[] ia = {80000, 21000, 92000, 81500};
        Computer computer1 = new Computer("Apple", "MacBook Air", 8, 256, ia);
        Computer computer2 = new Computer("Dell", "XPS 15", 16, 512, ia);
        Computer computer3 = new Computer("HP", "Envy x360", 12, 256, ia);
        Computer computer4 = new Computer("Lenovo", "ThinkPad P53", 32, 1024, ia);
    }
}


