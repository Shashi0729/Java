public class ParksRunner {
    public static void main(String[] args) {
        Parks.Relax();
        Parks.VisitPark("Red Hills");
        System.out.println(Parks.GetParkCount());
        Parks.GetParkDetails(1);
    }
}


