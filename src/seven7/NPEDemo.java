package seven7;

import java.util.Optional;

public class NPEDemo {
    public static void main(String[] args) {

        String name = null;
        if (name != null){
            System.out.println(name);
        }else {
            System.out.println("no name value");
        }

        //Creating Optional:
        Optional<String>  optionalString = Optional.of("Java");
        System.out.println(optionalString);

        Optional<String>  empty = Optional.empty();
        System.out.println(empty);

        Optional<String> maybe = Optional.ofNullable(null);
        System.out.println(maybe);


        // Checking Value:
        System.out.println(optionalString.isPresent());
        System.out.println(maybe.isPresent());

        System.out.println(optionalString.isEmpty());
        System.out.println(maybe.isEmpty());

        //get
        System.out.println(maybe.get()); // throw error

    }
}
