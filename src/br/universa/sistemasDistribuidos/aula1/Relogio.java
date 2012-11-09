package br.universa.sistemasDistribuidos.aula1;

import java.sql.*;

public class Relogio extends Thread {
  @Override
  public void run() {
    try {
      while (true) {
        Thread.sleep(1000);
        System.out.println(new Time(System.currentTimeMillis()));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    new Relogio().start();
  }
}

