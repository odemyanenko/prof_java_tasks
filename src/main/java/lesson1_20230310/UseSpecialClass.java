package lesson1_20230310;

public class UseSpecialClass {
  public static void main(String[] args) {
    //fabric method
    SpecialClass specialClass = SpecialClass.generateClass("Some name");
    System.out.println(specialClass);

    System.out.println(SpecialClass.generateRandomClass());
    System.out.println(SpecialClass.generateRandomClass());
    System.out.println(SpecialClass.generateRandomClass());

    SpecialClass.StaticClass staticClass = new SpecialClass.StaticClass();
    staticClass.setName("Static class name");
  }
}
