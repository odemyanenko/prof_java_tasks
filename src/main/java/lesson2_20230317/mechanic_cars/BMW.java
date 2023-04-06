package lesson2_20230317.mechanic_cars;

public class BMW extends Car {
  @Override
  public String toString() {
    return "BMW";
  }

  public void service() {
    System.out.println("Special service for :" + this.toString());
  }
}
