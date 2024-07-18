public class TeacherRunner {
    public static void main(String[] args) {
        Teacher teacher0 = new Teacher();
        Teacher teacher1 = new Teacher("Rohan");
        Teacher teacher2 = new Teacher("Rohan", "Sharma");
        Teacher teacher3 = new Teacher("Rohan", "Sharma", "Mathematics");
        Teacher teacher4 = new Teacher("Rohan", "Sharma", "Mathematics", "Science");
        Teacher teacher5 = new Teacher("Rohan", "Sharma", "Mathematics", "Science", "Harvard");
        Teacher teacher6 = new Teacher("Rohan", "Sharma", "Mathematics", "Science", "Harvard", "johndoe@harvard.edu");
        Teacher teacher7 = new Teacher("Rohan", "Sharma", "Mathematics", "Science", "Harvard", "johndoe@harvard.edu", "1234567890");
        Teacher teacher8 = new Teacher("Rohan", "Sharma", "Mathematics", "Science", "Harvard", "johndoe@harvard.edu", "1234567890", "123 Main St");
        Teacher teacher9 = new Teacher("Rohan", "Sharma", "Mathematics", "Science", "Harvard", "johndoe@harvard.edu", "1234567890", "123 Main St", "Algebra");
        Teacher teacher10 = new Teacher("Rohan", "Sharma", "Mathematics", "Science", "Harvard", "johndoe@harvard.edu", "1234567890", "123 Main St", "Algebra", "Journal of Mathematics");
    }
}

