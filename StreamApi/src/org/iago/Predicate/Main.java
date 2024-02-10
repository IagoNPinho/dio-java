package org.iago.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
  public static void main(String[] args) {
    List<String> words = Arrays.asList("Kotlin", "Java", "JavaScript", "C", "GO", "Ruby");

    // Predicate<String> fiveLetters = word -> word.length() > 5;

    words.stream()
    .filter( p -> p.length() < 5)
    .forEach(System.out::println);
  }
}
