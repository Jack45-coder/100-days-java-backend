package corejava.functionalInterface.streams.intermediate;

public class Book {
    public String title;
    int publicationDate;
    public double price;
    public String category;

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

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public double getPrice() {
        return price;
    }
}
