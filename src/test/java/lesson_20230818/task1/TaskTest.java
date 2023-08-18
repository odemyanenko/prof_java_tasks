package lesson_20230818.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class TaskTest {
  private static final List<Integer> NUMBERS = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

  @Test
  void getEvenOddListPositiveCaseTest() {
    List<Integer> evenList = Arrays.asList(2, 4, 6, 8, 10);
    List<Integer> oddList = Arrays.asList(1, 3, 5, 7, 9);

    EvenAndOddLists excepted = new EvenAndOddLists(evenList, oddList);

    Assertions.assertEquals(excepted, Task.getEvenOddList(NUMBERS));
  }

  @Test
  void getEvenOddListNullParameterWithExceptionTest() {
    Assertions.assertThrows(IllegalArgumentException.class, () ->Task.getEvenOddList(null));
  }
}