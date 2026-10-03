package LIBRARY;

public class LibraryMember {

    private String name;
    private String memberId;
    private Book borrowedBook;

    public LibraryMember(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBook = null;
    }

    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }

    public Book getBorrowedBook() {
        return borrowedBook;
    }

    public void borrowBook(Book book) {

        if (this.borrowedBook != null) {
            System.out.println("You already have a book: " + this.borrowedBook.getTitle());

        } else if (book.isBorrowed()) {
            System.out.println(book.getTitle() + " is currently unavailable.");

        } else {
            this.borrowedBook = book;
            book.setBorrowed(true);

            System.out.println(this.name + " borrowed " + book.getTitle() + ".");
        }
    }

    public void returnBook() {

        if (this.borrowedBook == null) {
            System.out.println("No book to return.");

        } else {
            String title = this.borrowedBook.getTitle();
            this.borrowedBook.setBorrowed(false);
            this.borrowedBook = null;

            System.out.println(this.name + " returned " + title + ".");
        }
    }

    public void displayStatus() {
        System.out.println("Member: " + this.name + " (ID: " + this.memberId + ")");

        if (this.borrowedBook != null) {
            System.out.print("Current Book: ");
            this.borrowedBook.displayInfo();
        } else {
            System.out.println("Current Book: None");
        }
    }
}