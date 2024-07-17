
public class Book {
    String title;
    String author;
    int pages;
    String publisher;
	int[] price;

    public Book(String t, String a, int p, String pub, int[] pr) {
        title = t;
        author = a;
        pages = p;
        publisher = pub;
        price = pr;
    

    
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Publisher: " + publisher);
		for(int index=0;index<pr.length;index++){
        System.out.println("price:"+price[index]);
    }
	}

    public static void main(String[] args) {
		int[] ia={200,300,400,500};
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 281, "J.B. Lippincott & Co.", ia);
        Book book2 = new Book("1984", "George Orwell", 328, "Secker and Warburg", ia);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180, "Charles Scribner's Sons", ia);
        Book book4 = new Book("Pride and Prejudice", "Jane Austen", 272, "T. Egerton, Whitehall", ia);


    }
}
