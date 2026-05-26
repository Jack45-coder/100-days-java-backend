package functionalInterface.inbuilt;

import java.util.function.Function;

public class FunctionInterfaceDemo {
    public static Function<Integer, Integer> addFunc = (a) -> a+3;

    public static Function<Integer, Integer> subFunc = (a) -> a-3;

    public static Function<Integer, Integer> squareFunc = (a) -> a*a;

    // combined function
    public static Function<Integer, Integer> combinedFunction = squareFunc.andThen(addFunc).andThen(subFunc);

    public static void main(String[] args) {

        System.out.println("Add Function: " + addFunc.apply(10));
        System.out.println("Square Function: " + squareFunc.apply(10));
        System.out.println("Combined Function Output: " + combinedFunction.apply(20));
    }
}
