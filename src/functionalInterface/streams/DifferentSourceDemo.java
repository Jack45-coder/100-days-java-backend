package functionalInterface.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DifferentSourceDemo {
    /*
        From Collections: e.g., collections.stream().
        From Arrays: e.g., Arrays.stream(array).
        From Functions: e.g., stream.iterate(n -> n + 2).
        From Specific Values: e.g., Stream.of("a", "b", "c").
        From Files: e.g., Files.lines(path).
        Empty Stream: e.g., Stream.empty().
     */
    public static void main(String[] args) {

        System.out.println("List to stream");
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> integerStream = numbers.stream();
        integerStream.forEach(System.out::println);

        System.out.println("Array to stream");
        int[] numberArray = {1,2,3,4,5};
        IntStream arrayStream = Arrays.stream(numberArray);
        arrayStream.forEach(System.out::println);

        System.out.println("Stream to iterate");
        Stream<String> names = Stream.of("Ravi", "Rahul", "Raj", "Rajesh", "Ravish");
        names.forEach(System.out::println);

//        Stream<Integer> integerStream1 = Stream.iterate(0, n -> n + 2); // infinite stream goes on ----->
//        integerStream1.forEach(System.out::println);


        try {
            Stream<String> fileStream = Files.lines(Path.of("D:\\Jazzy"));
            fileStream.forEach(System.out::println);
            fileStream.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        // Empty Stream
        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(System.out::println);
    }
}
