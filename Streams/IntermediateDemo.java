package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateDemo {
    public static void main(String args[]) {
        List<Book> books = Arrays.asList(
                new Book("Clean Code", 2008, 550.0, "Programming"),
                new Book("Effective Java", 2018, 750.0, "Programming"),
                new Book("Java Concurrency in Practice", 2006, 650.0, "Programming"),
                new Book("Head First Java", 2022, 600.0, "Programming"),
                new Book("Spring in Action", 2021, 850.0, "Programming"),
                new Book("Atomic Habits", 2018, 450.0, "Self Help"),
                new Book("The Power of Habit", 2012, 400.0, "Self Help"),
                new Book("Think and Grow Rich", 1937, 350.0, "Self Help"),
                new Book("The Alchemist", 1988, 299.0, "Fiction"),
                new Book("Harry Potter and the Philosopher's Stone", 1997, 499.0, "Fiction"),
                new Book("The Hobbit", 1937, 550.0, "Fiction"),
                new Book("Rich Dad Poor Dad", 1997, 399.0, "Finance"),
                new Book("The Intelligent Investor", 1949, 699.0, "Finance"),
                new Book("The Psychology of Money", 2020, 450.0, "Finance"),
                new Book("A Brief History of Time", 1988, 599.0, "Science"));

        // 1. Filtering : books cheaper than $500
        // Stream<Book> s1 = books.stream();
        Stream<Book> Filtered = books.stream().filter(b -> b.price < 500);
        Filtered.forEach(System.out::println);

        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        // 2. Mapping : convert book title to uppercase

        Stream<String> Mapped = books.stream().map(b -> b.title.toUpperCase());
        Mapped.forEach(System.out::println);

        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        // 3. Sorting: books by publication date

        Stream<Book> Sorted = books.stream()
                .sorted((b1, b2) -> Integer.compare(b1.publicationYear, b2.publicationYear));
        Sorted.forEach(System.out::println);

    }

}
