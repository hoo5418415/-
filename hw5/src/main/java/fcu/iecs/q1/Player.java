package fcu.iecs.q1;

import java.util.Random;

public class Player {
  private String name;
  private int balance;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public Player(String name, int balance) {
    this.name = name;
    this.balance = balance;
  }

  /** i want to play a game. */
  public void play() {
    Random random = new Random();
    Cherry cherry = new Cherry();
    Watermelon watermelon = new Watermelon();
    Lemon lemon = new Lemon();
    Seven seven = new Seven();
    balance = balance - 5;
    String a1 = null;
    String a2 = null;
    String a3 = null;
    int b1 = random.nextInt(4);
    switch (b1) {
      case 0:
        a1 = cherry.getName();
        break;
      case 1:
        a1 = watermelon.getName();
        break;
      case 2:
        a1 = lemon.getName();
        break;
      case 3:
        a1 = seven.getName();
        break;
      default:
        break;
    }
    /* generate random number，判斷產生的數字來代入字串，重複三次*/
    b1 = random.nextInt(4);
    switch (b1) {
      case 0:
        a2 = cherry.getName();
        break;
      case 1:
        a2 = watermelon.getName();
        break;
      case 2:
        a2 = lemon.getName();
        break;
      case 3:
        a2 = seven.getName();
        break;
      default:
        break;
    }
    b1 = random.nextInt(4);
    switch (b1) {
      case 0:
        a3 = cherry.getName();
        break;
      case 1:
        a3 = watermelon.getName();
        break;
      case 2:
        a3 = lemon.getName();
        break;
      case 3:
        a3 = seven.getName();
        break;
      default:
        break;
    }
    System.out.println(a1 + ", " + a2 + ", " + a3);
    if (a1.equals(a2) && a2.equals(a3)) {
      if (a1.equals("Cherry")) {
        System.out.println("Reward:20");
        balance = balance + 20;
      }
      if (a1.equals("Watermelon")) {
        System.out.println("Reward:30");
        balance = balance + 30;
      }
      if (a1.equals("Lemon")) {
        System.out.println("Reward:40");
        balance = balance + 40;
      }
      if (a1.equals("Seven")) {
        System.out.println("Reward:100");
        balance = balance + 100;
      }
    } else {
      System.out.println("Reward: 0");
    }
    System.out.printf("Balance: %d\n", balance);
  }
}
