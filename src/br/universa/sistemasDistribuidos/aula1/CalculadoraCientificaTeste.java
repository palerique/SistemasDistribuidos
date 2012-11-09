package br.universa.sistemasDistribuidos.aula1;

public class CalculadoraCientificaTeste {
  public static void main(String[] args) {
    CalculadoraCientifica usp = new CalculadoraCientifica("USP", ".");
    CalculadoraCientifica unb = new CalculadoraCientifica("UNB", ",");
//    try {
//      usp.start();
//      unb.start();
//      System.out.println("Threads iniciadas.");
//      //Espera ate a usp terminar. 
//      usp.join();
//      System.out.println("A USP terminou.");
//    } catch (Exception e) {
//      e.printStackTrace();
//    }
    try {
        usp.start();
        unb.start();
        System.out.println("Threads iniciadas.");
        //Espera ate no maximo 1000ms a usp terminar. 
        //Se nao terminar a execucao continua. 
        usp.join(1000);
        System.out.println("A USP deveria ter terminado.");
        unb.join();
        System.out.println("A UNB terminou.");
      } catch (Exception e) {
        e.printStackTrace();
      }
  }
}
