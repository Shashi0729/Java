

public class Shoes {
    String brand;
    String style;
    int size;
    String color;
    String material;
    double price;

    Shoes(String brand) {
        this.brand = brand;
    }

    Shoes(String brand, String style) {
        this.brand = brand;
        this.style = style;
    }

    Shoes(String brand, String style, int size) {
        this.brand = brand;
        this.style = style;
        this.size = size;
    }

    Shoes(String brand, String style, int size, String color) {
        this.brand = brand;
        this.style = style;
        this.size = size;
        this.color = color;
    }

    Shoes(String brand, String style, int size, String color, String material) {
        this.brand = brand;
        this.style = style;
        this.size = size;
        this.color = color;
        this.material = material;
    }

    Shoes(String brand, String style, int size, String color, String material, double price) {
        this.brand = brand;
        this.style = style;
        this.size = size;
        this.color = color;
        this.material = material;
        this.price = price;
    }

    public static void main(String[] args) {
        Shoes s1 = new Shoes("Nike");
        Shoes s2 = new Shoes("Adidas", "Superstar");
        Shoes s3 = new Shoes("Vans", "Old Skool", 8);
        Shoes s4 = new Shoes("Converse", "Chuck Taylor", 10, "Black");
        Shoes s5 = new Shoes("Reebok", "Classic Leather", 9, "White", "Leather");
        Shoes s6 = new Shoes("New Balance", "574", 11, "Grey", "Mesh", 79.99);

        System.out.println("Shoes 1: " + s1.brand);
        System.out.println("Shoes 2: " + s2.brand + ", " + s2.style);
        System.out.println("Shoes 3: " + s3.brand + ", " + s3.style + ", " + s3.size);
        System.out.println("Shoes 4: " + s4.brand + ", " + s4.style + ", " + s4.size + ", " + s4.color);
        System.out.println("Shoes 5: " + s5.brand + ", " + s5.style + ", " + s5.size + ", " + s5.color + ", " + s5.material);
        System.out.println("Shoes 6: " + s6.brand + ", " + s6.style + ", " + s6.size + ", " + s6.color + ", " + s6.material + ", $" + s6.price);
    }
}
