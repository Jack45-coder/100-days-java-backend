package functionalInterface.inbuilt.biFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo {

    // Both are BIFUNCTION:
    public static BiFunction<Integer, Integer, Integer>
            addFunction = (a, b) -> a + b;

    public static BiFunction<Integer, Integer, Integer>
            multiFunction = (a, b) -> a * b;



    // start main function
    public static void main(String[] args) {

        int result = addFunction.apply(10, 20);
        int result1 = multiFunction.apply(10, 20);


        Function<Integer, Integer> multiplyBy2 = x -> x*2;
        BiFunction<Integer, Integer, Integer> combinedFunction =
                addFunction.andThen(multiplyBy2);

        System.out.println("Addition: " + result);
        System.out.println("Multiplication: " + result1);
        System.out.println("CombinedFunction: " + combinedFunction.apply(10, 20));

    }
}