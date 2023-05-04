package lesson6_20230428;

/*
1. Отсортировать с помощью стримов список из строк
        - по алфавиту
        - в обратном порядке
        2. Из списка чисел типа Integer с помощью стримов создать список их строковых представлений
        3. Создать класс Cat с полями
        String name
        int age
        String colour
        boolean isHungry
        Создать список из экземплянов класса Cat. С помощью стримов:
        - вывести список голодных кошек старше 2 лет
        - вывести список черных кошек с именем, начинающимся на T
        - вывести список имен кошек возраста 1 год
*/


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamTasks {
  public static void main(String[] args) {
    List<String> stringList = Arrays.asList("Mary", "Jane", "Tom", "Edward", "Jimmy");

    //1.1
    List<String> sortedList = stringList.stream().sorted().toList();
    System.out.println(sortedList.toString());
    //1.2
    List<String> sortedRList = stringList.stream().sorted(Comparator.reverseOrder()).toList();
    System.out.println(sortedRList.toString());

    //2
    System.out.println("-----------------------------------------------------");
    List<Integer> integerList = Arrays.asList(122, 30, 41, 22, 43, 6, 73);
    List<String> newStringList = integerList.stream().map(Object::toString).toList();
    System.out.println(newStringList.toString());

    //3
    List<Cat> catList = Arrays.asList(

    );


  }
}
