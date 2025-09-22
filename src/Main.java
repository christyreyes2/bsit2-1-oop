public class Main {
    public static void main(String[] args) {
        System.out.println("≡≡ Library Management System ≡≡\n");

        Library library = new Library();

        System.out.println("Adding books to library...");
        try {
            Book book1 = new Book("Java Programming", "John Smith", "1234567890", 2020);
            Book book2 = new Book("Data Structures", "Jane Doe", "9876543210", 2019);
            Book book3 = new Book("Web Development", "Mike Johnson", "5555666677", 2021);

            if (library.addBook(book1)) {
                System.out.println("Book added: " + book1.getTitle() + " by " + book1.getAuthor());
            }
            if (library.addBook(book2)) {
                System.out.println("Book added: " + book2.getTitle() + " by " + book2.getAuthor());
            }
            if (library.addBook(book3)) {
                System.out.println("Book added: " + book3.getTitle() + " by " + book3.getAuthor());
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error adding book: " + e.getMessage());
        }

        System.out.println("\nAll books in Library:");
        library.displayAllBooks();

        System.out.println("Borrowing Java Programming...");
        if (library.borrowBook("1234567890")) {
            System.out.println("Book borrowed successfully!\n");
        } else {
            System.out.println("Book is not available for borrowing.\n");
        }

        System.out.println("Trying to borrow Java Programming again...");
        if (library.borrowBook("1234567890")) {
            System.out.println("Book borrowed successfully!\n");
        } else {
            System.out.println("Book is not available for borrowing.\n");
        }

        System.out.println("Available books:");
        library.displayAvailableBooks();

        System.out.println("Returning Java Programming...");
        if (library.returnBook("1234567890")) {
            System.out.println("Book returned successfully!\n");
        } else {
            System.out.println("Book was not borrowed.\n");
        }

        System.out.println("Testing validation...");
        try {
            Book invalidBook1 = new Book("Invalid Year", "Test Author", "1111111111", 3000);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid year provided. " + e.getMessage());
        }

        try {
            Book invalidBook2 = new Book("Invalid ISBN", "Test Author", "123", 2020);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid ISBN. " + e.getMessage());
        }
    }
}
