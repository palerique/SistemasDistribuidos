package br.universa.sistemasDistribuidos.aula1;


public class ThreadDeAuditoria extends Thread {
  private Banco banco;
  public ThreadDeAuditoria(Banco banco) {
    this.banco = banco;
  }
  public void run() {
    // Loop infinito
    while (true) {
      banco.verificaAtivosDoBanco();
      try {
        Thread.sleep(5 * 1000); //Verifica os ativos a cada 5 segundos
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("--------");
    }
  }
}
