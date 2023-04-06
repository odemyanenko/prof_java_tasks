package lesson2_20230317.mechanic_cars;

public abstract class Car{
  public void commonService() {
    System.out.println("Common service for a car");
  }

  public void washCar() {
    System.out.println("Washing a car");
  }

   public abstract void service();
}
