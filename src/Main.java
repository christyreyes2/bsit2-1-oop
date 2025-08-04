public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "J.K Rowling", 400);
        Book book2 = new Book("Hamilton the Revolution", "Hamilton", 505);
        Book book3 = new Book("Epic The Musical", "Epic", 4822);
        book1.displayInfo();
        book1.borrowBook();
        book1.returnBook();

        book2.displayInfo();
        book2.borrowBook();
        book2.returnBook();

        book3.displayInfo();
        book3.borrowBook();
        book3.returnBook();

    }
}
