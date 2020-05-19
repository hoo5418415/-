package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main {
  /**
   * due to checkstyle doesn't work on my computer. so I have to upload many times to check my
   * style.
   */
  public static void main(String[] args) {
    System.out.print("Please enter a number: ");
    Scanner keyboard = new Scanner(System.in);
    NissanTiida tida = new NissanTiida();
    int number;
    number = keyboard.nextInt();
    int ia;
    for (ia = 1; ia <= number; ia++) {
      tida.tiida();
    }
    keyboard.close();
  }
}
