package functionalInterface.streams.intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateDemo {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Clean Code", 2008, 50.0, "Programming"),
                new Book("Effective Java", 2018, 65.0, "Programming"),
                new Book("Head First Java", 2005, 40.0, "Programming"),
                new Book("Atomic Habits", 2018, 39.0, "Self Help"),
                new Book("Rich Dad Poor Dad", 1997, 29.0, "Finance"),
                new Book("The Psychology of Money", 2220, 350.0, "Finance"),
                new Book("The Alchemist", 1988, 25.0, "Fiction"),
                new Book("Harry Potter", 1997, 99.0, "Fantasy"),
                new Book("Think and Grow Rich", 2019, 275.0, "Self Help"),
                new Book("Deep Work", 2016, 42.0, "Productivity")
        );

        // 1. Filtering: Books cheaper than $30
        System.out.println("BOOK PRICED LESS THAN 30$");
        Stream<Book> bookStream = books.stream()
                .filter(book -> book.price <= 30);
        bookStream.forEach(System.out::println);

        // 2. Mapping: Convert book titles by uppercase
        System.out.println("MAPPED TITLE BY UPPERCASE");
        Stream<String> titleUpperCase = books.stream()
                .map(book -> book.title.toUpperCase());
        titleUpperCase.forEach(System.out::println);

        // 3. Sorting: Books by publication date
        System.out.println("SORTED BY PUBLICATION_DATE");
        Stream<Book> sortedByPublication = books.stream()
                .sorted(Comparator.comparing(book -> book.publicationDate));
        sortedByPublication.forEach(System.out::println);

        // 4. Distinct: Remove duplicate titles
        System.out.println("UNIQUE BOOK");
        Stream<Book> uniqueBook = books.stream().distinct();
        uniqueBook.forEach(System.out::println);

        // 5. Limit: Display only the first 3 books
        System.out.println("DISPLAY FIRST 3 PUBLISHED BOOK BY PUBLICATION YEAR");
        Stream<Book> first3Book = books.stream()
                .sorted(Comparator.comparing(book -> book.publicationDate))
                .limit(3);
        first3Book.forEach(System.out::println);

        // 6> Skip: Skip the first 2 books
        System.out.println("SKIP FIRST 2 BOOK");
        Stream<Book> skipFirst2Book = books.stream()
                .skip(2);
        skipFirst2Book.forEach(System.out::println);


    }
}
