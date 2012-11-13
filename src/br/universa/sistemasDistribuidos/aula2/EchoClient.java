package br.universa.sistemasDistribuidos.aula2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {
	public static void main(String[] args) throws IOException {
		try {
			Socket echoSocket = new Socket("172.16.1.100", 4444);
			PrintWriter out = new PrintWriter(echoSocket.getOutputStream(),
					true);
			BufferedReader stdIn = new BufferedReader(new InputStreamReader(
					System.in));
			String userInput = null;
			while ((userInput = stdIn.readLine()) != null) {
				out.println(userInput);
			}
			out.close();
			stdIn.close();
			echoSocket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
