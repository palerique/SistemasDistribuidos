package br.universa.sistemasDistribuidos.aula1;

public class ExemploDeForRunnable implements Runnable {
	  public void run() {
		    for (int i = 0; i < 1000; i++) {
		        System.out.println("Número sequencial: " + i);
		        System.out.println("Nome da Thread: "
		            + Thread.currentThread().getName());
		    }
		  }
		}
