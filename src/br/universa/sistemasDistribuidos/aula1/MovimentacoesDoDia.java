package br.universa.sistemasDistribuidos.aula1;


public class MovimentacoesDoDia {
  public static final int NUMERO_DE_CONTAS = 50;
  public static final int SALDO_INICIAL = 100;
  public static void main(String[] args) {
    //Inicia um banco com N contas.
    //atribui a cada conta o saldo inicial
    Banco nossoBanco = new Banco(NUMERO_DE_CONTAS, SALDO_INICIAL);
    for (int i = 0; i < NUMERO_DE_CONTAS; i++) {
      ThreadDeTranferencia t = new ThreadDeTranferencia(nossoBanco, i,
          SALDO_INICIAL);
      t.start();
    }
    ThreadDeAuditoria t = new ThreadDeAuditoria(nossoBanco);
    t.start();
  }
}
