public class PoliceStationRunner {
    public static void main(String[] args) {
        PoliceStation.Help();
        PoliceStation.ReportCrime("Murder", "Bengaluru");
        System.out.println(PoliceStation.GetPoliceCount());
        PoliceStation.GetPoliceDetails(1);
    }
}

