
public class Puma {
    String color;
    String style;
    int size;
    String material;
    double price;
    String collection;

    Puma(String color) {
        this.color = color;
    }

    Puma(String color, String style) {
        this.color = color;
        this.style = style;
    }

    Puma(String color, String style, int size) {
        this.color = color;
        this.style = style;
        this.size = size;
    }

    Puma(String color, String style, int size, String material) {
        this.color = color;
        this.style = style;
        this.size = size;
        this.material = material;
    }

    Puma(String color, String style, int size, String material, double price) {
        this.color = color;
        this.style = style;
        this.size = size;
        this.material = material;
        this.price = price;
    }

    Puma(String color, String style, int size, String material, double price, String collection) {
        this.color = color;
        this.style = style;
        this.size = size;
        this.material = material;
        this.price = price;
        this.collection = collection;
    }

    public static void main(String[] args) {
        Puma p1 = new Puma("Red");
        Puma p2 = new Puma("Blue", "Suede");
        Puma p3 = new Puma("Black", "Fenty", 7);
        Puma p4 = new Puma("White", "Adidas", 9, "Leather");
        Puma p5 = new Puma("Grey", "Reebok", 10, "Mesh", 79.99);
        Puma p6 = new Puma("Green", "New Balance", 11, "Synthetic", 89.99, "Limited Edition");

        System.out.println("Puma 1: " + p1.color);
        System.out.println("Puma 2: " + p2.color + ", " + p2.style);
        System.out.println("Puma 3: " + p3.color + ", " + p3.style + ", " + p3.size);
        System.out.println("Puma 4: " + p4.color + ", " + p4.style + ", " + p4.size + ", " + p4.material);
        System.out.println("Puma 5: " + p5.color + ", " + p5.style + ", " + p5.size + ", " + p5.material + ", $" + p5.price);
        System.out.println("Puma 6: " + p6.color + ", " + p6.style + ", " + p6.size + ", " + p6.material + ", $" + p6.price + ", " + p6.collection);
    }
}
