package br.universa.sistemasDistribuidos.aula1;

public class ExemploFor {
		public static void main (String[] args) {
				for (int i = 1; i < 100000; i++){
					System.out.println("ExemploFor " +i);
				}
				
				System.out.println("Acabou o primeiro For");
				
				for (int i = 0; i < 100000; i++) {
					System.out.println(i);
				}
				
		}
}
