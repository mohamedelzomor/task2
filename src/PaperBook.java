class PaperBook extends Book {
    private int quantity;

    public PaperBook(String ISBN, String title, int yearPublished, double price, String authorName, int stock) {
        super(ISBN, title, yearPublished, price, authorName);
        this.quantity = quantity;
    }


    @Override
    public double buy(int quantity, String email, String address) {
        if (this.quantity < quantity) {
            throw new RuntimeException("Quantum book store: Not enough stock for ISBN " + ISBN);
        }
        this.quantity -= quantity;
        double paidAmount = quantity * price;
        System.out.println("Quantum book store: Paid amount: " + paidAmount);
        System.out.println("Quantum book store: Shipping paper book to address: " + address);
        return paidAmount;
    }
    @Override
    public void deliver(String email, String address) {
        System.out.println("Quantum book store: Shipping paper book to address: " + address);
    }

}

