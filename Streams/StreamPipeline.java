package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPipeline {
    public static void main(String args[]) {
        List<Integer> numbers = Arrays.asList(23, 34, 24, 56, 7, 8, 8, 5, 3);
        Stream<Integer> stream = numbers.stream();
        List<Integer> evennum = stream// source
                .filter(n -> n % 2 == 0) // intermediate
                .collect(Collectors.toList()); // terminals
        evennum.forEach(System.out::println);

    }

}
