package lesson_20230818.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Task {
  public static void main(String[] args) {
  }

  public static EvenAndOddLists getEvenOddList(List<Integer> numbers){
    if (numbers == null){
      throw new IllegalArgumentException();
    }

    List<Integer> listEven = new ArrayList<>();
    List<Integer> listOdd = new ArrayList<>();
    numbers.stream()
            .filter(Objects::nonNull)
            .forEach(num -> {
              if (num % 2 == 0){
                listEven.add(num);
              } else {
                listOdd.add(num);
              }
            });

    return new EvenAndOddLists(listEven, listOdd);
  }
}
