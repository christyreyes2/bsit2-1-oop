public class Main {
    public static void main(String[] args) {
        System.out.println("=== LIBRARY MANAGEMENT SYSTEM TEST ===\n");

        // Create LibraryManager
        LibraryManager manager = new LibraryManager();

        // Create items
        Book book1 = new Book("B001", "Java Programming", "James Gosling", "ISBN123", 400, "Programming");
        Magazine magazine1 = new Magazine("M001", "Tech Today", "Editor Smith", 101, "October", true);
        DVD dvd1 = new DVD("D001", "The Matrix", "Wachowski Sisters", 136, "R", "Action");

        System.out.println("=== Adding Items to Library ===");
        manager.addItem(book1);
        System.out.println("Added: Book - " + book1.title + " by " + book1.author);
        manager.addItem(magazine1);
        System.out.println("Added: Magazine - " + magazine1.title + " by " + magazine1.author);
        manager.addItem(dvd1);
        System.out.println("Added: DVD - " + dvd1.title + " by " + dvd1.author);

        System.out.println("\n=== Displaying All Items ===");
        for (Borrowable item : manager.items) {
            LibraryItem li = (LibraryItem) item;
            String status = item.getBorrowingStatus();
            if (item instanceof DVD) {
                System.out.println(li.getItemType() + ": " + li.title + " (DVD: " + status + ")");
            } else {
                System.out.println(li.getItemType() + ": " + li.title + " (" + status + ")");
            }
        }

        System.out.println("\n=== Testing Borrowing ===");
        Student student = new Student("U001", "John Smith", "john@example.com", "S1001", "Computer Science");
        Faculty faculty = new Faculty("U002", "Dr. Smith", "smith@example.com", "Engineering", "Professor");

        if (manager.borrowItem("B001", student.getName())) {
            student.addBorrowedItem(book1);
            System.out.println("Student John borrowed: " + book1.title);
        }
        if (manager.borrowItem("D001", faculty.getName())) {
            faculty.addBorrowedItem(dvd1);
            System.out.println("Faculty Dr. Smith borrowed: " + dvd1.title);
        }

        System.out.println("\n=== Displaying Available Items ===");
        for (Borrowable item : manager.items) {
            if (item.isAvailable()) {
                LibraryItem li = (LibraryItem) item;
                System.out.println(li.getItemType() + ": " + li.title + " (" + item.getBorrowingStatus() + ")");
            }
        }

        System.out.println("\n=== Testing Late Fees ===");
        double bookLateFee = book1.calculateLateFee(5);
        double dvdLateFee = dvd1.calculateLateFee(3);
        System.out.printf("%s - 5 days late: $%.2f%n", book1.title, bookLateFee);
        System.out.printf("%s - 3 days late: $%.2f%n", dvd1.title, dvdLateFee);

        System.out.println("\n=== Testing User Information ===");
        System.out.printf("Student: %s (%s) - %d items borrowed%n", student.getName(), student.getMajor(), student.getBorrowedItemsCount());
        System.out.printf("Faculty: %s (%s) - %d items borrowed%n", faculty.getName(), faculty.getDepartment(), faculty.getBorrowedItemsCount());
    }
}
