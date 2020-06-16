package fcu.iecs;

public class ReadyMadeCake extends Cake {
  public int quantity;

  @Override
  public double calcPrice() {
    double calcPrice;
    calcPrice = this.getRate() * quantity;
    return calcPrice;
  }

  public ReadyMadeCake(String name, double rate, int quantity) {
    super(name, rate);
    this.quantity = quantity;
  }
}
