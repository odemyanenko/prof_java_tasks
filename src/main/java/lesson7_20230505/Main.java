package lesson7_20230505;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    Stream<Integer> integerStream = list.stream();
    List<Integer> filteredList = integerStream.filter(i -> i % 2 == 0).toList();

    String words = "Mr. and Mrs. Dursley, of number four, Privet Drive, were proud to say\n" + "that they were perfectly normal, thank you very much. They were the last\n" + "people you'd expect to be involved in anything strange or mysterious,\n" + "because they just didn't hold with such nonsense.\n" + "Mr. Dursley was the director of a firm called Grunnings, which made\n" + "drills. He was a big, beefy man with hardly any neck, although he did\n" + "have a very large mustache. Mrs. Dursley was thin and blonde and had\n" + "nearly twice the usual amount of neck, which came in very useful as she\n" + "spent so much of her time craning over garden fences, spying on the\n" + "neighbors. The Dursleys had a small son called Dudley and in their\n" + "opinion there was no finer boy anywhere.\n" + "The Dursleys had everything they wanted, but they also had a secret, and\n" + "their greatest fear was that somebody would discover it. They didn't\n" + "think they could bear it if anyone found out about the Potters. Mrs.\n" + "Potter was Mrs. Dursley's sister, but they hadn't met for several years;\n" + "in fact, Mrs. Dursley pretended she didn't have a sister, because her\n" + "sister and her good-for-nothing husband were as unDursleyish as it was\n" + "possible to be. The Dursleys shuddered to think what the neighbors would\n" + "say if the Potters arrived in the street. The Dursleys knew that the\n" + "Potters had a small son, too, but they had never even seen him. This boy\n" + "was another good reason for keeping the Potters away; they didn't want\n" + "Dudley mixing with a child like that.\n" + "When Mr. and Mrs. Dursley woke up on the dull, gray Tuesday our story\n" + "starts, there was nothing about the cloudy sky outside to suggest that\n" + "strange and mysterious things would soon be happening all over the\n" + "country. Mr. Dursley hummed as he picked out his most boring tie for\n" + "work, and Mrs. Dursley gossiped away happily as she wrestled a screaming\n" + "Dudley into his high chair.\n" + "None of them noticed a large, tawny owl flutter past the window.\n" + "At half past eight, Mr. Dursley picked up his briefcase, pecked Mrs.\n" + "Dursley on the cheek, and tried to kiss Dudley good-bye but missed,";
    Map<String, Integer> dictionary = new TreeMap<>();
    String[] strings = words.split("\\W");

    task1(strings);
    task2(strings);
    task3(strings);
  }

  private static void task3(String[] text) {
    long count = Arrays.stream(text)
            .flatMap(e -> e.chars().mapToObj(value -> (char) value))
            .map(Character::toLowerCase)
            .distinct()
            .sorted()
            .count();
//            .forEach(System.out::print);
    System.out.println("Кол-во неповторяющихся букв: " + count);

  }

  private static void task2(String[] text) {
    long count = Arrays.stream(text)
            .distinct()
            .count();
    System.out.println("Кол-во неповторяющийхся слов: " + count);
  }

  private static void task1(String[] text){
    long count = Arrays.stream(text).count();
    System.out.println("Кол-во слов: " + count);
  }

}
