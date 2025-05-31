package Encapsulation;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private boolean available;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.publicationYear = year;
        this.available = true;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    public void returnBook() {
        available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public String getTitle() {
        return title;
    }

    public static void main(String[] args) {
        Book book = new Book("Java Basics", "John Smith", 2021);
        book.borrowBook();
        System.out.println("Availability: " + book.isAvailable());
        book.returnBook();
        System.out.println("Availability after return: " + book.isAvailable());
    }
}
