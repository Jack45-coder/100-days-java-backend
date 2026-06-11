package corejava.functionalInterface.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// FIXME: Streams  ------> Assembly line / pipeline
// => A Stream is a sequence of elements that supports functional-style operations.
// => Streams are used to process data efficiently using operations like filter, map, sorted, and collect.

public class StreamsDemo {
    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Banana", "Papaya", "Breadfruit", "Apple", "Blackberry", "Mango", "Blueberry", "Graphs");

//         Using Streams
        Stream<String> fruitsStream = fruits.stream();
        fruitsStream.forEach(System.out::println);

        System.out.println("Filtered Fruits");
        Stream<String> streamNew = fruits.stream();
        Stream<String> filteredStream = streamNew.filter(name -> name.startsWith("B"));
        filteredStream.forEach(System.out::println);

        // without making object of Stream
        fruits.stream()
                .filter(name -> name.startsWith("B")) // filter() -> filters data
                .forEach(System.out::println) // forEach()-> consumes data
        ;


        /*
            # USE CASES
            1. Filtering
            2. Mapping
            3. Aggregation
            4. Searching
            5. Iteration
         */


    }
}
