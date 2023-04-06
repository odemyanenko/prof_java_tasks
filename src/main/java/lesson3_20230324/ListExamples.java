package lesson3_20230324;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 1 - Вывести список со словом student в начале
// 2 - написать метод, который возвращал список имен, начинающихся на определенную букву s
// 3 - написать метод, который выводил бы имена, в которых количетсво букв больше n, и печатал их в CAPSLOCK

public class ListExamples {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Mary", "Tom", "Tim", "Mark", "Ann", null);

    System.out.println("---------------------------------------");
    for (String name: names
         ) {
      System.out.println("student : " + name);
    }
    System.out.println("---------------------------------------");
    List<String> searchNames = getNamesBySymbol(names, "T");
    System.out.println(searchNames);

    System.out.println("---------------------------------------");
    printNames(names, 3);

  }

  private static void printNames(List<String> names, int n) {
    for (String name: names
    ) {
      if (name != null && name.length() > n) {
        System.out.println(name.toUpperCase());
      }
    }
  }

  public static List<String> getNamesBySymbol(List<String> listNames, String letter){
    List<String> searchNames = new ArrayList<>();
    for (String name: listNames
    ) {
      if (name != null && name.toLowerCase().startsWith(letter.toLowerCase())) {
        searchNames.add(name);
      }
    }
    return searchNames;
  }

}
