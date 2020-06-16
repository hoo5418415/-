package fcu.iecs;

public class OrderCake extends Cake {
  double weight;

  @Override
  public double calcPrice() {
    double calcPrice;
    calcPrice = weight * this.getRate();
    return calcPrice;
  }

  public OrderCake(String name, double rate, double weight) {
    super(name, rate);
    this.weight = weight;
  }
}
