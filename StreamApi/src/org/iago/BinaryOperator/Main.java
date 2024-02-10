package org.iago.BinaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

    BinaryOperator<Integer> sum = (num1, num2) -> num1 + num2;

    int result = numbers.stream().reduce(0, Integer::sum);

    System.out.println("The resulte of summation is " + result);
  }
}
