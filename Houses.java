
public class Houses {
    String location;
    int bedrooms;
    int bathrooms;
    int squareFootage;
    boolean hasBackyard;
    int[] price;

    public Houses(String l, int b, int ba, int sf, boolean hb, int[] pr) {
        location = l;
        bedrooms = b;
        bathrooms = ba;
        squareFootage = sf;
        hasBackyard = hb;
        price = pr;
        System.out.println("Location: " + location);
        System.out.println("Bedrooms: " + bedrooms);
        System.out.println("Bathrooms: " + bathrooms);
        System.out.println("Square Footage: " + squareFootage);
        System.out.println("Has Backyard: " + hasBackyard);
        for (int index = 0; index < pr.length; index++) {
            System.out.println("Price: " + price[index]);
        }
    }

    public static void main(String[] args) {
        int[] ia = {200000, 300000, 400000, 500000};
        Houses house1 = new Houses("Suburbs", 3, 2, 1200, true, ia);
        Houses house2 = new Houses("City", 4, 3, 2500, false, ia);
        Houses house3 = new Houses("Rural", 2, 1, 1000, true, ia);
        Houses house4 = new Houses("Beach", 5, 4, 3500, false, ia);
    }
}


