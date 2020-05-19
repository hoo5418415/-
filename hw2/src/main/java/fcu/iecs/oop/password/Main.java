package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {
  /** . no comment. */
  public static void main(String[] args) {
    System.out.println("Please enter a password:");
    Scanner keyboard = new Scanner(System.in);
    PasswordEncoder password = new PasswordEncoder();
    String word;
    String newword;
    String exit = "exit";
    word = keyboard.next();
    while (word.equals(exit) == false) {
      newword = password.encode(word);
      System.out.println(newword);
      word = keyboard.next();
    }
    keyboard.close();
  }
}
