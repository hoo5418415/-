package fcu.oop;

import java.util.Scanner;

public class KeyboardScanner {
  /**.
   * input two number¡Aone integer¡Aone float.
   * output the multiplication of two number.
   * javadoc.
   */
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a interger:");
    int number = keyboard.nextInt();
    System.out.println("Enter a float point number:");
    float point = keyboard.nextFloat();
    System.out.println("Enter a you name:");
    String name = keyboard.next();
    float sum = number * point;
    System.out.print("Hi " + name + " the multiplication of " + number + " and " + point);
    System.out.printf(" is %.2e",sum);
    keyboard.close();
  }
}
