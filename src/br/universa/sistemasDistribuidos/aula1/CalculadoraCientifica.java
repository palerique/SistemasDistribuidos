package br.universa.sistemasDistribuidos.aula1;

public class CalculadoraCientifica extends Thread {
	  String universidade;
	  String separador;
	  public CalculadoraCientifica(String s, String separador) {
	    universidade = s;
	    this.separador = separador;
	  }
	  public void run() {
	    System.out.println("Comecando o calculo -> " + universidade);
	    for (int i = 0; i < 10; i++) {
	      try {
	        //Para a thread por um per’odo menor que 1s (aleatorio)‏
	        Thread.sleep((long) (Math.random() * 1000));
	      } catch (InterruptedException e) {
	      }
	      System.out.print(separador);
	    }
	    System.out.println("Terminei -> " + universidade);
	  }
	}
