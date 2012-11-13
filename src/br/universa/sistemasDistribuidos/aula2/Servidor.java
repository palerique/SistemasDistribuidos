package br.universa.sistemasDistribuidos.aula2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(4444);
			Socket clientSocket = serverSocket.accept();
			BufferedReader in = new BufferedReader(new InputStreamReader(
					clientSocket.getInputStream()));
			System.out.println(in.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
