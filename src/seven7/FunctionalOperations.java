package seven7;

import java.util.Optional;

public class FunctionalOperations {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Coder_JACK");
        Optional<String> nullOptional = Optional.ofNullable(null);

        // ifPresent()
        name.ifPresent(System.out::println);

        nullOptional.ifPresent(val -> {
            System.out.println(val);
            System.out.println("Hey");
        });

        // map()
        Optional<String> upperCase  = name.map(val -> val.toUpperCase());
        System.out.println(upperCase.orElse("default")); // Coder_JACK

        Optional<String> upperCase2  = nullOptional.map(String::toUpperCase);
        System.out.println(upperCase2.orElse("default")); // default

        // filter()
        Optional<String> temp = name.filter(n -> n.startsWith("C"));
        temp.ifPresent(System.out::println); // Coder_JACK



        // Combined Operation
        name.filter(n -> n.startsWith("C"))
                .map(String::toUpperCase)
                .ifPresent(System.out::println); // CODER_JACK

        name.filter(n -> n.startsWith("F"))
                .map(String::toUpperCase)
                .ifPresent(System.out::println); // no output

    }
}
