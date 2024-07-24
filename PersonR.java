
public class PersonsR {

    public static void main(String[] args) {
        Persons person1 = new Persons();
        Persons person2 = new Persons("Ramesh", 30);
        Persons person3 = new Persons("Suresh", 25, "123 Main St");

        System.out.println(person1.name + " " + person1.age + " " + person1.address);
        System.out.println(person2.name + " " + person2.age + " " + person2.address);
        System.out.println(person3.name + " " + person3.age + " " + person3.address);
    }
}
