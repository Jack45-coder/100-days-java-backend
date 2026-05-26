package functionalInterface;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        // () -> {}
         BookAction action = () -> {
             System.out.println("Action Performed");
         };

         BookAction action1 = () -> System.out.println("Action Performed!");

         action.perform();
         action1.perform();
    }
}
