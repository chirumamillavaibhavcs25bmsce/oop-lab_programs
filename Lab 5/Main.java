import java.util.Scanner;

class Book {
    int bookID;
    String title;
    String author;
    double price;

    static int count = 0;

    Book(int bookID, String title, String author, double price) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.price = price;
        count++;
    }

    void display() {
        System.out.println("Book ID : " + bookID);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.println("Price   : " + price);
        System.out.println("-------------------------");
    }

    boolean search(int id) {
        return bookID == id;
    }

    boolean search(String title) {
        return this.title.equalsIgnoreCase(title);
    }

    Book costlier(Book b) {
        if (this.price > b.price)
            return this;
        else
            return b;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Enter the number of books
        System.out.print("Enter the number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        if (n <= 0) {
            System.out.println("Please enter a valid number of books.");
            sc.close();
            return;
        }

        // Create an array of books
        Book[] books = new Book[n];

        // Enter book details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Book " + (i + 1));

            System.out.print("Enter Book ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Book Title: ");
            String title = sc.nextLine();

            System.out.print("Enter Author Name: ");
            String author = sc.nextLine();

            System.out.print("Enter Book Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            books[i] = new Book(id, title, author, price);
        }

        // Display all books
        System.out.println("\n========== ALL BOOKS ==========");

        for (Book b : books) {
            b.display();
        }

        // Search book by ID
        System.out.print("\nEnter Book ID to search: ");
        int searchID = sc.nextInt();

        boolean found = false;

        for (Book b : books) {
            if (b.search(searchID)) {
                System.out.println("\nBook Found!");
                b.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nBook Not Found!");
        }

        // Find the costliest book
        Book costly = books[0];

        for (int i = 1; i < n; i++) {
            costly = costly.costlier(books[i]);
        }

        System.out.println("\n========== COSTLIEST BOOK ==========");
        costly.display();

        // Display total books
        System.out.println("Total Books Created: " + Book.count);

        sc.close();
    }
}