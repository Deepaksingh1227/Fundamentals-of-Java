package npe;

import java.util.*;

//Optional in java  introduced by jaava 8 ------------------------------------------------------------------

public class NPEDemo {
    public static void main(String args[]) {
        String name = "java";
        if (name != null) {
            System.out.println(name.length());
        } else {
            System.out.println("No name value");
        }

        // Using java
        // ------------------------------------------------------------------------------------------------
        // creating Optiional
        Optional<String> optionalString = Optional.of("java");
        System.out.println("optionalString");

        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        Optional<String> mayBe = Optional.ofNullable(null);
        System.out.println("maybe");

        // checking values ------------------------------

        System.out.println(optionalString.isPresent());
        System.out.println(mayBe.isPresent());
        System.out.println(mayBe.isEmpty());

        // get() method only when you are sure that value exists

        // System.out.println(mayBe.get());
        System.out.println(optionalString.get());

        // Safely getting values

        // orElse("default- value")
        System.out.println(optionalString.orElse("default"));
        System.out.println(mayBe.orElse("default"));
        String temp = mayBe.orElse("there is no value");
        System.out.println(temp);

        // orElseGet(<supplier>)
        String result = mayBe.orElseGet(() -> {
            System.out.println("Generating Default values");
            return "default";
        });
        System.out.println(result);

        // orElseThrow() ----use to throw an exception------
        String newResult1 = optionalString.orElseThrow(
                () -> new RuntimeException("not found any value"));
        System.out.println(newResult1);

        // ------------------------------------------------------------------------------------

        String newResult = mayBe.orElseThrow(
                () -> new RuntimeException("not found any value"));
        System.out.println(newResult);

    }

}
