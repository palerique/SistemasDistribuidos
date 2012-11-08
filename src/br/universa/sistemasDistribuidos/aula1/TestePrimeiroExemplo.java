package br.universa.sistemasDistribuidos.aula1;


public class TestePrimeiroExemplo {
	  public static void main(String[] args) {
		/* System.out.println(Thread.currentThread().getName());
	    ExemploDeForThread processo1 = new ExemploDeForThread();
	    processo1.start();
	
	  
	    ExemploDeForThread processo2 = new ExemploDeForThread();
	    processo2.start();
	    */
	    
		  ExemploDeForRunnable processo1 = new ExemploDeForRunnable();
		    Thread minhaThread = new Thread(processo1);
		    minhaThread.setName("Thread 1");
		    minhaThread.start();

		    ExemploDeForRunnable processo2 = new ExemploDeForRunnable();
		    minhaThread = new Thread(processo2);
		    minhaThread.setName("Thread 2");
		    minhaThread.start();

	}
}
