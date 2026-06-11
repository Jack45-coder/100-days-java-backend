package corejava.functionalInterface.streams;

import corejava.functionalInterface.streams.intermediate.Book;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TerminalOperationChallenge {
    public static void main(String[] args) {

        //FIXME
        // Total cost of all books in the bookstore.
        // Collecting books into a list of titles.
        // Grouping books by category.

        List<Book> books = Arrays.asList(
                new Book("Effective Java", 2018, 55.5, "Programming"),
                new Book("Atomic Habits", 2018, 25.0, "Self Help"),
                new Book("Think and Grow Rich", 1937, 20.0, "Self Help"),
                new Book("Rich Dad Poor Dad", 1997, 30.0, "Finance"),
                new Book("Harry Potter", 1997, 50.0, "Fantasy"),
                new Book("Head First Java", 2005, 40.0, "Programming"),
                new Book("Deep Work", 2016, 28.0, "Productivity"),
                new Book("Money Master the Game", 2014, 42.0, "Finance"),
                new Book("The Alchemist", 1988, 18.10, "Fiction"),
                new Book("Sapiens", 2011, 35.0, "History"),
                new Book("Wings of Fire", 1999, 22.0, "Biography"),
                new Book("Clean Code", 2008, 45.5, "Programming"),
                new Book("The Silent Patient", 2019, 32.0, "Thriller")
        );

        // Total cost of all books in the bookstore.
        double totalCost = books.stream()
                .mapToDouble(book -> book.price)
                .reduce(0, (acc, num) -> acc + num);
        System.out.println("Total cost of all books: " + totalCost);


        // Collecting books into a list of titles.
        List<String> bookTitles = books.stream()
                .map(book -> book.title)
                .collect(Collectors.toList());

        System.out.println("Book Titles: " + bookTitles);


        // Grouping books by category.
        Map<String, List<Book>> byCategory = books.stream()
                .collect(Collectors.groupingBy(bookStringFunction));

        byCategory.forEach((category, bookList) -> {
            System.out.println("\nCategory: " + category);
            bookList.forEach(System.out::println);
        });


    }

    static Function<Book, String> bookStringFunction = new Function<Book, String>() {
        @Override
        public String apply(Book book) {
            return book.getCategory();
        }
    };
}
