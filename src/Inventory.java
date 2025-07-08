import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author mohammmed
 */
public class Inventory {

       private ArrayList<Book> items = new ArrayList<>();

        public void add(Book book) {
            items.add(book);
            System.out.println("Quantum book store: Added book " + book.getTitle());
        }

    public ArrayList<Book> removeOutdatedBooks(int maxYears) {
        ArrayList<Book> removedBooks = new ArrayList<>();
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        for (Book book : items) {
            if (currentYear - book.getYearPublished() > maxYears) {
                removedBooks.add(book);
            }
        }

        items.removeAll(removedBooks);

        for (Book book : removedBooks) {
            System.out.println("Quantum book store: Removed outdated book " + book.getTitle());
        }

        return removedBooks;
    }

    public double buyBook(String ISBN, int quantity, String email, String address) {
        for (Book book : items) {
            if (book.getISBN().equals(ISBN)) {
                return book.buy(quantity, email, address);
            }
        }
        throw new RuntimeException("Quantum book store: Book not found for ISBN " + ISBN);
    }

    public void printInventory() {
        for (Book book : items) {
            System.out.println(book);
        }
    }
    }

