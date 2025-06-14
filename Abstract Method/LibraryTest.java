interface LibraryItem {
    String getTitle();
    String getAuthor();
    int getYear();
    boolean isAvailable();
}

class Book implements LibraryItem {
    String title, author;
    int year;
    boolean available;

    Book(String t, String a, int y, boolean avail) {
        title = t;
        author = a;
        year = y;
        available = avail;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return available;
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        LibraryItem item = new Book("Harry Potter", "J.K. Rowling", 1997, true);
        System.out.println("Title: " + item.getTitle());
        System.out.println("Author: " + item.getAuthor());
        System.out.println("Year: " + item.getYear());
        System.out.println("Available: " + item.isAvailable());
    }
}
