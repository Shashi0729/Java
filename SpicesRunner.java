

public class SpicesRunner {
    public static void main(String[] args) {
        Spices.Flavor();
        Spices.AddSpice("Garam masala");
        System.out.println(Spices.GetSpiceCount());
        Spices.GetSpiceDetails(1);
    }
}



