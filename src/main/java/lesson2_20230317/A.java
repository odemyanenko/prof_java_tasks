package lesson2_20230317;

public class A {
  private int i;
  private static int count;


  public void method1() {
    System.out.println(i++);
  }

  public static void getTotalElementCount(){
    System.out.println(count);
  }

  public static void main(String[] args) {
    A a1 = new A();
    A a2 = new A();
    A a3 = new A();
    A a4 = new A();

    a1.method1();
    A.getTotalElementCount();
  }
}
