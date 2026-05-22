package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class GenericsDemo {
    public static void main(String[] args) {
        List<String> members = new ArrayList<>();

        Consumer<String> consumer = System.out::println;

        members.add("Jackey");
        members.add("Shivam");
        members.add("Geeta");
        members.add("Shradha");
        members.add("Sita");

//        members.add(10) -> not allowed because list types of string allow only string data types.

        members.forEach(consumer);

    }
}
