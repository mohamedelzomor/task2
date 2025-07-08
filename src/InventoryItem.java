public class InventoryItem {

    Book book;
    protected String ISBN;
    protected String title;
    protected int yearPublished;
    protected double price;
    protected int quantity;

    public InventoryItem(Book book) {
        this.yearPublished = book.getYearPublished();
        this.price = book.getPrice();
        this.ISBN = book.getISBN();
        this.title = book.getTitle();
    }

    public InventoryItem(String ISBN, String title, int yearPublished,
                         double price, int quantity) {
        this.ISBN = ISBN;
        this.title = title;
        this.yearPublished = yearPublished;
        this.price = price;
        this.quantity = quantity;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
