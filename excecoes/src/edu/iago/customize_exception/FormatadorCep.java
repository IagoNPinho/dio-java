package edu.iago.customize_exception;

public class FormatadorCep {

  public static void main(String[] args) {
    try{
      String cepFormatado = formatarCep("61650450");
      System.out.println(cepFormatado);
    } catch(CepInvalidoException e){
      System.out.println("O cep não corresponde com as regras de negócio!");
    }
  }

  static String formatarCep(String cep) throws CepInvalidoException{
    if(cep.length() != 8){
      throw new CepInvalidoException();
    }
    
      //simulando um cep formatado
      return "23765064";
  }
}
