package edu.iago.operadores;

import java.util.Objects;

public class Operadores {

  public static void main(String[] args) {
    // -------Operador (+) para concatenar-------
    String nomeCompleto = "LINGUAGEM" + "JAVA";
    System.out.println(nomeCompleto);

    String concat = "?";

    concat = 1 + 1 + 1 + "1";

    concat = 1 + "1" + 1 + 1;

    concat = 1 + "1" + 1 + "1";

    concat = "1" + 1 + 1 + 1;

    concat = "1" + (1 + 1 + 1);

    // -------Operadores Aritimetícos-------
    // + (soma) ; - (subtração) ; * (multiplicação) ; / (divisão) ; %
    // (modulo)/(resto da divisão) ; () (prioridade)

    double soma = 10.6 + 4.8;
    int subtracao = 8 - 4;
    int multiplicacao = 7 * 2;
    int divisao = 12 / 3;
    int modulo = 11 % 2;
    double resultado = (12 + 4) * (15 + 8);

    // -------Operadores Únarios-------
    // + (valor positivo) ; - (valor negativo) ; ++ (incremento de valor) ; --
    // (decremento de valor) ; ! (negação lógica)
    int positivo = +4; // Declara que o valor é positivo (feito de forma implicita)
    int negativo = -4; // Funciona como uma inversão de valores igual ao ! ou a expressão (*-1);
    
    negativo = -negativo;
    System.out.println(negativo);

    negativo = -negativo;
    System.out.println(negativo);

    ++positivo;
    System.out.println(positivo);

    --positivo;
    System.out.println(positivo);

    boolean valores = false;
    System.out.println(!valores);

    // -------Operador Ternario-------
    // (Condição)?(Valor para condição verdadeira):(Valor para condição negativa)
    // utilizado no lugar do IfElse quando se trata de opções de leitura
    // rápida.

    String iguais = negativo == positivo ? "True" : "False";
    System.out.println(iguais);

    // -------Operadores Relacionais-------
    // == (igual) ; != (diferente) ; > (maior que) ; >= (maior ou igual que) ; <
    // (menor que) ; <= (menor ou igual que)

    System.out.println(negativo == positivo);
    System.out.println(negativo != positivo);
    System.out.println(negativo > positivo);
    System.out.println(negativo >= positivo);
    System.out.println(negativo < positivo);
    System.out.println(negativo <= positivo);
    
    // -------Operador Relacional p/ objetos-------
    // .equals()
    
    Integer num1 = 10;
    Integer num2 = 10;
    System.out.println("objetos iguais? " + (Objects.equals(num1, num2)));
    
    // -------Operadores Lógicos-------
    // && (E) ; || (OU) 
    
    if((num1.equals(num2))&&(positivo == -negativo)){
      System.out.println("Verdadeiros");
    }
  }
}
