public static void main(String[] args) {
    System.out.println("=== Library Management System ===\n");

    LibraryManager library = new LibraryManager();

    library.showBooks();   // Show initial books
    library.addBook();     // Try adding book(s)
    library.addBook();     // Try another add
    library.addBook();     // Add valid book
    library.removeBook();  // Invalid input (abc)
    library.removeBook();  // Invalid input (10)
    library.removeBook();  // Valid removal

    System.out.println("Program completed successfully.");
}
}   
