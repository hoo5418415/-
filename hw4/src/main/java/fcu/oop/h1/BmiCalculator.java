package fcu.oop.h1;

public class BmiCalculator {
  /**.
   * hhh.
   *  weight.
   *  height.
   * @return.
   */
  public static double getBmi(double weight, double height) {
    double bmi;
    double neheight = height * height;
    bmi = weight / neheight;
    return bmi;
  }
  /**.
   * hello.
   */
  
  public static String getBmi(String weight, String height) {
    double wei = Double.valueOf(weight);
    double hei = Double.valueOf(height);
    double bmi = getBmi(wei, hei);
    String re = String.valueOf(bmi);
    return re;
  }
}
