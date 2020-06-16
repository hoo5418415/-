package fcu.iecs.q1;

import java.util.Scanner;

public class Main {
  /** be happy. */
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String name;
    int value;
    name = keyboard.next();
    value = keyboard.nextInt();
    Player player = new Player(name, value);
    player.play();
    keyboard.close();
  }
}
