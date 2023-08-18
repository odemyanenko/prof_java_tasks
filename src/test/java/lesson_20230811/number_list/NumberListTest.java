package lesson_20230811.number_list;

import lesson15_20230630.lesson_20230811.number_list.NumberList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Objects;

class NumberListTest {

  private NumberList myNumberList;
  private static final int NUMBER_LIST_CAPACITY = 10;
  private static final int SIZE = 5;

  @BeforeEach
  void setUp() {
    Integer[] intList = new Integer[]{1, 2, 3, 4, 5, null, null, null, null, null};
    myNumberList = new NumberList(intList, NUMBER_LIST_CAPACITY, SIZE);
  }

  @AfterEach
  void tearDown() {
    myNumberList = null;
  }

  @Test
  void add() {
    myNumberList.add(6);
    int expected = 6;

    long size = Arrays.stream(myNumberList.getNumbers())
            .filter(Objects::nonNull)
            .count();

    Assertions.assertEquals(6, size);
  }

  @Test
  void remove() {
    myNumberList.remove(3);
    Integer[] expected = new Integer[]{1, 2, 3, 5, null, null, null, null, null, null};
    Assertions.assertArrayEquals(expected, myNumberList.getNumbers());
  }

  @Test
  void removeSizeEqualsTest() {
    myNumberList.remove(3);
    long size = Arrays.stream(myNumberList.getNumbers())
            .filter(Objects::nonNull)
            .count();
    Assertions.assertEquals(4, size);
  }

  @Test
  void removeNegativeCaseSubZeroTest() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> myNumberList.remove(-1));
  }

  @Test
  void removeNegativeCaseAboveSizeTest() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> myNumberList.remove(7));
  }

  @Test
  void removeReturnNumberTest() {
    Assertions.assertEquals(4, myNumberList.remove(3));
  }

  @Test
  void sum() {
    Assertions.assertEquals(15L, myNumberList.sum());
  }

  @Test
  void size() {
    Assertions.assertEquals(5, myNumberList.size());
  }
}