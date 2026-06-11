package corejava.functionalInterface.inbuilt;


import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {
    public static void main(String[] args) {

        // ::

        // Sample list of names
        List<String> names = Arrays.asList("Simple", "Shivani", "Shashi");

        // Traditional for loop
        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        System.out.println();

        // Using Enhanced ForEach
        for (String name : names){
            System.out.println(name);
        }

        System.out.println();

        /*
         // Using Consumer
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
         */
/*
        names.forEach((String name) -> {
            System.out.println(name);
        });

 */
        // Lambda expression with forEach()
        names.forEach((name) -> System.out.println(name));

        System.out.println();

        // METHOD REFERENCE (::) - shorter form of lambda
        names.forEach(System.out::println);

    }
}