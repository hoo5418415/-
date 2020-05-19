package fcu.oop;

import java.util.Scanner;

public class StringComparator {
  /**.
   * compare two string.
   */
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a String1:");
    String strA = keyboard.next();
    System.out.println("Enter a String2:");
    String strB = keyboard.next();
    if (strA.equalsIgnoreCase(strB) == true) {
      System.out.println("The two string are the same");
    } else {
      System.out.println("The two string are not the same");
    }
    keyboard.close();
  }
}
