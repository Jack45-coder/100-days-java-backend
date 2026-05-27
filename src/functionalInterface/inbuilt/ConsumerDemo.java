package functionalInterface.inbuilt;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> display = (s) -> System.out.println(s);

        List<String> names = List.of("Ram", "Shyam", "Mohan", "Karan");

        for(String name : names){
            display.accept(name);
        }
    }
}
