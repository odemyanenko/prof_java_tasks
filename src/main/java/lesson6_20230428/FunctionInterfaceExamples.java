package lesson6_20230428;

//1. Создать Supplier, который генерирует случайные значения типа Integer
//2. Создать BiFunction, которая возводит первый аргумент типа int в степень второго аргумента типа int
//3. Создать функцию, которая обрезает входную строку до 5 символов, делает их upper case
//        и добавляет ____ в конец.


import java.util.Random;
import java.util.function.*;

public class FunctionInterfaceExamples {
  public static void main(String[] args) {
    System.out.println("Random Integer = " + getRandomInteger());
    System.out.println("Power 4 = " + getPowerNumber(3, 4));
    System.out.println("Result = " + getNewString("asdfgsgsfgsf"));
  }

  private static String getNewString(String text) {
    System.out.println("Task3. Создать функцию, которая обрезает входную строку до 5 символов, делает их upper case\n" +
            "и добавляет ____ в конец :");

    UnaryOperator<String> modifiedString = String::toUpperCase;
    //Function<String, String>

    Function<String, String> beforeFunction = s -> s.substring(0, 5);
    Function<String, String> afterFunction = s -> s + "____";
    Function<String, String> finalFunction = modifiedString.compose(beforeFunction).andThen(afterFunction);

    return finalFunction.apply(text);
  }

  private static Integer getPowerNumber(int base, int exponent) {
    System.out.println("Task2. Создать BiFunction, которая возводит первый аргумент типа int в степень второго аргумента типа int :");
    BinaryOperator<Integer> function = (b, e) -> (int) Math.pow(base, exponent);
//  BiFunction<Integer, Integer, Integer>
    return function.apply(base, exponent);
  }

  private static int getRandomInteger() {
    System.out.println("Task1. Создать Supplier, который генерирует случайные значения типа Integer :");
    Supplier<Integer> randomSupplier = () -> new Random().nextInt(50);
    return randomSupplier.get();
  }
}
