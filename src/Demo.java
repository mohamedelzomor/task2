public class Demo extends Book {

    public Demo(String ISBN, String title, int yearPublished, double price, String authorName) {
        super(ISBN, title, yearPublished, price, authorName);
    }

    @Override
    public double buy(int quantity, String email, String address) {
        throw new RuntimeException("Quantum book store: Showcase book is not for sale. ISBN " + ISBN);
    }
    public void deliver(String email, String address) {
        System.out.println("Quantum book store: Showcase book is not deliverable.");
    }
}

