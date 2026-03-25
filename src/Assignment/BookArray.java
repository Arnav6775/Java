package Assignment;

// Q19: Book array - store details of multiple books

public class BookArray {

    private String title;
    private String author;
    private double price;

    public BookArray(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.printf("  %-30s | %-20s | Rs. %.2f%n", title, author, price);
    }

    public static void main(String[] args) {
        System.out.println("=== Library Book Collection ===\n");

        BookArray[] books = {
            new BookArray("The Alchemist",          "Paulo Coelho",     350.00),
            new BookArray("Wings of Fire",          "A.P.J. Abdul Kalam", 400.00),
            new BookArray("Harry Potter",           "J.K. Rowling",      550.00),
            new BookArray("The White Tiger",        "Aravind Adiga",     299.00),
            new BookArray("A Brief History of Time","Stephen Hawking",   450.00)
        };

        System.out.printf("  %-30s | %-20s | %s%n", "Title", "Author", "Price");
        System.out.println("  " + "-".repeat(70));

        for (BookArray book : books) {
            book.displayDetails();
        }
    }
}
