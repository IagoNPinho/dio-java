package edu.iago.condicionais_simples;

public class Simples {
  public static void main(String[] args) {
    double saldo = 25.0;
    double valorSolicitado = 17.5;

    if(valorSolicitado <= saldo){
      saldo -= valorSolicitado;
    }

    System.out.println("Meu saldo é " + saldo);
  }
}
