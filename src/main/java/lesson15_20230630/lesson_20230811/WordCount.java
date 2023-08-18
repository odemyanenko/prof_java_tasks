package lesson15_20230630.lesson_20230811;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount {
  public static void main(String[] args) {
    String sentence = "I love Java , although Java it is quite hard to learn.";
    System.out.println(getCountWords(sentence));
  }

  public static Map<String, Integer> getCountWords(String sentence) {
    if (sentence == null) {
      throw new IllegalArgumentException();
    }

    return Arrays.stream(sentence.split("[\\s\\p{Punct}]+"))
            .collect(Collectors.toMap(e -> e, e -> 1, Integer::sum));
  }
}
