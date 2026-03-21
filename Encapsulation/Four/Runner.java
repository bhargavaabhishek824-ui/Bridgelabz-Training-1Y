package Four;
import java.util.*;
public class Runner {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        LibraryItem book = new Book(1, "Java Programming", "James Gosling");
        LibraryItem magazine = new Magazine(2, "Tech Today", "Editorial Team");
        LibraryItem dvd = new DVD(3, "Inception", "Christopher Nolan");
        items.add(book);
        items.add(magazine);
        items.add(dvd);
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                if (r.checkAvailability()) {
                    r.reserveItem("Namrita");
                } else {
                    System.out.println("Item already reserved.");
                }
            }
            System.out.println("--------------------------");
        }
    }
}
