package lesson2_20230317.mechanic_cars;

import lesson2_20230317.mechanic_cars.Car;

public class Tesla extends Car {
  @Override
  public String toString() {
    return "Tesla";
  }
  public void service() {
    System.out.println("Special service for :" + this.toString());
  }
}
