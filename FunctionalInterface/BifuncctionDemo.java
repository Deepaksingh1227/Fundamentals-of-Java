package FunctionalInterface;

import java.util.function.BiFunction;

public class BifuncctionDemo {
    public static BiFunction<Integer, Integer, Integer> addFunction = Integer::sum;

    public static BiFunction<Integer, Integer, Integer> substractFunction = (a, b) -> a - b;

    public static void main(String args[]) {
        System.out.println(addFunction.apply(10, 20));
        System.out.println(substractFunction.apply(45, 16));

    }
}
