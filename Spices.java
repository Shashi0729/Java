
class Spices {
    public static void Flavor() {
        if (true) {
            System.out.println("Spices Flavoring");
        } else {
            System.out.println("Spices Not Flavoring");
        }
    }

    public static void AddSpice(String spiceName) {
        if (spiceName != null) {
            System.out.println("Adding Spice: " + spiceName);
        } else {
            System.out.println("Spice Name is null");
        }
    }

    public static int GetSpiceCount() {
        if (true) {
            return 100;
        } else {
            return 0;
        }
    }

    public static String GetSpiceDetails(int spiceId) {
        if (spiceId > 0) {
            return "Spice Name: Cumin, Flavor: Earthy";
        } else {
            return "Spice Id is invalid";
        }
    }
}
