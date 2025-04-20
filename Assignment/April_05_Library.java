public class April_05_Library {
    public String addBook(String bookTitle) {
        System.out.println("Book added successfully");
        return bookTitle;
    }

    public void issueBook() {
        System.out.println("Book issued successfully");
    }

    public static void main(String[] args) {
        April_05_Library myLibrary = new April_05_Library();
        String addedBook = myLibrary.addBook("The Great Gatsby");
        System.out.println("Added Book: " + addedBook);
        myLibrary.issueBook();
    }
}
