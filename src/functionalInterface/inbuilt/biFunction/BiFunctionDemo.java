package functionalInterface.inbuilt.biFunction;

import java.util.function.BiFunction;

public class BiFunctionDemo {

    public static BiFunction<Integer, Integer, Integer>
            addFunction = (a, b) -> a + b;

    public static void main(String[] args) {

        int result = addFunction.apply(10, 20);

        System.out.println("Addition: " + result);
    }
}