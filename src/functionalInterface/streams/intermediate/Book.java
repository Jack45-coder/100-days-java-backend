package functionalInterface.streams.intermediate;

public class Book {
    String title;
    int publicationDate;
    double price;
    String category;

    public Book(String title, int publicationDate, double price, String category) {
        this.title = title;
        this.publicationDate = publicationDate;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "TITLE: " + title + ", PRICE: " + price + ", CATEGORY: " + category + ", PUBLICATION: " + publicationDate +
                '}';
    }
}
