public class Book {
    String title;
    String author;
    int pages;
    boolean isAvailable;

    public Book(String Title, String Author, int Pages) {
         title = Title;
         author = Author;
         pages = Pages;
         isAvailable = true;
         System.out.println("A new book " + title + " by " + author +  " has been added to the library!");
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Borrowed");
        } else {
            System.out.println("Already Borrowed");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("The book has been returned.");
    }

    public void displayInfo() {
        System.out.println("Book Info");
        System.out.println("Book Title: " + title);
        System.out.println("Author's Name: " + author);
        System.out.println("No. Pages: " + pages);
        System.out.println("Is Book Available? " + isAvailable);
    }



}
