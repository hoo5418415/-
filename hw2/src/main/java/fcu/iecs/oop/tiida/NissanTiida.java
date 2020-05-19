package fcu.iecs.oop.tiida;

public class NissanTiida {
  /** . make more bigger. */
  int count = 1;
  /** dddd. */
  public void tiida() {
    int ja;
    int ka;
    for (ja = 1; ja <= count; ja++) {
      for (ka = 1; ka <= count; ka++) {
        System.out.print("*");
      }
      System.out.printf("\n");
    }
    count ++;
  }
}
