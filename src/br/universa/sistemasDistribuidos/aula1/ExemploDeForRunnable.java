package br.universa.sistemasDistribuidos.aula1;

public class ExemploDeForRunnable implements Runnable {

	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("Número sequencial: " + i);
		}
	}

	public static void main(String[] args) {
		ExemploDeForRunnable processo1 = new ExemploDeForRunnable();
		Thread minhaThread = new Thread(processo1);
		minhaThread.start();

		ExemploDeForRunnable processo2 = new ExemploDeForRunnable();
		minhaThread = new Thread(processo2);
		minhaThread.start();

	}

}
