package corejava.functionalInterface.inbuilt;


import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        // Represents a predicate (boolean-valued function) of one argument.
        Predicate<Integer> isEven = n -> n%2 == 0;

        System.out.println("Predicate Output");
        System.out.println(isEven.test(10)); // true
        System.out.println(isEven.test(11)); // false

        // Represents a predicate (boolean-valued function) of two arguments
        BiPredicate<Integer, Integer> isSumEven = (a, b) -> (a+b) % 2 == 0;

        System.out.println("BiPredicate Output");
        System.out.println(isSumEven.test(10, 13)); // false
        System.out.println(isSumEven.test(10, 44)); // true
    }
}
