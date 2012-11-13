package br.universa.sistemasDistribuidos.aula2;

import java.net.*;
import java.io.*;

public class KnockKnockServer {
	public static void main(String[] args) throws IOException {
		try {
			ServerSocket serverSocket = new ServerSocket(4444);
			Socket clientSocket = serverSocket.accept();
			BufferedReader in = new BufferedReader(new InputStreamReader(
					clientSocket.getInputStream()));
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				System.out.println("Server: " + inputLine);
				if (inputLine.equals("Bye.")) {
					// Se alguem enviar um "Bye" o programa acaba
					break;
				}
			}
			in.close();
			clientSocket.close();
			serverSocket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
