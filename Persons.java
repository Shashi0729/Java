
public class Persons {
    private String name;
    private int age;
    private String address;


    public Persons() {
        this("Unknown", 0, "Unknown");
    }

    public Persons(String name, int age) {
        this(name, age, "Unknown");
    }

   
    public Persons(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static void main(String[] args) {
        Persons person1 = new Persons();
        Persons person2 = new Persons("John", 30);
        Persons person3 = new Persons("Jane", 25, "123 Main St");

        System.out.println(person1.name + " " + person1.age + " " + person1.address);
        System.out.println(person2.name + " " + person2.age + " " + person2.address);
        System.out.println(person3.name + " " + person3.age + " " + person3.address);
    }
}
