package edu.iago.ternario;

public class Ternario {
  public static void main(String[] args) {
    double nota = 6.5;

    String resultado = nota >= 7? "Aprovado" : nota>=5 ? "Recuperação" : "Reprovado";

    System.out.println(resultado +" com nota " + nota);
  }
}
