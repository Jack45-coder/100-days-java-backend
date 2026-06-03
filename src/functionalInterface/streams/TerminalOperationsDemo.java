package functionalInterface.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperationsDemo {
    public static void main(String[] args) {
        // reduce()
        List<Integer> integers = Arrays.asList(2, 94, 7, 18, 10, 19, 23, 74);
        Stream<Integer> integerStream = integers.stream();
//      int sum = integerStream.reduce(0, (acc, num) -> acc + num);
        int sum = integerStream.reduce(0, Integer::sum); // replaced with lambda
        System.out.println("SUM: " + sum);

        int total = integers.stream()
                        .reduce(0, Integer::sum);
        System.out.println("TOTAL:" + total);

        // collect()
        List<Integer> evenList = integers.stream()
                .filter(n -> n%2 == 0)
                .collect(Collectors.toList());
        System.out.println("EvenList: " + evenList);


        // find & match
        int firstElement = integers.stream().findFirst().get();
        System.out.println("First Element: " + firstElement);

        int anyElement = integers.stream().findFirst().get();
        System.out.println("Find Any Element: " + anyElement);

        boolean has10 = integers.stream().anyMatch(n -> n == 10);
        System.out.println("Has10: " + has10);

        // iteration
        integers.stream()
                .forEach(System.out::println);

        // ITERATOR
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
