
public class Industry {
    String name;
    String description;
    int year;
    String type;
    String sector;
    String details;

    Industry(String name) {
        this.name = name;
        System.out.println("Name: " + name);
        System.out.println("\n");
    }

    Industry(String name, String description) {
        this(name);
        this.description = description;
        System.out.println("Description: " + description);
        System.out.println("\n");
    }

    Industry(String name, String description, int year) {
        this(name, description);
        this.year = year;
        System.out.println("Year: " + year);
        System.out.println("\n");
    }

    Industry(String name, String description, int year, String type) {
        this(name, description, year);
        this.type = type;
        System.out.println("Type: " + type);
        System.out.println("\n");
    }

    Industry(String name, String description, int year, String type, String sector) {
        this(name, description, year, type);
        this.sector = sector;
        System.out.println("Sector: " + sector);
        System.out.println("\n");
    }

    Industry(String name, String description, int year, String type, String sector, String details) {
        this(name, description, year, type, sector);
        this.details = details;
        System.out.println("Details: " + details);
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Industry i = new Industry("Technology", "Software development", 1990, "Private", "IT", "Development of software solutions for various industries");
    }
}
