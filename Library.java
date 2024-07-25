
class Library {
    public String bookTitles[] = new String[4];
    public int index = 0;

    public int getLength() {
        return this.bookTitles.length;
    }

    public void addBook(String book) {
        if (this.index < this.getLength()) {
            this.bookTitles[index] = book;
            index++;
        }
    }

    public void displayBooks() {
        for (int i = 0; i < this.getLength(); i++) {
            System.out.println("Books are: " + bookTitles[i]);
        }
    }

    // Search
    public String searchBook(String book) {
        for (String b : bookTitles) {
            if (b == book) {
                System.out.println("Book is: " + b);
                return "Book found.";
            }
        }
        return "not found";
    }

    // Update
    public String updateBook(String oldBook, String newBook) {
        for (int i = 0; i < this.getLength(); i++) {
            if (oldBook == bookTitles[i]) {
                bookTitles[i] = newBook;
                return "Updated";
            }
        }
        return "not found";
    }

    // Delete
    public String deleteBook(String bookTitle) {
        for (int i = 0; i < this.getLength(); i++) {
            if (bookTitle == bookTitles[i]) {
                bookTitles[i] = null;
                return "Deleted";
            }
        }
        return "not found";
    }
}

