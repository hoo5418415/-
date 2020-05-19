package fcu.oop;

import java.util.Scanner;

public class PrintNumberInWord {
  /**.
  * input a number.
  * output the word number 1 to 9.
  */
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a Interger:");
    int number = keyboard.nextInt();
    System.out.print("The input integer is ");
    switch (number) {
      case 1:
        System.out.println("\"ONE\"");
        break;
      case 2:
        System.out.println("\"TWO\"");
        break;
      case 3:
        System.out.println("\"THREE\"");
        break;
      case 4:
        System.out.println("\"FOUR\"");
        break;
      case 5:
        System.out.println("\"FIVE\"");
        break;
      case 6:
        System.out.println("\"SIX\"");
        break;
      case 7:
        System.out.println("\"SEVEN\"");
        break;
      case 8:
        System.out.println("\"EIGHT\"");
        break;
      case 9:
        System.out.println("\"NINE\"");
        break;
      default:
        System.out.println("\"OTHER\"");
        break;
    }
    keyboard.close();
  }
}
