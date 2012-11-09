package br.universa.sistemasDistribuidos.aula1;


public class Banco {
  private static final int NUMERO_PARA_TESTE = 1000; //Implementacao futura
  private int quantidadeDeTransacoes;
  private int[] contas;
  /**
   * Contrutor da classe
   * Recebe a quantidade de contas a serem criadas 
   * Inicia cada conta com o respectivo saldo
   * Inicia a quantidade de transacoes do dia (zero)‏
   * */
  public Banco(int quantidadeDeContas, int saldoInicial) {
    contas = new int[quantidadeDeContas];
    for (int i = 0; i < contas.length; i++) {
      contas[i] = saldoInicial;
    }
    quantidadeDeTransacoes = 0;
  }
  
/**
 * Metodo central da aplicacao
 * Como parametro voce deve indicar a conta de origem, a conta de destino e o valor
 * 
 * */
public void transfere(int origem, int destino, int valorParaTransferir) {
  //Caso a conta de origem nao tenha saldo suficiente, para a execucao
  if (contas[origem] < valorParaTransferir) {
    //        System.out.println("Saldo insuficiente");
    //wait();
    return;
  }
  contas[origem] -= valorParaTransferir;
  contas[destino] += valorParaTransferir;
  quantidadeDeTransacoes++;
  //notifyAll();
  //if (ntransacts % NTEST == 0) {
  //verificaAtivosDoBanco();
  //}
}

/**
 * Varre todas as contas e verifica se o volume de dinheiro esta correto
 * Os ativos do banco devem ser iguais durante toda a execucao do programa,
 * uma vez que o dinheiro sai de uma conta e entra na outra.
 * Nao pode nem aparecer e muito menos deparecer dinheiro.
 */
public void verificaAtivosDoBanco() {
  int total = 0;
  for (int i = 0; i < contas.length; i++) {
    total += contas[i];
  }
  if (total != MovimentacoesDoDia.SALDO_INICIAL
      * MovimentacoesDoDia.NUMERO_DE_CONTAS) {
    try {
      Thread.sleep(1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
  System.out.println("Quantidade de transacoes: " + quantidadeDeTransacoes
      + "\nTotal depositado: " + total);
}
public int size() {
  return contas.length;
}
}	




