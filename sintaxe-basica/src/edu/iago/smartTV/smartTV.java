package edu.iago.smartTV;

/**
 * <h1>Televisão Smart</h1>
 * <p>
 * A Televisão realiza os comandos básicos de ligar, mudar de canal e aumentar
 * ou diminuir o volume.
 * </p>
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classes
 * para desfrutar dos recursos oferecidos pelo autor.
 * </p>
 * 
 * @author Iago Pinho
 * @version 1.0
 * @since 27/11/2023
 */

public class smartTV {
  private boolean ligada = false;
  private int canal = 1;
  private int volume = 95;

  /**
   * Este metódo é utilizado para ligar a televisão.
   * 
   * @throws Ligada Caso a TV já esteja ligada, ele a desliga igual ao controle de
   *                televisão.
   */
  public void ligar() {
    if (ligada == false) {
      ligada = true;
      System.out.println("Ligando a TV");
      System.out.println("Olá!");
    } else {
      ligada = false;
      System.out.println("Desligando... Até mais!");
    }
  }

  /**
   * Este metódo é utilizado para desligar a televisão.
   * 
   * @throws Desligada Caso a TV já esteja desligada, ele a liga igual ao controle
   *                   de televisão.
   */
  public void desligar() {
    if (ligada == true) {
      ligada = false;
      System.out.println("Até mais!");
    } else {
      ligada = true;
      System.out.println("Ligando a TV");
      System.out.println("Olá!");
    }
  }

  /**
   * Este metódo é utilizado para avançar para o próximo canal.
   * 
   * @return int o canal que irá avançar
   * @throws Máximo Caso a TV já esteja no último canal, ele irá para o primeiro.
   */
  public int proximoCanal() {
    if ((canal + 1) == 100) {
      canal = 1;
      System.out.println("Canal " + canal);
      return canal;
    } else {
      canal++;
      System.out.println("Canal " + canal);
      return canal;
    }
  }

  /**
   * Este metódo é utilizado para voltar ao canal anterior.
   * Caso a TV já esteja no primeiro canal, ele irá para o último.
   * 
   * @return int o canal que irá voltar.
   */
  public int canalAnterior() {
    if ((canal - 1) == 0) {
      canal = 99;
      System.out.println("Canal " + canal);
      return canal;
    } else {
      canal--;
      System.out.println("Canal " + canal);
      return canal;
    }
  }

  /**
   * Este metódo é utilizado para indicar qual canal deseja ir.
   * Caso o canal inserido não exista, ele continuar no mesmo canal.
   * 
   * @return int o canal que irá mudar.
   */
  public int inserirCanal(int newCanal) {
    if (newCanal > 99 || newCanal < 1) {
      System.out.println("Canal " + newCanal + " Inexistente!");
      System.out.println("Canal atual" + canal);
      return canal;
    } else {
      canal = newCanal;
      System.out.println("Canal " + canal);
      return canal;
    }
  }

  /**
   * Este metódo é utilizado para aumentar o volume.
   * Caso a TV já esteja no último volume, ele não irá aumentar.
   * 
   * @return int o canal que irá avançar
   */
  public int aumentarVolume() {
    if ((volume + 1) == 100) {
      System.out.println("Volume Máximo: " + volume + "!");
      return volume;
    } else {
      volume++;
      System.out.println("Volume " + volume);
      return volume;
    }
  }

  /**
   * Este metódo é utilizado para diminuir o volume.
   * Caso a TV já esteja no menor volume, ele não irá diminuir.
   * 
   * @return int o canal que irá avançar
   */
  public int diminuirVolume() {
    if ((volume - 1) == -1) {
      System.out.println("Volume mínimo: " + volume + "!");
      return volume;
    } else {
      volume--;
      System.out.println("Volume " + volume);
      return volume;
    }
  }
}