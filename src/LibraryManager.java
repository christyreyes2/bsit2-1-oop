import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {

    private ArrayList<String> books;
    private Scanner scanner;

    // Constructor initializes with sample books
    public LibraryManager() {
        books = new ArrayList<>();
        books.add("Java Programming");
        books.add("Web Development");
        books.add("Database Design");
        scanner = new Scanner(System.in);
    }

    // 1. Show books
    public void showBooks() {
        try {
            if (books == null) {
                throw new IllegalStateException("Book list is not initialized.");
            }
            System.out.println("\n--- Current Books ---");
            if (books.isEmpty()) {
                System.out.println("Library has no books.");
            } else {
                for (int i = 0; i < books.size(); i++) {
                    System.out.println((i + 1) + ". " + books.get(i));
                }
            }
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Display operation completed.\n");
        }
    }

    // 2. Add book
    public void addBook() {
        try {
            System.out.print("Enter book title to add: ");
            String title = scanner.nextLine().trim();

            if (title.isEmpty()) {
                throw new IllegalArgumentException("Book title cannot be empty!");
            }
            if (title.length() < 3) {
                throw new IllegalArgumentException("Book title must be at least 3 characters long!");
            }

            books.add(title);
            System.out.println("Book '" + title + "' added successfully!");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Add book operation completed.\n");
        }
    }

    // 3. Remove book
    public void removeBook() {
        try {
            if (books.isEmpty()) {
                System.out.println("Library is empty. Cannot remove any book.");
                return;
            }

            System.out.print("Enter book number to remove (1-" + books.size() + "): ");
            String input = scanner.nextLine();
            int index = Integer.parseInt(input);

            if (index < 1 || index > books.size()) {
                System.out.println("Error: Invalid book number! Please enter between 1 and " + books.size() + ".");
                return;
            }

            String removedBook = books.remove(index - 1);
            System.out.println("Book '" + removedBook + "' removed successfully!");

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number!");
        } finally {
            System.out.println("Remove book operation completed.\n");
        }
    }

