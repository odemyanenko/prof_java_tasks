package lesson_20230804;

import java.util.Arrays;

public class AlgoSum {
  public int sum(int[] array){
    return Arrays.stream(array).sum();
  }
}
