package functionalInterface.assignment;

public class Main {
    public static void main(String[] args) {
        Operation operation = (a, b) -> a+b;

        Operation operation1 = (a, b) -> {
            return a+b;
        };

        System.out.println("Sum: " + operation.add(90, 20));
        System.out.println(operation1.add(50, 80));

        // BiFunction Call
        int result = Substraction.subFunction.apply(100, 40);
        System.out.println("BI FUNCTION RESULT: " + result);

        // THREAD INTERFACE
        new Thread(() -> System.out.println("New Thread Created Successfully.")).start();
    }
}
