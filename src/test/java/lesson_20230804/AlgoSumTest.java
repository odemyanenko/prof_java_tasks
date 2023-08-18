package lesson_20230804;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlgoSumTest {

  private final AlgoSum algoSum = new AlgoSum();

  @Test
  void shouldReturnSix() {
    int sum = algoSum.sum(new int[]{1, 2, 3});
    assertEquals(6, sum);
  }

  @Test
  void shouldReturnTen() {
    int sum = algoSum.sum(new int[]{1, 2, 7});
    assertEquals(10, sum);
  }

}