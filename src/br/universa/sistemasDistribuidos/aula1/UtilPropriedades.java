package br.universa.sistemasDistribuidos.aula1;

public class UtilPropriedades {
	  public synchronized static void imprime(String chave, String valor) {
	    try {
	      System.out.println("Chave: " + chave);
	      Thread.sleep(500);
	      System.out.println("Valor: " + valor);
	      System.out.println("--------------------");
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }
	  }
	}
