package org.iago.Function;

import java.util.Arrays;
import java.util.List;
// import java.util.function.Function;
// import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Function<Integer, Integer> multiplierByTwo = number -> number * 2;
        // List<Integer> numbersMultiplied = numbers.stream()
        //   .map(multiplierByTwo)
        //   .collect(Collectors.toList());
        // numbersMultiplied.forEach(n -> System.out.println(n));

        List<Integer> numbersMultiplied = numbers.stream()
                .map(number -> number * 2)
                .toList();

        numbersMultiplied.forEach(System.out::println);
    }
}
