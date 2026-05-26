package functionalInterface.assignment;

public class Main {
    public static void main(String[] args) {
        Operation operation = (a, b) -> a+b;

        System.out.println("Sum: " + operation.add(90, 20));
    }
}
