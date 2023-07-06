package lesson10_20230526;

import java.util.Arrays;

interface Filter2<T> {
  boolean apply(T obj);
}

public class Main {
  public static <T> T[] filter(T[] array, Filter2<T> filter) {
    int count = 0;
    for (T obj : array) {
      if (filter.apply(obj)) {
        count++;
      }
    }

    T[] result = Arrays.copyOf(array, count);
    int index = 0;
    for (T obj : array) {
      if (filter.apply(obj)) {
        result[index] = obj;
        index++;
      }
    }

    return result;
  }

  public static void main(String[] args) {
    String[] strings = {"Hello", "", "World", "", "Java"};
    String[] filteredStrings = filter(strings, obj -> !obj.isEmpty());
    System.out.println(Arrays.toString(filteredStrings));

    Integer[] numbers = {1, -2, 3, -4, 5};
    Integer[] filteredNumbers = filter(numbers, obj -> obj >= 0);
    System.out.println(Arrays.toString(filteredNumbers));
  }
}
