package lesson5_20230421;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StreamExamples {
  public static void main(String[] args) {
//    MyFuncInterface my = new MyFuncInterface() {
//      @Override
//      public String generateString() {
//        return "my string";
//      }
//    };

    MyFunctionalInterface my = () -> "my string 1";
    MyFunctionalInterface my2 = () -> "my string 2";

    Supplier<String> my3 = () -> "my string 3";

    System.out.println(my.generateString());
    System.out.println(my2.generateString());
    System.out.println(my3.get());

    System.out.println("---------------------");
    MyOperation<Integer> sum = ((x, y, z) -> x + y + z);
    System.out.println(sum.operation(2, 2, 3));

    MyOperation<Double> mult = ((x, y, z) -> x * y * z);
    System.out.println(mult.operation(2.0, 2.0, 3.0));

    MyOperation<String> str = ((x, y, z) -> x + y + z);
    System.out.println(str.operation("2", "2", "3"));

    System.out.println("---------------------");
    Consumer<String > consumer = s -> {
      int i = 0;
      i++;
      System.out.println(s + i);
    };
    consumer.accept("asd");

    Consumer<String > consumer1 = System.out::println;
    consumer1.accept("Print consumer!");

    System.out.println("---------------------");
    Function<Integer, String> function = integer -> "integer = " + integer;
    System.out.println(function.apply(123));

    System.out.println("---------------------");
    Predicate<String> isLongerThanFive = s -> s.length() > 5;
    System.out.println(isLongerThanFive.test("sfsdfadfafasfsa"));

  }
}
