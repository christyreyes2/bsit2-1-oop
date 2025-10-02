import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<Borrowable> items;

    public LibraryManager() {
        this.items = new ArrayList<>();
    }

    public void addItem(Borrowable item) {
        items.add(item);
    }

    public void displayAllItems() {
        for (Borrowable item : items) {
            if (item instanceof LibraryItem) {
                LibraryItem libItem = (LibraryItem) item;
                System.out.println(libItem.getItemType() + ": " + libItem.getItemInfo() + " - Status: " + item.getBorrowingStatus());
            }
        }
    }

    public boolean borrowItem(String itemId, String borrowerName) {
        for (Borrowable item : items) {
            if (item instanceof LibraryItem) {
                LibraryItem libItem = (LibraryItem) item;
                if (libItem.itemId.equals(itemId)) {
                    if (item.isAvailable()) {
                        item.borrowItem(borrowerName);
                        return true;
                    } else {
                        System.out.println("Item " + itemId + " is currently not available.");
                        return false;
                    }
                }
            }
        }
        System.out.println("Item with ID " + itemId + " not found.");
        return false;
    }

    public boolean returnItem(String itemId) {
        for (Borrowable item : items) {
            if (item instanceof LibraryItem) {
                LibraryItem libItem = (LibraryItem) item;
                if (libItem.itemId.equals(itemId)) {
                    if (!item.isAvailable()) {
                        item.returnItem();
                        return true;
                    } else {
                        System.out.println("Item " + itemId + " was not borrowed.");
                        return false;
                    }
                }
            }
        }
        System.out.println("Item with ID " + itemId + " not found.");
        return false;
    }

    public void displayAvailableItems() {
        for (Borrowable item : items) {
            if (item.isAvailable() && item instanceof LibraryItem) {
                LibraryItem libItem = (LibraryItem) item;
                System.out.println(libItem.getItemType() + ": " + libItem.getItemInfo());
            }
        }
    }

    public double calculateTotalLateFees(int daysLate) {
        double total = 0.0;
        for (Borrowable item : items) {
            total += item.calculateLateFee(daysLate);
        }
        return total;
    }
}
