package corejava.functionalInterface.inbuilt;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class RealExample {
    public static void main(String[] args) {

        // <title> costs $<Price>

        BiFunction<String, Double, String> formatter = (title, price) -> title + " costs $" + price;

        BiConsumer<String, Double> formatterConsumer = (title, price) -> System.out.println(title + " costs $" + price);

        Map<String, Double> books = new HashMap<>();
        books.put("Java Basics", 599.49);
        books.put("Python", 1599.99);
        books.put("React", 899.79);
        books.put("DBMS", 499.49);
        books.put("AIML", 2999.90);
        books.put("Electrical Engineering", 1299.90);
        books.put("HTML", 299.49);
        books.put("SQL", 199.49);

        for(Map.Entry<String, Double> entry : books.entrySet()){
            String res = formatter.apply(entry.getKey(), entry.getValue());
            formatterConsumer.accept(entry.getKey(), entry.getValue());
            System.out.println(res);
        }

    }
}