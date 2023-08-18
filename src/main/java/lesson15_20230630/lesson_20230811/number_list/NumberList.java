package lesson15_20230630.lesson_20230811.number_list;

import java.util.Arrays;
import java.util.Objects;

public class NumberList {
  private Number[] numbers;
  private int capacity;
  private int size;

  public NumberList(Number[] numbers, int capacity, int size) {
    this.numbers = numbers;
    this.capacity = capacity;
    this.size = size;
  }

  public Number[] getNumbers() {
    return numbers;
  }

  public int size() {
    return size;
  }

  public void add(Number number) {
    if (size == capacity) {
      return;
    }
    numbers[size] = number;
    size++;
  }

  public Number remove(int index) {
    if (index < 0 || index > size - 1) {
      throw new IllegalArgumentException();
    }
    Number result = numbers[index];
    numbers[index] = null;
    System.arraycopy(numbers, index + 1, numbers, index, capacity - size--);
    return result;
  }

  public Long sum() {
    return Arrays.stream(numbers)
            .filter(Objects::nonNull)
            .mapToLong(n -> (long) n)
            .sum();
  }
}
