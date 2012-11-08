package br.universa.sistemasDistribuidos.aula1;

public class ExemploContador {

	public static void main(String args[]) {
		ContadorThread c1 = new ContadorThread();
		c1.setQtde(10);
		c1.setName("t001");
		c1.start();
		ContadorThread c2 = new ContadorThread();
		c2.setQtde(15);
		c2.setName("t002");
		c2.start();
	}
}

class ContadorThread extends Thread {
	private int qtde = 0;

	public void run() {
		System.out.println("Exibindo múltiplos de " + qtde);
		for (int i = 0; i <= 100; i++) {
			if ((i % qtde) == 0) {
				System.out.println(Thread.currentThread().getName() + "> " + i);
			}
			try {
				sleep(50);
			} catch (InterruptedException ex) {
			}
		}
	}

	public void setQtde(int value) {
		this.qtde = value;
		if (this.qtde == 0)
			this.qtde = 10;
	}
}
