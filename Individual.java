public class Individual {
    int id;
    String name;
    String address;

    Individual(int id, String name, String address) {
       this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        Individual p1 = new Individual(1, "John Doe", "123 Main St");
        Individual p2 = new Individual(2, "Jane Smith", "456 Elm St");
        Individual p3 = new Individual(3, "Bob Johnson", "789 Oak St");
        Individual p4 = new Individual(4, "Alice Brown", "1011 Park Ave");
        Individual p5 = new Individual(5, "Mike Davis", "1213 Hill Rd");

        System.out.println("Person 1: " + p1.id + ", " + p1.name + ", " + p1.address);
        System.out.println("Person 2: " + p2.id + ", " + p2.name + ", " + p2.address);
        System.out.println("Person 3: " + p3.id + ", " + p3.name + ", " + p3.address);
        System.out.println("Person 4: " + p4.id + ", " + p4.name + ", " + p4.address);
        System.out.println("Person 5: " + p5.id + ", " + p5.name + ", " + p5.address);
    }
}
