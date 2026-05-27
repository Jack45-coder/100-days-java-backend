package functionalInterface.inbuilt;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> display = System.out::println;

        Consumer<String> length = s -> System.out.println(s.length());

        Consumer<Integer> multiplyBy2 = n -> System.out.println(n + " -> " + n*2);

        List<Integer> numbers = List.of(1, 3, 6, 9, 10);

        List<String> names = List.of("Ram", "Shyam", "Mohan", "Karan");

        for(String name : names){
            display.accept(name);
            length.accept(name);
        }

        System.out.println("Multiply By 2");

        for (Integer num : numbers){
            multiplyBy2.accept(num);
        }
    }
}
