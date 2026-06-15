package Streams;

import java.util.*;
import java.util.stream.Stream;

public class StreamsDemo {
    // Streams --> Assembly line / pipeline
    public static void main(String args[]) {
        List<String> list = Arrays.asList("Apple", "Mango", "Banana");
        for (String fruits : list) {
            System.out.println(fruits);
        }

        // Using Streams

        Stream<String> stream = list.stream();
        // stream.forEach(System.out::println);

        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Stream<Integer> stream1 = values.stream();
        // stream1.forEach(System.out::println);

        // Using filter in stream

        Stream<String> filterStream = stream.filter(name -> name.startsWith("M"));
        filterStream.forEach(System.out::println);

        Stream<Integer> filterValue = stream1.filter(value -> value > 5);
        filterValue.forEach(System.out::println);

    }

}
