package br.universa.sistemasDistribuidos.aula2;

import java.io.PrintWriter;
import java.net.Socket;

public class Cliente {
	public static void main(String[] args) {
		try {
			Socket echoSocket = new Socket("localhost", 4444);
			PrintWriter out = new PrintWriter(echoSocket.getOutputStream(),
					true);
			out.println("ta rodando esse servidor ai?");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
