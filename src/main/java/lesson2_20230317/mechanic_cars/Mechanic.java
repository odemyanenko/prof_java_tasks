package lesson2_20230317.mechanic_cars;

public class Mechanic {
  public void service(Car car) {
    car.commonService();
    car.service();
    car.washCar();
  }

  public static void main(String[] args) {
    Mechanic mechanic = new Mechanic();

    Nissan nissan = new Nissan();
    mechanic.service(nissan);
    System.out.println("-------------------------");
    BMW bmw = new BMW();
    mechanic.service(bmw);
    System.out.println("-------------------------");
    BMW bmw2 = new BMW2();
    mechanic.service(bmw2);
  }
}
