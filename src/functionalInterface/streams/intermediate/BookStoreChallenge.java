package functionalInterface.streams.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class BookStoreChallenge {
    public static void main(String[] args) {

        /*
        - Discounted Books:
        The bookstore is planning a sale.
        Identify all books that are priced over $30.
        Display these books.

        - Classics Collection:
        The bookstore is launching a classics collection.
        Identify and display books that were published before the year 2000.

        - Upcoming Titles:
        Generate a list of future book titles for the next year
        by adding the suffix "(Coming Soon)" to all the current titles.

        - Sort by Price:
        The bookstore wants to print price tags for all the books.
        display the books sorted by their prices in ascending order.

        - Rare Books:
        The bookstore believes there might be rare books in the collection.
        A rare book is one where the title has more than 20 characters.
        Identify and display these books.

         */


        List<Book> books = Arrays.asList(
                new Book("Clean Code", 2008, 45.99, "Programming"),
                new Book("Effective Java", 2018, 55.50, "Programming"),
                new Book("Head First Java", 2005, 39.99, "Programming"),
                new Book("Atomic Habits", 2018, 24.99, "Self Help"),
                new Book("Rich Dad Poor Dad", 1997, 19.99, "Finance"),
                new Book("The Psychology of Money", 2020, 29.99, "Finance"),
                new Book("The Alchemist", 1988, 15.99, "Fiction"),
                new Book("Harry Potter and the Philosopher's Stone", 1997, 34.99, "Fantasy"),
                new Book("Think and Grow Rich", 1937, 18.99, "Self Help"),
                new Book("Deep Work", 2016, 27.99, "Productivity")
        );


        Predicate<Book> priceFiltering = b -> b.price >= 30; // price is grater 30$.
        Predicate<Book> yearFiltering = b -> b.publicationDate <= 2000; // before publication 2000.

        // 1. Discounted Books (Price > 30)
        System.out.println("\nDiscounted Books that are priced by over 30$");
        Stream<Book> bookStream = books.stream()
                .filter(priceFiltering);
        bookStream.forEach(System.out::println);

        // 2. Classics Collection (Published before 2000)
        System.out.println("\nIdentify and display books that were published before 2000");
        books.stream()
                .filter(yearFiltering)
                .forEach(System.out::println);

        // 3. Add suffix "(Coming Soon)" to all the current titles.
        System.out.println("\nAdd suffix \"(Coming Soon)\" to all the current titles");
        books.stream()
                .map(book -> book.title + " (Coming soon)")
                .forEach(System.out::println);


        // 4. Display the books sorted by their prices in ascending order.
        System.out.println("\nDisplay the books sorted by their prices in ascending order");
        books.stream()
                .sorted(Comparator.comparing(book -> book.price))
                .forEach(System.out::println);


        // 5. A rare book is one where the title has more than 20 characters.
        System.out.println("\nRare Book");
        books.stream()
                .filter(book -> book.title.length() > 20)
                .forEach(System.out::println);


    }
}
