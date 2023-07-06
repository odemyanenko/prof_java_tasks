package lesson10_20230526;

//1. Написать Generic метод <T> List<T> makeList(T[] t), который преобразует массив в список
//2. Написать Generic метод <T> T[] makeArray(List<T> list), который преобразует список в массив
//3. Задание: напишите метод filter(Object[] ints, ()->()), который принимает на вход массив (любого типа)
//        и реализацию интерфейса Filter c методом apply (Object o), чтобы убрать из массива лишнее.
//        Проверьте как он работает на строках или других объектах.
//interface Filter {
//  boolean apply(o);
//}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
  public static void main(String[] args) {
    String[] arrString = {"QWE", "ASD"};
    List<String> list = makeList(arrString);
    System.out.println(list);
    list.add("XCV");
//    Object[] newArray = makeArray(list);
//    System.out.println(Arrays.toString(newArray));

    // --3
    Integer[] integersToFilter = new Integer[]{1, 2, 3, 4, 5};
    String[] stringsToFilter = new String[]{"Hello", "World", "A", "B", "C"};

    List<Integer> filteredIntegers = filter(integersToFilter, i -> i % 2 == 0);
    System.out.println(filteredIntegers);

//    List<String> filteredStrings = filter(stringsToFilter, s -> s.length() == 5);
//    System.out.println(filteredStrings);

//    filter(integersToFilter, i -> i % 2 == 0);
   // filter(stringsToFilter, s -> s.length() == 5);
  }

  public static <T> List<T> makeList(T[] t) {
    return Arrays.asList(t);
  }

//  public static <T> T[] makeArray(List<T> list) {
//    return list.toArray((T[]) new Object[list.size()]);
//  }

//  public static <T> T[] makeArray(List<T> list) {
//    Object[] objects = new Object[list.size()];
//    return (T[]) objects;
//  }

  public static <T> List<T> filter(T[] array, Filter<T> filter) {
    System.out.println("sdfsdfsdf");
    List<T> result = new ArrayList<>();
    for (T element : array) {
      if (filter.apply(element)) {
        result.add(element);
      }
    }
    System.out.println(result);
    return result;
  }
}
