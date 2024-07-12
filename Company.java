public class Company {
     static String name;
     static String industry;
     static int employees;
     static String CEO;
     static String headquarters;
     static String founder;
     static int founded;
     static String website;
     static String mission;
     static String vision;

    public static void setName(String name) {
        Company.name = name;
		
    }

    public static void setIndustry(String industry) {
        Company.industry = industry;
    }

    public static void setEmployees(int employees) {
        Company.employees = employees;
    }

    public static void setCEO(String CEO) {
        Company.CEO = CEO;
    }

    public static void setHeadquarters(String headquarters) {
        Company.headquarters = headquarters;
    }

    public static void setFounder(String founder) {
        Company.founder = founder;
    }

    public static void setFounded(int founded) {
        Company.founded = founded;
    }

    public static void setWebsite(String website) {
        Company.website = website;
    }

    public static void setMission(String mission) {
        Company.mission = mission;
    }

    public static void setVision(String vision) {
        Company.vision = vision;
    }

    public static void main(String[] args) {
        setName("ABC Corporation");
        setIndustry("Technology");
        setEmployees(1000);
        setCEO("John Smith");
        setHeadquarters("New York");
        setFounder("Jane Doe");
        setFounded(2000);
        setWebsite("(link unavailable)");
        setMission("To innovate and inspire");
        setVision("To be a leader in the tech industry");

        System.out.println("Name: " + name);
        System.out.println("Industry: " + industry);
        System.out.println("Employees: " + employees);
        System.out.println("CEO: " + CEO);
        System.out.println("Headquarters: " + headquarters);
        System.out.println("Founder: " + founder);
        System.out.println("Founded: " + founded);
        System.out.println("Website: " + website);
        System.out.println("Mission: " + mission);
        System.out.println("Vision: " + vision);
    }
}


