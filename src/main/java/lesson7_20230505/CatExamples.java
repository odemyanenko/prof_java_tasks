package lesson7_20230505;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CatExamples {

  public static void main(String[] args) {

    Cat cat1 = new Cat("Tom", 2, "black", true);
    Cat cat2 = new Cat("Mikky", 1, "white", false);
    Cat cat3 = new Cat("Vasya", 3, "white", true);
    Cat cat4 = new Cat("Steve", 1, "grey", false);
    Cat cat5 = new Cat("Bob", 2, "black", true);
    List<Cat> catList = Arrays.asList(cat1, cat2, cat3, cat4, cat5);

    List<Cat> white = catList.stream().filter(cat -> cat.getColour().equals("white")).toList();
    catList.get(1).setColour("black");
    System.out.println(white);

    // 1. Получить Map<String, Boolean> имя / информация, голодна ли кошка
    System.out.println("Is Bob hungry? - " + isHungryCat(catList, "Bob"));
    System.out.println("Is Steve hungry? - " + isHungryCat(catList, "Steve"));

    // 2. Получить Map<String, Long> цвет / количество кошек данного цвета
    System.out.println("Count cats of color WHITE: " + getCountCatsByColor(catList, "white"));
    System.out.println("Count cats of color BLACK: " + getCountCatsByColor(catList, "black"));

    // 3. Получить Map<String, Set<String>> цвет / список имен кошек данного цвета
    List<String> nameBlackCats = getNameCatsByColor(catList, "black");
    System.out.println("Black cats: " + nameBlackCats);

    // 4. Получить Map<Integer, Integer> возраст / количество голодных кошек данного возраста
    System.out.println(getCountCatsByAge(catList, 2));

  }

  private static int getCountCatsByAge(List<Cat> cats, int age) {
    Map<String, Integer> collect = cats.stream()
            .collect(Collectors.toMap(Cat::getName, cat -> {
              return cat.isHungry() ? 1 : 0;
            }, Integer::sum));
    System.out.println(collect);

    return (int)cats.stream()
            .filter(e->e.getAge() == age)
            .collect(Collectors.toMap(Cat::getName, Cat::isHungry))
            .entrySet()
            .stream()
            .filter(Map.Entry::getValue)
            .map(Map.Entry::getKey)
            .count();
  }

  private static List<String> getNameCatsByColor(List<Cat> cats, String color) {
    Map<String, Set<String>> collect = cats.stream()
            .collect(Collectors.groupingBy(cat -> cat.getColour(), Collectors.mapping(cat -> cat.getName(), Collectors.toSet())));
    System.out.println(collect);

    return cats.stream()
            .collect(Collectors.toMap(Cat::getName, Cat::getColour))
            .entrySet()
            .stream()
            .filter(e -> e.getValue().equals(color))
            .map(Map.Entry::getKey)
            .toList()
            ;
  }

  private static long getCountCatsByColor(List<Cat> cats, String color) {

    Map<String, Long> collect = cats.stream().collect(Collectors.groupingBy(Cat::getColour, Collectors.counting()));
    System.out.println(collect);

    return cats.stream()
            .collect(Collectors.toMap(Cat::getName, Cat::getColour))
            .entrySet()
            .stream()
            .filter(e -> e.getValue().equals(color))
            .map(Map.Entry::getKey)
            .count()
            ;
  }

  private static boolean isHungryCat(List<Cat> cats, String name) {
    Map<String, Boolean> map = cats.stream()
            .collect(Collectors.toMap(Cat::getName, Cat::isHungry));
    return map.get(name);
  }
}
