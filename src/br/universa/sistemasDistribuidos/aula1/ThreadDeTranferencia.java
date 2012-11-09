package br.universa.sistemasDistribuidos.aula1;


public class ThreadDeTranferencia extends Thread {
  private Banco bancoLocal;
  private int contaDeOrigem;
  private int contaDeDestino;

  public ThreadDeTranferencia(Banco b, int from, int max) {
    bancoLocal = b;
    contaDeOrigem = from;
    contaDeDestino = max;
  }

  @Override
  public void run() {
    try {
      while (true) {
        int contaDeDestinoAleatoria = (int) (bancoLocal.size() * Math.random());
        int valorAleatorio = (int) (contaDeDestino * Math.random());
        bancoLocal.transfere(contaDeOrigem, contaDeDestinoAleatoria, valorAleatorio);
        sleep(1);
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

