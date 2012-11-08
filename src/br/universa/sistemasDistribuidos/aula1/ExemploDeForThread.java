package br.universa.sistemasDistribuidos.aula1;

public class ExemploDeForThread extends Thread {
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(getName() + "Número sequencial - ExemploDeForThread: " + i);
		}
	}

}
