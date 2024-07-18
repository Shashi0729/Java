
public class Person {
    String firstName, lastName, address, city, state, zip, phone, email, occupation, nationality;

    public Person() {
        System.out.println("0 Arguments:");
    }

    public Person(String firstName) {
        this.firstName = firstName;
        System.out.println("1 Argument:");
		System.out.println(firstName);
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("2 Argument:");
		 System.out.println(firstName+" "+lastName);
    }

    public Person(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
         System.out.println("3 Argument:");
		 System.out.println(firstName+" "+lastName+" "+address);
    }

    public Person(String firstName, String lastName, String address, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
		System.out.println("4 Argument:");
		 System.out.println(firstName+" "+lastName+" "+address+" "+city);
      
    }

    public Person(String firstName, String lastName, String address, String city, String state) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
     System.out.println("5 Argument:");
		 System.out.println(firstName+" "+lastName+" "+address+" "+city+" "+state);
    }

    public Person(String firstName, String lastName, String address, String city, String state, String zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
		 System.out.println("6 Argument:");
		 System.out.println(firstName+" "+lastName+" "+address+" "+city+" "+state+" "+zip);
        
    }

    public Person(String firstName, String lastName, String address, String city, String state, String zip, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
				 System.out.println("7 Argument:");
		 System.out.println(firstName+" "+lastName+" "+address+" "+city+" "+state+" "+zip+" "+phone);
        
    }

    public Person(String firstName, String lastName, String address, String city, String state, String zip, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
						 System.out.println("8 Argument:");
		 System.out.println(firstName+" "+lastName+" "+address+" "+city+" "+state+" "+zip+" "+phone+" "+email);
       
    }

    public Person(String firstName, String lastName, String address, String city, String state, String zip, String phone, String email, String occupation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
        this.occupation = occupation;
		 System.out.println("9 Argument:");
		 System.out.println(firstName+" "+lastName+" "+address+" "+city+" "+state+" "+zip+" "+phone+" "+email+" "+occupation);
  
    }

    public Person(String firstName, String lastName, String address, String city, String state, String zip, String phone, String email, String occupation, String nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
        this.occupation = occupation;
        this.nationality = nationality;
		 System.out.println("10 Argument:");
		 System.out.println(firstName+" "+lastName+" "+address+" "+city+" "+state+" "+zip+" "+phone+" "+email+" "+occupation+" "+nationality);
    }
}
