
public class Customer {
    int id;
    String name;
    String address;
	String phone;
	String email;
	int age;

    Customer(int id) {
      this.id = id;
    }

    Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Customer(int id, String name, String address) {
        this.id  = id;
        this.name = name;
        this.address = address;
    }

    Customer(int id, String name, String address, int age) {
        this.id  = id;
        this.name = name;
        this.address = address;
		this.age = age;
    }

    Customer(int id, String name, String address, int age, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
		this.age = age;
		this.phone = phone;
    }

    Customer(int id, String name, String address, int age, String phone, String email) {
        this.id  = id;
        this.name = name;
        this.address = address;
		this.age = age;
		this.phone = phone;
		this.email = email;
    }

    public static void main(String[] args) {
        Customer p1 = new Customer(1);
        Customer p2 = new Customer(2, "John Doe");
        Customer p3 = new Customer(3, "Jane Smith", "123 Main St");
        Customer p4 = new Customer(4, "Bob Johnson", "456 Elm St", 30);
        Customer p5 = new Customer(5, "Alice Brown", "789 Oak St", 25, "123-456-7890");
        Customer p6 = new Customer(6, "Mike Davis", "1213 Hill Rd", 40, "098-765-4321", "mike.davis@email.com");

        System.out.println("Customer 1: " + p1.id);
        System.out.println("Customer 2: " + p2.id + ", " + p2.name);
        System.out.println("Customer 3: " + p3.id + ", " + p3.name + ", " + p3.address);
        System.out.println("Customer 4: " + p4.id + ", " + p4.name + ", " + p4.address+ ", " + p4.age);
        System.out.println("Customer 5: " + p5.id + ", " + p5.name + ", " + p5.address+ ", " + p5.age+ ", " + p5.phone);
        System.out.println("Customer 6: " + p6.id + ", " + p6.name + ", " + p6.address+ ", " + p6.age+ ", " + p6.phone+ ", " + p6.email);
    }
}
