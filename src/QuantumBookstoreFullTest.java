//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class QuantumBookstoreFullTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Inventory inventory = new Inventory();

        PaperBook pb = new PaperBook("P001", "Java Fundamentals", 2015, 45.0, "Alice Brown", 5);
        EBook eb = new EBook("E001", "Mastering Spring", 2022, 25.0, "John Smith", "PDF");
        Demo sb = new Demo("S001", "Demo Book", 2010, 0.0, "Demo Author");

        inventory.add(pb);
        inventory.add(eb);
        inventory.add(sb);

        inventory.printInventory();

        try {
            inventory.buyBook("P001", 2, "user@mail.com", "123 Main St");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            inventory.buyBook("E001", 1, "ebook@mail.com", null);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            inventory.buyBook("S001", 1, "demo@mail.com", null);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        inventory.removeOutdatedBooks(10);

        inventory.printInventory();
    }
}
