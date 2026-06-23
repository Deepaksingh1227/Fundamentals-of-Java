package npe;

import java.util.*;

public class functionalOperations {
    public static void main(String args[]) {

        Optional<String> name = Optional.of("java");
        Optional<String> nullOptional = Optional.ofNullable(null);
        // ifPresent()

        name.ifPresent(value -> {
            System.out.println(value);
            System.out.println("Hy");

        });
        nullOptional.ifPresent(value -> {
            System.out.println(value);
            System.out.println("Hy");

        });

        // map()

        Optional<String> upperCase = name.map(value -> value.toUpperCase());
        System.out.println(upperCase);

        // filter()
        name.filter(n -> n.startsWith("J"))
                .ifPresent(System.out::println);

        nullOptional.filter(n -> n.startsWith("J"))
                .ifPresent(System.out::println);
    }

}
