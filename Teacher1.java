
public class Teacher {
    String firstName, lastName, subject, department, university, email, phone, address, researchArea, publication;

    public Teacher() {
        System.out.println("0 Arguments:");
    }

    public Teacher(String firstName) {
        this.firstName = firstName;
        System.out.println("1 Argument:");
        System.out.println(firstName);
    }

    public Teacher(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("2 Argument:");
        System.out.println(firstName + " " + lastName);
    }

    public Teacher(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        System.out.println("3 Argument:");
        System.out.println(firstName + " " + lastName + " " + subject);
    }

    public Teacher(String firstName, String lastName, String subject, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.department = department;
        System.out.println("4 Argument:");
        System.out.println(firstName + " " + lastName + " " + subject + " " + department);
    }

    public Teacher(String firstName, String lastName, String subject, String department, String university) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.department = department;
        this.university = university;
        System.out.println("5 Argument:");
        System.out.println(firstName + " " + lastName + " " + subject + " " + department + " " + university);
    }

    public Teacher(String firstName, String lastName, String subject, String department, String university, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.department = department;
        this.university = university;
        this.email = email;
        System.out.println("6 Argument:");
        System.out.println(firstName + " " + lastName + " " + subject + " " + department + " " + university + " " + email);
    }

    public Teacher(String firstName, String lastName, String subject, String department, String university, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.department = department;
        this.university = university;
        this.email = email;
        this.phone = phone;
        System.out.println("7 Argument:");
        System.out.println(firstName + " " + lastName + " " + subject + " " + department + " " + university + " " + email + " " + phone);
    }

    public Teacher(String firstName, String lastName, String subject, String department, String university, String email, String phone, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.department = department;
        this.university = university;
        this.email = email;
        this.phone = phone;
        this.address = address;
        System.out.println("8 Argument:");
        System.out.println(firstName + " " + lastName + " " + subject + " " + department + " " + university + " " + email + " " + phone + " " + address);
    }

    public Teacher(String firstName, String lastName, String subject, String department, String university, String email, String phone, String address, String researchArea) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.department = department;
        this.university = university;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.researchArea = researchArea;
        System.out.println("9 Argument:");
        System.out.println(firstName + " " + lastName + " " + subject + " " + department + " " + university + " " + email + " " + phone + " " + address + " " + researchArea);
    }

	public Teacher(String firstName, String lastName, String subject, String department, String university, String email, String phone, String address, String researchArea, String publication) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.subject = subject;
    this.department = department;
    this.university = university;
    this.email = email;
    this.phone = phone;
    this.address = address;
    this.researchArea = researchArea;
    this.publication = publication;
    System.out.println("10 Argument:");
    System.out.println(firstName + " " + lastName + " " + subject + " " + department + " " + university + " " + email + " " + phone + " " + address + " " + researchArea + " " + publication);
	}
	}
