package corejava.functionalInterface.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Consumer<Integer> print = System.out::println;
        Predicate<Integer> isEven = n -> n%2==0;

        // ITERATION : 1
        List<Integer> even_List = new ArrayList<>();
        for (Integer num : numbers){
            if(num % 2 == 0){
                even_List.add(num);
            }
        }
        System.out.println(even_List);


        // LIST : Even numbers from "numbers" list
        // ITERATION : 2
        Stream<Integer> numbersSt = numbers.stream();
        Stream<Integer> filterSt = numbersSt.filter(isEven);
        List<Integer> evenNumbers = filterSt.toList();
        System.out.println(evenNumbers);

        // ITERATION : 3
        List<Integer> evenList = numbers.stream().filter(isEven).toList();
        System.out.println(evenList);


    }
}
