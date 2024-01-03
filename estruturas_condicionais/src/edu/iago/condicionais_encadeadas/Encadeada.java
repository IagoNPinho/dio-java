package edu.iago.condicionais_encadeadas;

public class Encadeada {
  public static void main(String[] args) {
    double nota = 6.9;

    if (nota >=7) {
      System.out.println("Aprovado com nota " + nota);
    } else if (nota >= 5) {
      System.out.println("Recuperação com nota " + nota);
    } else {
      System.out.println("Reprovado com nota " + nota);
    }
  }
}
