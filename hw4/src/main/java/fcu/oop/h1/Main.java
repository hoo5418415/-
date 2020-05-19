package fcu.oop.h1;

import java.util.Scanner;

public class Main {
  /**.
   * call bmi.
   */
  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
    String weight;
    String height;
    weight = keyboard.next();
    height = keyboard.next();
    String re;
    re = BmiCalculator.getBmi(weight, height);
    System.out.println(re);
    keyboard.close();
  }

}
