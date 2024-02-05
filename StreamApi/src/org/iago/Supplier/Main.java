package org.iago.Supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Supplier<String> hello = () -> "Hello, you are wellcome!";

        // List<String> listOfHello = Stream.generate(hello).limit(5).collect(Collectors.toList());

        List<String> listOfHello = Stream.generate(() -> "Hello, you are wellcome!")
                .limit(5)
                .toList();

        listOfHello.forEach(System.out::println);
    }

}
