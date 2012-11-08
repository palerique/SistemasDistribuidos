package br.universa.sistemasDistribuidos.aula1;

import java.util.Date;

public class ExemploDeForThread2 extends Thread {

	public ExemploDeForThread2(String nome) {

		super(nome);
		start();
	}

	public void run() {

		Date inicial = new Date();

		for (int i = 0; i < 1000; i++) {

			System.out.println(getName() + " Número sequencial: " + i);

		}
		System.out.println("************************************************");
		System.out.println("Tempo de execução: "
				+ (new Date().getTime() - inicial.getTime()));
		System.out.println("************************************************");

	}

	public static void main(String[] args) {

		new ExemploDeForThread2("A");
		new ExemploDeForThread2("B");

	}
}
