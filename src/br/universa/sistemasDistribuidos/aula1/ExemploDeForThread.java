package br.universa.sistemasDistribuidos.aula1;

import java.util.Date;

public class ExemploDeForThread extends Thread {

	public void run() {

		Date inicial = new Date();

		for (int i = 0; i < 1000; i++) {

			System.out.println("Número sequencial: " + i);

		}

		System.out.println("Tempo de execução: "
				+ (new Date().getTime() - inicial.getTime()));

	}

	public static void main(String[] args) {

		ExemploDeForThread processo1 = new ExemploDeForThread();

		processo1.start();

	}
}
