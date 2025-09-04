public class Main {
    public static void main(String[] args) {
        System.out.println("═══ Book Record System ═══\n");

        System.out.println("Adding books and ratings...");

        Book b1 = new Book("Java Programming", "John Smith");
        try {
            b1.addRating(4);
            System.out.println("Rating 4 added successfully");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


        Book b2 = new Book("Data Structures", "Alice Brown");
        System.out.print("Ratings added: ");
        int[] ratingsB2 = {5, 4, 3, 5};
        for (int i = 0; i < ratingsB2.length; i++) {
            try {
                b2.addRating(ratingsB2[i]);
                System.out.print(ratingsB2[i]);
                if (i < ratingsB2.length - 1) {
                    System.out.print(", ");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("\nError: " + e.getMessage());
                break;
            }
        }
        System.out.println();

        try {
            b2.addRating(6);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        Book b3 = new Book("Web Development", "Bob Wilson");
        b3.addMultipleRatings(3, 4, 4, 2);

        System.out.println("\nBook Results:");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        System.out.println("\nTotal books created: " + Book.getTotalBooks());

        Book highest = b1;
        if (b2.getAverageRating() > highest.getAverageRating()) highest = b2;
        if (b3.getAverageRating() > highest.getAverageRating()) highest = b3;

        System.out.println("Highest rated book: " + highest.getTitle() +
                " by " + highest.getAuthor() + " (" + highest.getAverageRating() + ")");
    }
}
