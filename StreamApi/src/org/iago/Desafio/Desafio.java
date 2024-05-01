package org.iago.Desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio {
  public static void main(String[] args) {
    challengeFive();
  }

  static List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

  // Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
  static public void challengeOne(){
    List<Integer> ordenedNumbers = numbers.stream()
            .sorted()
            .toList();
    ordenedNumbers.forEach(System.out::println);
  }

  // Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
  static public void challengeTwo(){
    int sumOfPairNumbers = numbers.stream()
            .filter(n -> n%2 == 0)
            .reduce(0, (num1, num2) -> num1 + num2);
    System.out.println(sumOfPairNumbers);
  }

  // Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.
  static public void challengeThree(){
    numbers.stream()
            .forEach(num -> {
              if (num >= 0){
                System.out.println(num + " is positive");
              } else {
                System.out.println(num + " isn't positive");
              }
            });
  }

  // Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
  static public void challengeFour(){
    List<Integer> noPairNumbers = numbers.stream()
            .sorted()
            .filter(n -> (n % 2) == 0)
            .toList();
    noPairNumbers.forEach(System.out::println);
  }

  // Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
  static public void challengeFive(){
    int summationOfNumberBiggerFive = numbers.stream()
            .filter(n -> n > 5)
            .reduce(0, (num1, num2) -> num1+num2);

    int numberOfNumBiggerFive = numbers.stream()
            .filter(n -> n > 5)
            .toList()
            .size();

    System.out.println(summationOfNumberBiggerFive/numberOfNumBiggerFive);
  }

}
