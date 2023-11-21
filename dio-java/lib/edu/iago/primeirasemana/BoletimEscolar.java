package edu.iago.primeirasemana;

public class BoletimEscolar {

  //Anatomia das classes 4 - Identação
  public static void main(String[] args) {
    int mediaFinal = 7;
    if (mediaFinal < 6) {
      System.out.println("Reprovado");
    } else if (mediaFinal == 6) {
      System.out.println("Prova Final");
    } else {
      System.out.println("Aprovado");
    }
  }
}