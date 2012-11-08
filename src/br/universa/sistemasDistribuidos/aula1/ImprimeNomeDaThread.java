package br.universa.sistemasDistribuidos.aula1;

public class ImprimeNomeDaThread extends Thread {
	  public ImprimeNomeDaThread(String nome) {
	    super(nome);
	    start();
	  }

	  @Override
	  public void run() {
	    for (int i = 0; i < 1000; i++) {
	      System.out.println(getName() + " - " + i);
	    }
	  }
}



