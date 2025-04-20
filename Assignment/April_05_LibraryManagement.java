public class April_05_LibraryManagement {
    public static void main(String[] args) {
        April_05_Library lib = new April_05_Library();
        String book = lib.addBook("1984");
        System.out.println("Added Book: " + book);
        lib.issueBook();
    }
}
