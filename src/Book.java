 public abstract class Book implements Deliverable {
    protected String ISBN;
    protected String title;
    protected int yearPublished;
    protected double price;
    protected String authorName;

    public Book(String ISBN, String title, int yearPublished,
                double price, String authorName) {
        this.ISBN = ISBN;
        this.title = title;
        this.yearPublished = yearPublished;
        this.price = price;
        this.authorName = authorName;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getYearPublished() {
        return yearPublished;
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

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public double getPrice() {
        return price;
    }

     @Override
     public String toString() {
         return "Quantum book store: ISBN = " + ISBN + ", Title = " + title +
                 ", Year = " + yearPublished + ", Price = " + price +
                 ", Author = " + authorName;
     }

    public abstract double buy(int quantity, String email, String address);

}

