import java.io.Console;

public class MinhaClasse {
  
  public static void main(String[] args) {
    /*
     * // Anatomia 1
     * System.out.print ("OlÁ, DIO!");
     * 
     * // Anatomia 2
     * int ano = 2022;
     * ano = 2023;
     * 
     * final String BR = "Brasil";
     * //BR = "Brazil"; 
     */

    // Anatomia 3.1
    String primeiroNome = "Iago";
    String segundoNome = "Pinho";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.print(nomeCompleto);
    
  }

  //Anatomia 3.2
  public static String nomeCompleto(String primeiroNome, String segundoNome){
    return "Resultado do metódo".concat(primeiroNome).concat(" ").concat(segundoNome);
  }

}
