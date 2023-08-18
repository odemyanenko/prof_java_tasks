package lesson_20230811;

import lesson15_20230630.lesson_20230811.WordCount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WordCountTest {

  private final String text = "I love Java, although Java it is quite hard to learn!";

  @Test
  void getCountWordJavaTest() {
    int expected = 2;
    Assertions.assertEquals(expected, WordCount.getCountWords(text).get("Java"));
  }

  @Test
  void getCountWordLearnTest() {
    int expected = 1;
    Assertions.assertEquals(expected, WordCount.getCountWords(text).get("learn"));
  }

  @Test
  void checkEmptyStringTest() {
    Assertions.assertNull(WordCount.getCountWords("").get("abc"));
  }

  @Test
  void checkNullStringTest() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> WordCount.getCountWords(null));
  }

  @Test
  void multipleSpacesTest() {
    Assertions.assertNull(WordCount.getCountWords("a  b").get(""));
  }

  @Test
  void checkPunctuationAbsenceTest() {
    int excepted = 1;
    Assertions.assertEquals(excepted, WordCount.getCountWords(text).get("learn"));
  }
}