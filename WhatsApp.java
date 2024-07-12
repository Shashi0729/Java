public class WhatsApp {
     static String name;
     static int age;
     static String city;
     static String country;
     static long phoneNumber;

    public static void setInfo(String name) {
        WhatsApp.name = name;
    }

    public static void setInfo(int age) {
        WhatsApp.age = age;
    }

    public static void setInfo(String city, String country) {
        WhatsApp.city = city;
        WhatsApp.country = country;
    }

    public static void setInfo(long phoneNumber) {
        WhatsApp.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
        setInfo("John Doe");
        setInfo(30);
        setInfo("New York", "USA");
        setInfo(1234567890);

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
        System.out.println("Phone Number: " + phoneNumber);
    }
}


