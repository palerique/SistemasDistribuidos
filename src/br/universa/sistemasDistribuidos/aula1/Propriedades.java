package br.universa.sistemasDistribuidos.aula1;

public class Propriedades extends Thread {
  private String chave;
  private String valor;

  public Propriedades(String chave, String valor) {
    this.chave = chave;
    this.valor = valor;
    start();
  }

  @Override
  public void run() {
    UtilPropriedades.imprime(chave, valor);
  }
}

