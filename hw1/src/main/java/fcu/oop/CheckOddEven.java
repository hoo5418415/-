package fcu.oop;

import java.util.Scanner;

public class CheckOddEven {
  /**.
  * check number is even or odd.
  * I hate javadoc.
  */
  public static void main(String[] args) {
    System.out.println("Enter a interger:");
    Scanner keyboard = new Scanner(System.in);
    int number = keyboard.nextInt();
    if (number % 2 == 0) {
      System.out.println("The input interger is Even Number");
    } else {
      System.out.println("The input interger is Odd Number");
    }
    keyboard.close();
  }
}
