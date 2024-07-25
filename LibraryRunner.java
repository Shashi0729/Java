

public class LibraryRunner {
    public static void main(String... args) {
        Library library = new Library();
        int length = library.getLength();
        System.out.println("Length is: " + length);
        library.addBook("To Kill a Mockingbird");
        library.addBook("1984");
        library.addBook("The Great Gatsby");
        library.addBook("Pride and Prejudice");
        library.addBook("The Catcher in the Rye");
        library.displayBooks();
        System.out.println("-----Search-----");
        String result = library.searchBook("1984");
        System.out.println(result);
        System.out.println("-----Update-----");
        String update = library.updateBook("1984", "Fahrenheit 451");
        System.out.println(update);
        library.displayBooks();
        System.out.println("-----Delete-----");
        String delete = library.deleteBook("Pride and Prejudice");
        System.out.println(delete);
        library.displayBooks();
    }
}
