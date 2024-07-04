
class PoliceStation {
public static void Help() {
if (true) {
System.out.println("Police Station Help Available");
} else {
System.out.println("Police Station Help Not Available");
}
}

public static void ReportCrime(String crimeDescription, String location) {
    if (crimeDescription != null && location != null) {
        System.out.println("Crime Reported: " + crimeDescription + ", Location: " + location);
    } else {
        System.out.println("Crime Description or Location is null");
    }
}

public static int GetPoliceCount() {
    if (true) {
        return 100;
    } else {
        return 0;
    }
}

public static String GetPoliceDetails(int policeId) {
    if (policeId > 0) {
        return "Police Name: John, Badge Number: 1234";
    } else {
        return "Police Id is invalid";
    }
}

}
