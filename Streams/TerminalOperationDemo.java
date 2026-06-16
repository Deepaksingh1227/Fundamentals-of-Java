package Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperationDemo {
    public static void main(String args[]) {
        // reduce()

        List<Integer> num = Arrays.asList(10, 20, 30, 41, 52, 67, 88, 9, 81);
        Stream<Integer> s1 = num.stream();
        int sum = s1.reduce(0, (acc, n) -> acc + n);
        System.out.println(sum);

        // collect()
        List<Integer> evenNumber = num.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumber);

        // find and match

        // iteration
    }
}
