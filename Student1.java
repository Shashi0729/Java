
public class Student {
    String firstName, lastName, major, university, graduationDate, GPA, studentID, address, phone, email;

    public Student() {
        System.out.println("0 Arguments:");
    }

    public Student(String firstName) {
        this.firstName = firstName;
        System.out.println("1 Argument:");
        System.out.println(firstName);
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("2 Argument:");
        System.out.println(firstName + " " + lastName);
    }

    public Student(String firstName, String lastName, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        System.out.println("3 Argument:");
        System.out.println(firstName + " " + lastName + " " + major);
    }

    public Student(String firstName, String lastName, String major, String university) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.university = university;
        System.out.println("4 Argument:");
        System.out.println(firstName + " " + lastName + " " + major + " " + university);
    }

    public Student(String firstName, String lastName, String major, String university, String graduationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.university = university;
        this.graduationDate = graduationDate;
        System.out.println("5 Argument:");
        System.out.println(firstName + " " + lastName + " " + major + " " + university + " " + graduationDate);
    }

    public Student(String firstName, String lastName, String major, String university, String graduationDate, String GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.university = university;
        this.graduationDate = graduationDate;
        this.GPA = GPA;
        System.out.println("6 Argument:");
        System.out.println(firstName + " " + lastName + " " + major + " " + university + " " + graduationDate + " " + GPA);
    }

    public Student(String firstName, String lastName, String major, String university, String graduationDate, String GPA, String studentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.university = university;
        this.graduationDate = graduationDate;
        this.GPA = GPA;
        this.studentID = studentID;
        System.out.println("7 Argument:");
        System.out.println(firstName + " " + lastName + " " + major + " " + university + " " + graduationDate + " " + GPA + " " + studentID);
    }

    public Student(String firstName, String lastName, String major, String university, String graduationDate, String GPA, String studentID, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.university = university;
        this.graduationDate = graduationDate;
        this.GPA = GPA;
        this.studentID = studentID;
        this.address = address;
        System.out.println("8 Argument:");
        System.out.println(firstName + " " + lastName + " " + major + " " + university + " " + graduationDate + " " + GPA + " " + studentID + " " + address);
    }

    public Student(String firstName, String lastName, String major, String university, String graduationDate, String GPA, String studentID, String address, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.university = university;
        this.graduationDate = graduationDate;
        this.GPA = GPA;
        this.studentID = studentID;
        this.address = address;
        this.phone = phone;
        System.out.println("9 Argument:");
        System.out.println(firstName + " " + lastName + " " + major + " " + university + " " + graduationDate + " " + GPA + " " + studentID + " " + address + " " + phone);
    }

    public Student(String firstName, String lastName, String major, String university, String graduationDate, String GPA, String studentID, String address, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.university = university;
        this.graduationDate = graduationDate;
        this.GPA = GPA;
        this.studentID = studentID;
        this.address = address;
        this.phone = phone;
        this.email = email;
        System.out.println("10 Argument:");
        System.out.println(firstName + " " + lastName + " " + major + " " + university + " " + graduationDate + " " + GPA + " " + studentID + " " + address + " "+phone+" "+email)
