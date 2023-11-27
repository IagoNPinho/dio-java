package edu.iago.smartTV;

public class smartTV {
  private boolean ligada = false;
  private int canal = 1;
  private int volume = 95;

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

  public int inserirCanal(int newCanal) {
    canal = newCanal;
    System.out.println("Canal " + canal);
    return canal;
  }

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
