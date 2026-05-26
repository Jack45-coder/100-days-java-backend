package functionalInterface.assignment;

public class Main {
    public static void main(String[] args) {
        Operation operation = (a, b) -> a+b;

        Operation operation1 = (a, b) -> {
            return a+b;
        };

        System.out.println("Sum: " + operation.add(90, 20));
        System.out.println(operation1.add(50, 80));
    }
}
