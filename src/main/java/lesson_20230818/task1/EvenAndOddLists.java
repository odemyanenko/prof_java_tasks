package lesson_20230818.task1;

import java.util.List;
import java.util.Objects;

public class EvenAndOddLists {
  private final List<Integer> evenList;
  private final List<Integer> oddList;

  public EvenAndOddLists(List<Integer> eventList, List<Integer> oddList) {
    this.evenList = eventList;
    this.oddList = oddList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof EvenAndOddLists that)) return false;
    return evenList.equals(that.evenList) && oddList.equals(that.oddList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evenList, oddList);
  }

  @Override
  public String toString() {
    return "EvenAndOddLists{" +
            "eventList=" + evenList +
            ", oddList=" + oddList +
            '}';
  }
}
