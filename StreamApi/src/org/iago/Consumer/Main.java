package org.iago.Consumer;

import java.util.Arrays;
import java.util.List;
// import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Consumer<Integer> showPairNumbers = number -> {
        //     if(number % 2 == 0){
        //         System.out.println(number);
        //     }
        // };

        // numbers.stream().forEach(showPairNumbers);

        numbers.stream().forEach( number -> {
            if ((number % 2) == 0){
                System.out.print(number + " ");
            }
        });
    }
}
