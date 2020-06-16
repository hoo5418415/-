package fcu.iecs;

public class Main {
  /** . i need you javadoc. */
  public static void main(String[] args) {
    Cake[] cake = new Cake[5];
    OrderCake cake1 = new OrderCake("a", 10, 20);
    OrderCake cake2 = new OrderCake("b", 20, 30);
    OrderCake cake3 = new OrderCake("c", 30, 40);
    final ReadyMadeCake cake4 = new ReadyMadeCake("d", 40, 50);
    final ReadyMadeCake cake5 = new ReadyMadeCake("e", 50, 60);
    cake[0] = cake1;
    cake[1] = cake2;
    cake[2] = cake3;
    cake[3] = cake4;
    cake[4] = cake5;
    int ia;
    double cakeprice = 0;
    for (ia = 0; ia < 5; ia++) {
      if (cake[ia] instanceof OrderCake) {
        cakeprice += cake[ia].calcPrice();
      }
    }
    System.out.println(cakeprice);
    double makeCakePrice = 0;
    int cakeQnantity = 3;
    for (ia = 0; ia < 5; ia++) {
      if (cake[ia] instanceof ReadyMadeCake) {
        makeCakePrice += cake[ia].calcPrice();
      }
    }
    System.out.println(makeCakePrice);
    System.out.println(cakeQnantity);
    double highest = 0;
    for (ia = 0; ia < 5; ia++) {
      if (cake[ia].calcPrice() > highest) {
        highest = cake[ia].calcPrice();
      }
    }
    System.out.println(highest);
  }
}
