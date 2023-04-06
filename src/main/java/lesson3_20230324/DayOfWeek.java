package lesson3_20230324;

public enum DayOfWeek {
  MONDAY("Monday"),
  TUESDAY("Tuesday"),
  WEDNESDAY("Wednesday"),
  THURSDAY("Thuersday"),
  FRIDAY("Friday"),
  WEEKDAY("End Of week");

  private final String value;

  DayOfWeek(String s){
    this.value = s;
  }

  @Override
  public String toString() {
    return value;
  }
}
