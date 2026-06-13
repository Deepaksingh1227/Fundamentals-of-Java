package FunctionalInterface;

import java.util.function.Function;

@FunctionalInterface
interface bookAction {
    void perform();

}

// Functional interface with parameters
@FunctionalInterface
interface Operation {
    int add(int a, int b);
}

public class functionalInterfaceDemo {
    public static Function<Integer, Integer> addFunction = (a) -> a + 3;

    public static void main(String args[]) {
        bookAction A1 = () -> {
            System.out.println("Action Performed");
        };

        bookAction A2 = () -> {
            System.out.println("Action Pending ");
        };

        A1.perform();

        Operation op = (int a, int b) -> {
            return a + b;
        };

        System.out.println(op.add(10, 20));

        // predefine function interface
        System.out.println(addFunction.apply(10));

    }

}
