package lesson6_20230428.home;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
        1. Посчитать количество неповторяющихся слов в списке
        2. Посчитать количество людей с именем "Tom" в списке имен
        3. Из списка имен вывести первое по алфавиту
        4. Посчитать количество чисел от 1 до 1000, которые делятся на 7.
        5. Посчитать сумму квадратов чисел от 1 до 10
        6. Дан список слов "Specific" "Measurable" "Achievable" "Relevant" "Time-bound". С помощью стримов вывести его аббревиатуру в виде S.M.A.R.T.
*/

public class Main {
  public static void main(String[] args) {
    System.out.println("-----------------------------------------------------------------------");
    //1. Посчитать количество неповторяющихся слов в списке
    task1();

    System.out.println("-----------------------------------------------------------------------");
    //2. Посчитать количество людей с именем "Tom" в списке имен
    task2();

    System.out.println("-----------------------------------------------------------------------");
    //3. Из списка имен вывести первое по алфавиту
    task3();

    System.out.println("-----------------------------------------------------------------------");
    //4. Посчитать количество чисел от 1 до 1000, которые делятся на 7.
    task4();

    System.out.println("-----------------------------------------------------------------------");
    //5. Посчитать сумму квадратов чисел от 1 до 10
    task5();

    System.out.println("-----------------------------------------------------------------------");
    //6. Дан список слов "Specific" "Measurable" "Achievable" "Relevant" "Time-bound". С помощью стримов вывести его аббревиатуру в виде S.M.A.R.T.
    task6();
  }

  private static void task6() {
    List<String> list = Arrays.asList("Specific", "Measurable", "Achievable", "Relevant", "Time-bound");

    System.out.println("Task6. Дан список слов. С помощью стримов вывести его аббревиатуру в виде S.M.A.R.T.");

    list.stream().
            forEach(e -> System.out.print(e.substring(0, 1) + "."));
  }

  private static void task5() {
    System.out.println("Task5. Посчитать сумму квадратов чисел от 1 до 10");

    int sum = IntStream.rangeClosed(1, 10)
            .map(e -> e * e)
            .sum();

    System.out.println(sum);
  }

  private static void task4() {
    System.out.println("Task4. Посчитать количество чисел от 1 до 1000, которые делятся на 7.");

    long count = IntStream.rangeClosed(1, 1000)
            .filter(e -> e % 7 == 0)
            .count();

    System.out.println(count);
  }

  private static void task3() {
    List<String> list = Arrays.asList("Mary", "Jane", "Tom", "Edward", "Jimmy", "Mary", "Tom");

    System.out.println("Task3. Из списка имен вывести первое по алфавиту");

    List<String> sortedList = list.stream()
            .sorted()
            .toList();
    System.out.println(sortedList);

  }

  private static void task2() {
    List<String> list = Arrays.asList("Mary", "Jane", "Tom", "Edward", "Jimmy", "Mary", "Tom");

    System.out.println("Task2. Посчитать количество людей с именем \"Tom\" в списке имен");

    long count = list.stream()
            .filter(e -> e.equals("Tom"))
            .count();
    System.out.println(count);

  }

  private static void task1() {
    List<String> list = Arrays.asList("Mary", "Jane", "Tom", "Edward", "Jimmy", "Mary");

    System.out.println("Task1. Посчитать количество неповторяющихся слов в списке");

    List<String> set = list.stream()
            .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
            .entrySet()
            .stream()
            .filter(e -> e.getValue() == 1)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());

    System.out.println(set);
  }
}
