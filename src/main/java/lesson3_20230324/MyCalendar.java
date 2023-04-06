package lesson3_20230324;

import java.util.Arrays;

public class MyCalendar {
  public static void main(String[] args) {
    DayOfWeek day = DayOfWeek.MONDAY;

    System.out.println(day);
    System.out.println("---------------------------");
    System.out.println(DayOfWeek.valueOf("MONDAY"));
    System.out.println("---------------------------");
    System.out.println(Arrays.toString(DayOfWeek.values()));
    System.out.println("---------------------------");
    morningGreating(day);
  }

  private static void morningGreating(DayOfWeek day) {
    switch (day) {
      case MONDAY -> System.out.println("Hard day");
      case TUESDAY -> System.out.println("Better");
      case WEDNESDAY -> System.out.println("Middle of the week");
      case THURSDAY -> System.out.println("Thursday greeting");
      case FRIDAY -> System.out.println("End of workweek greeting");
      case WEEKDAY -> System.out.println("Time To have rest");
    }
  }
}
