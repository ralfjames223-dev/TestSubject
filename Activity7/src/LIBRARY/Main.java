package LIBRARY;

public class Main {
    public static void main(String[] args) {

        // Create books
        Book book1 = new Book("Java Basics", "J. Doe", "978-123456");
        Book book2 = new Book("OOP in Practice", "A. Smith", "978-789012");

        // Create member
        LibraryMember member = new LibraryMember("Alice", "M101");

        // Test borrowing
        member.borrowBook(book1);
        member.displayStatus();

        // Try to borrow again
        member.borrowBook(book2); // Should fail

        // Return book
        member.returnBook();

        // Now try to borrow book2
        member.borrowBook(book2);

        // Final status
        member.displayStatus();
    }

}