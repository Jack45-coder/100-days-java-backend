package functionalInterface.inbuilt;

import java.util.function.Function;

public class FunctionInterfaceDemo {
    public static Function<Integer, Integer> addFunc = (a) -> a+3;

    public static Function<Integer, Integer> squareFunc = (a) -> a*a;

    public static void main(String[] args) {

        System.out.println("Add Function: " + addFunc.apply(10));
        System.out.println("Square Function: " + squareFunc.apply(10));
    }
}
