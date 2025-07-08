class EBook extends Book {

    private String fileType;


    public EBook(String ISBN, String title, int yearPublished, double price, String authorName, String fileType) {
        super(ISBN, title, yearPublished, price, authorName);
        this.fileType = fileType;
    }

    @Override
    public double buy(int quantity, String email, String address) {
        if (quantity > 1) {
            throw new RuntimeException("Quantum book store: Cannot buy multiple copies of an e-book.");
        }
        double paidAmount = price;
        System.out.println("Quantum book store: Paid amount: " + paidAmount);
        System.out.println("Quantum book store: Sending e-book to email: " + email);
        return paidAmount;
    }
    @Override
    public void deliver(String email, String address) {
        System.out.println("MailService: Sending e-book to " + email);
    }
}

