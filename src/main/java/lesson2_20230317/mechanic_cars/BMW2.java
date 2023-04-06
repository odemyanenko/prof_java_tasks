package lesson2_20230317.mechanic_cars;

import lesson2_20230317.mechanic_cars.BMW;

public class BMW2 extends BMW {
  @Override
  public String toString() {
    return "BMW2";
  }

  public void service() {
    System.out.println("Special service for :" + this.toString());
  }
}
