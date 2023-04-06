package lesson2_20230317;

public class UseChangeable {
  public static void main(String[] args) {
    Changeable changeable = new IncreaseValue();
    Changeable changeable2 = new DecreaseValue();
    Changeable changeable3 = new Multiplay();

    System.out.println(changeable.change(10, 1));
    System.out.println(changeable2.change(10, 1));
    System.out.println(changeable3.change(10, 2));
  }
}
